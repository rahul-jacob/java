package com.xyz.java.optional.lesson06;

import java.util.Optional;

public class DisplayFeatures {
	
	private String size;
	
	private Optional<ScreenResolution> screenResolution;

	public DisplayFeatures(String size,
			Optional<ScreenResolution> screenResolution) {
		super();
		this.size = size;
		this.screenResolution = screenResolution;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Optional<ScreenResolution> getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(Optional<ScreenResolution> screenResolution) {
		this.screenResolution = screenResolution;
	}
	
	
}
