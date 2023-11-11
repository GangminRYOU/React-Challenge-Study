package com.study.react.accomodatation.domain;

import javax.persistence.Embeddable;

import com.study.react.accomodatation.dto.in.SpaceDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Space {
    private Integer roomNumber;
    private Integer bedNumber;
    private Integer bathRoomNumber;

    @Builder
    public Space(Integer roomNumber, Integer bedNumber, Integer bathRoomNumber) {
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.bathRoomNumber = bathRoomNumber;
    }

    public SpaceDto toDto(){
        return SpaceDto.builder()
            .roomNumber(this.roomNumber)
            .bedNumber(this.bedNumber)
            .bathRoomNumber(this.bathRoomNumber)
            .build();
    }
}
