package com.kenhernando.boothibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.kenhernando.boothibernate.domain.Planet;

@Repository
@Transactional
public class PlanetDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void createPlanet(Planet planet) {
		try {
			entityManager.persist(planet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Planet retrievePlanetById(int id) {
		Planet planet = null;
		try {
			planet = (Planet) entityManager.find(Planet.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return planet;
	}
	
	public void updatePlanetById(int id) {
		try {
			entityManager.merge(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletePlanetById(int id) {
		try {
			entityManager.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
