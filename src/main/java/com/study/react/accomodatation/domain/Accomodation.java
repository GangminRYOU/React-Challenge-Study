package com.study.react.accomodatation.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Accomodation {
    @Id
    @Column(name = "accomodation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accomodationName;
    private Integer capacity;
    private Boolean parkable;
    @Embedded
    private Space space;
    @Embedded
    private Address address;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private Integer price;
    private AccomodationType accomodationType;

    @Builder
    public Accomodation(String accomodationName, Integer capacity, Boolean parkable, Space space, Address address,
        LocalDateTime checkInTime, LocalDateTime checkOutTime, Integer price, AccomodationType accomodationType) {
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
}
