package com.kenhernando.boothibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "planets")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String name;
	
	@NotNull
	private boolean isHabitable;

	public Planet() {
	};

	public Planet(int id, String name, boolean isHabitable) {
		super();
		this.id = id;
		this.name = name;
		this.isHabitable = isHabitable;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHabitable() {
		return isHabitable;
	}

	public void setHabitable(boolean isHabitable) {
		this.isHabitable = isHabitable;
	}
}
