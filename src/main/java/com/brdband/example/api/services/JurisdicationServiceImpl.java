package com.brdband.example.api.services;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.repositories.JurisdicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JurisdicationServiceImpl implements JurisdicationService {

    @Autowired
    JurisdicationRepository jurisdicationRepository;

    @Override
    public void createJurisdication(CircleJurisdication circleJurisdication) {
        jurisdicationRepository.save(circleJurisdication);
    }

    @Override
    public CircleJurisdication findCircleJurisdicationById(Long circleId) {
        return jurisdicationRepository.findByCircleId(circleId);
    }

    @Override
    public CircleJurisdication findCircleJurisdicationByName(String circleName) {
        return jurisdicationRepository.findByCircleName(circleName);
    }

    @Override
    public Boolean isZipcodeMappedWithCircle(String zipCode, String circleName) {
        return jurisdicationRepository.existsByZipCodeAndCircleName(zipCode,circleName);
    }

    @Override
    public Boolean isZipcodeMappedWithCircle(String zipCode, Long circleId) {
        return jurisdicationRepository.existsByZipCodeAndCircleId(zipCode,circleId);
    }
}
