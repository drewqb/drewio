package com.frantz.samples;

public class CarFactory {
	 public static ICar buildCar() {
	        return new Car1(new Engine1());
	    }
}
