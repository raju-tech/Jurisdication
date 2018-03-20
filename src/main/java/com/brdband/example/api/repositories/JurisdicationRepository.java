package com.brdband.example.api.repositories;

import com.brdband.example.api.models.CircleJurisdication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface JurisdicationRepository extends CrudRepository< CircleJurisdication, Long> {


    CircleJurisdication findByCircleName(String circleName);

    CircleJurisdication findByCircleId(Long circleId);

    Boolean existsByZipCodeAndCircleId(String zipCode, Long circleId);

    Boolean existsByZipCodeAndCircleName(String zipCode, String circleName);



}
