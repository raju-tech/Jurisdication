package com.brdband.example.api;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.services.JurisdicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = JurisdicatApplication.class)
public class JurisdicatApplicationTests {

	@Autowired
	JurisdicationService jurisdicationServiceImpl;

	@Test
	public void contextLoads() {
		assertTrue("~~~~~~~~~~~~~~~~~~~~~~~Running Integration Test", true);
	}

	@Test
	public void shouldCreateCircle(){
		CircleJurisdication circleJurisdication = new CircleJurisdication("600100", "Chennai");

		jurisdicationServiceImpl.createJurisdication(circleJurisdication);

		Long circleId = circleJurisdication.getCircleId();

		CircleJurisdication circleJurisdication1 = jurisdicationServiceImpl.findCircleJurisdicationById(circleId);

		assertThat(circleJurisdication.getCircleName()).isEqualTo(circleJurisdication1.getCircleName());

	}


}
