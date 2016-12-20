package com.kenhernando.boothibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenhernando.boothibernate.dao.PlanetDao;
import com.kenhernando.boothibernate.domain.Planet;

@Service
public class PlanetService {

	@Autowired
	private PlanetDao planetDao;
	
	/*
	 * Method used for Junit:
	 */
	public String retrievePlanetMars() {
		return "Mars";
	}

	public void createPlanet(Planet planet) {
		planetDao.createPlanet(planet);
	}

	public Planet retrievePlanetById(int id) {
		return planetDao.retrievePlanetById(id);
	}

	public void updatePlanetById(int id) {
		planetDao.updatePlanetById(id);
	}

	public void deletePlanetById(int id) {
		planetDao.deletePlanetById(id);
	}
}
