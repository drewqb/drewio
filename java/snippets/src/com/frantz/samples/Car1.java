package com.frantz.samples;

public class Car1 implements ICar{
	 private IEngine engine;
	 public Car1(IEngine e)
	 {
		 engine =e;
	 }
	@Override
	public float getSpeed() {
		return engine.getEngineRotation();
	}

	@Override
	public void setPedalPressure(float PEDAL_PRESSURE) {
		engine.setFuelConsumptionRate(PEDAL_PRESSURE);
	}

}
