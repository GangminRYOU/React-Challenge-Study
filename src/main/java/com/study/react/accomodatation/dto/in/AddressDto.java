package com.study.react.accomodatation.dto.in;

import com.study.react.accomodatation.domain.Address;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AddressDto {
    private String streetAddress;
    private Double longitude;
    private Double latitude;

    @Builder
    public AddressDto(String streetAddress, Double longitude, Double latitude) {
        this.streetAddress = streetAddress;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Address toAddress(){
        return Address.builder()
            .streetAddress(this.streetAddress)
            .longitude(this.longitude)
            .latitude(this.latitude)
            .build();
    }
}
