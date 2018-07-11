package com.xyz.java.optional.lesson06;

import java.util.Optional;

public class Mobile {
	
	private long id;
	
	private String brand;
	
	private String name;
	
	private Optional<DisplayFeatures> displayFeature;

	public Mobile(long id, String brand, String name,
			Optional<DisplayFeatures> displayFeature) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeature = displayFeature;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public Optional<DisplayFeatures> getDisplayFeature() {
		return displayFeature;
	}
	
	

}
