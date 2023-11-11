package com.study.react.accomodatation.dto.out;

import java.time.LocalDateTime;

import com.study.react.accomodatation.domain.Accomodation;
import com.study.react.accomodatation.domain.AccomodationType;
import com.study.react.accomodatation.dto.in.AddressDto;
import com.study.react.accomodatation.dto.in.SpaceDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccomodationResponseDto {
    private String accomodationName;
    private Integer capacity;
    private Boolean parkable;
    private SpaceDto space;
    private AddressDto address;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private Integer price;
    private AccomodationType accomodationType;

    @Builder
    public AccomodationResponseDto(String accomodationName, Integer capacity, Boolean parkable, SpaceDto space,
        AddressDto address, LocalDateTime checkInTime, LocalDateTime checkOutTime, Integer price,
        AccomodationType accomodationType) {
        this.accomodationName = accomodationName;
        this.capacity = capacity;
        this.parkable = parkable;
        this.space = space;
        this.address = address;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.price = price;
        this.accomodationType = accomodationType;
    }

    public static AccomodationResponseDto from(Accomodation accomodation){
        return AccomodationResponseDto.builder()
            .accomodationName(accomodation.getAccomodationName())
            .capacity(accomodation.getCapacity())
            .parkable(accomodation.getParkable())
            .space(accomodation.getSpace().toDto())
            .address(accomodation.getAddress().toDto())
            .checkInTime(accomodation.getCheckInTime())
            .checkOutTime(accomodation.getCheckOutTime())
            .price(accomodation.getPrice())
            .accomodationType(accomodation.getAccomodationType())
            .build();
    }
}
