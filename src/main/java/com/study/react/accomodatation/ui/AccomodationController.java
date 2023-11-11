package com.study.react.accomodatation.ui;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.react.accomodatation.application.AccomodationService;
import com.study.react.accomodatation.dto.in.AccomodationRegisterDto;
import com.study.react.accomodatation.dto.out.AccomodationResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/accomodation")
@RequiredArgsConstructor
public class AccomodationController {
    private final AccomodationService accomodationService;

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody AccomodationRegisterDto accomodationRegisterDto){
        return ResponseEntity.created(
            URI.create("/accomodation/" + accomodationService.saveAccomodation(accomodationRegisterDto.toAccomodation()))
        ).build();
    }

    @GetMapping("/{accomodationId}")
    public ResponseEntity<AccomodationResponseDto> readOne(@PathVariable Long accomodationId){
        return ResponseEntity
            .ok(
                AccomodationResponseDto
                    .from(accomodationService.findAccomodation(accomodationId))
            );
    }

    @DeleteMapping("/{accomodationId}")
    public ResponseEntity<Void> deleteOne(@PathVariable Long accomodationId){
        accomodationService.deleteAccomodation(accomodationId);
        return ResponseEntity.noContent().build();
    }
}
