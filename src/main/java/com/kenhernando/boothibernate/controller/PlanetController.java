package com.kenhernando.boothibernate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kenhernando.boothibernate.domain.Planet;
import com.kenhernando.boothibernate.service.PlanetService;

@RestController
public class PlanetController {
	
	final static Logger logger = LoggerFactory.getLogger(PlanetController.class);
	
    @Autowired
    private PlanetService planetService;
	
	@RequestMapping("/")
	public String home() {
		logger.debug("Hello Gradle Earth!");
		return "Hello Gradle Earth!";
	}

	@RequestMapping(value = "/mars", method = RequestMethod.GET)
	public String mars() {
		String planet = planetService.retrievePlanetMars();
		return "Hello Gradle " + planet + "!";
	}
	
	@RequestMapping(value = "/createPlanet", method = RequestMethod.GET)
	public String createPlanet() {
		Planet planet = new Planet();
		planet.setName("Pluto");
		planet.setHabitable(false);
		planetService.createPlanet(planet);
		return "Successfully created a Planet!";
	}
	
	@RequestMapping(value = "/planet/{id}", method = RequestMethod.GET)
	public String retrievePlanet(@PathVariable("id") int id) {
		Planet planet = planetService.retrievePlanetById(id);
		return "Hello Gradle " + planet.getName() + "!";
	}
	
	@RequestMapping(value = "/deletePlanet/{id}", method = RequestMethod.GET)
	public String updatePlanet(@PathVariable("id") int id) {
		planetService.updatePlanetById(id);
		return "Planet has been deleted.";
	}
	
	@RequestMapping(value = "/deletePlanet/{id}", method = RequestMethod.GET)
	public String deletePlanet(@PathVariable("id") int id) {
		planetService.deletePlanetById(id);
		return "Planet has been deleted.";
	}

}