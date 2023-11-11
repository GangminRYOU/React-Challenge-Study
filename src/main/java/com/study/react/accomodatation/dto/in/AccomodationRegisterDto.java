package com.study.react.accomodatation.dto.in;

import java.time.LocalDateTime;
import com.study.react.accomodatation.domain.Accomodation;
import com.study.react.accomodatation.domain.AccomodationType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccomodationRegisterDto {
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
    public AccomodationRegisterDto(String accomodationName, Integer capacity, Boolean parkable, SpaceDto space,
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

    public Accomodation toAccomodation(){
        return Accomodation.builder()
            .accomodationName(this.accomodationName)
            .capacity(this.capacity)
            .parkable(this.parkable)
            .space(this.space.toSpace())
            .address(this.address.toAddress())
            .checkInTime(this.checkInTime)
            .checkOutTime(this.checkOutTime)
            .price(this.price)
            .accomodationType(this.accomodationType)
            .build();
    }
}
