package com.brdband.example.api;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.repositories.JurisdicationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JurisdicationRepositoryIntegTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JurisdicationRepository jurisdicationRepository;

    @Test
    public void testFindbyCircleName() {

        CircleJurisdication circleJurisdication = new CircleJurisdication("600100", "Chennai");

        entityManager.persist(circleJurisdication);
        entityManager.flush();

        CircleJurisdication circleJurisdication1 = jurisdicationRepository.findByCircleName(circleJurisdication.getCircleName());

        assertThat(circleJurisdication1.getCircleName()).isEqualTo(circleJurisdication.getCircleName());


    }

    @Test
    public void testFindByCircleId() {
        CircleJurisdication circleJurisdication = new CircleJurisdication("600100", "Chennai");

        entityManager.persist(circleJurisdication);
        entityManager.flush();

        CircleJurisdication circleJurisdication1 = jurisdicationRepository.findByCircleId(circleJurisdication.getCircleId());

        assertThat(circleJurisdication1.getCircleId()).isEqualTo(circleJurisdication.getCircleId());
    }

    @Test
    public void testGivenZipCodeIsAvailableInGivenCircle() {
        CircleJurisdication circleJurisdication = new CircleJurisdication("600100", "Chennai");
        entityManager.persist(circleJurisdication);
        entityManager.flush();

        Boolean expectedFlag = true;
        Long lng = circleJurisdication.getCircleId();
        System.out.println(lng);
        Boolean actualFlag = jurisdicationRepository.existsByZipCodeAndCircleId("600100", circleJurisdication.getCircleId());
        assertThat(expectedFlag).isEqualTo(actualFlag);
        assertTrue("*******************************Running Unit Test", true);
    }


}
