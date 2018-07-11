package com.xyz.java.optional.lesson06;

import java.util.Optional;

public class MobileService {
	
	/* Here we can observe that how clean our getMobileScreenWidth() API without null checks and boiler plate code.
	   We don not worry about NullPointerExceptions at run-time.*/
	
	public Integer getMobileScreenWidth(Optional<Mobile> mobileObj){
		return mobileObj.flatMap(Mobile::getDisplayFeature).flatMap(DisplayFeatures::getScreenResolution)
		.map(ScreenResolution::getWidth).orElse(0);
	}
	
}
