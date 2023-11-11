package com.study.react.accomodatation.domain;

import javax.persistence.Embeddable;

import com.study.react.accomodatation.dto.in.AddressDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {
    private String streetAddress;
    private Double longitude;
    private Double latitude;

    @Builder
    public Address(String streetAddress, Double longitude, Double latitude) {
        this.streetAddress = streetAddress;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public AddressDto toDto(){
        return AddressDto.builder()
            .streetAddress(this.streetAddress)
            .longitude(this.longitude)
            .latitude(this.latitude)
            .build();
    }
}
