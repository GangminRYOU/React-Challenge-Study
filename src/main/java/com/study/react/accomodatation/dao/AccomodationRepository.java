package com.study.react.accomodatation.dao;

import java.util.NoSuchElementException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.react.accomodatation.domain.Accomodation;

public interface AccomodationRepository extends JpaRepository<Accomodation, Long> {
    default Accomodation findByIdOrElseThrow(Long id){
       return findById(id)
           .orElseThrow(() -> new NoSuchElementException("No entity found matching such id"));
    }
}
