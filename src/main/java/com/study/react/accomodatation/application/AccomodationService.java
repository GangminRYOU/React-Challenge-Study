package com.study.react.accomodatation.application;

import org.springframework.stereotype.Service;

import com.study.react.accomodatation.dao.AccomodationRepository;
import com.study.react.accomodatation.domain.Accomodation;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccomodationService {

    private final AccomodationRepository accomodationRepository;

    public Long saveAccomodation(Accomodation accomodation){
        return accomodationRepository.save(accomodation).getId();
    }

    public Accomodation findAccomodation(Long id){
        return accomodationRepository.findByIdOrElseThrow(id);
    }

    public void deleteAccomodation(Long id){
        accomodationRepository.deleteById(id);
    }
}
