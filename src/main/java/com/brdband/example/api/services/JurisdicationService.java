package com.brdband.example.api.services;

import com.brdband.example.api.models.CircleJurisdication;

public interface JurisdicationService {

    public void createJurisdication(CircleJurisdication circleJurisdication);

    public CircleJurisdication findCircleJurisdicationById(Long circleId);

    public CircleJurisdication findCircleJurisdicationByName(String circleName);

    public Boolean isZipcodeMappedWithCircle(String zipCode, String circleName);

    public Boolean isZipcodeMappedWithCircle(String zipCode, Long circleId);


}
