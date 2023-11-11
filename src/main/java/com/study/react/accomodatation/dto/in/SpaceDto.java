package com.study.react.accomodatation.dto.in;

import com.study.react.accomodatation.domain.Space;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SpaceDto {
    private Integer roomNumber;
    private Integer bedNumber;
    private Integer bathRoomNumber;

    @Builder
    public SpaceDto(Integer roomNumber, Integer bedNumber, Integer bathRoomNumber) {
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.bathRoomNumber = bathRoomNumber;
    }

    public Space toSpace(){
        return Space.builder()
            .roomNumber(this.roomNumber)
            .bedNumber(this.bedNumber)
            .bathRoomNumber(this.bathRoomNumber)
            .build();
    }
}
