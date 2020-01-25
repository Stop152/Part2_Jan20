package jtm.activity05;

import java.util.Locale;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {

	protected int wheels;

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}

	// ID Vehicle is driving on (Road as String) with x wheels

	@Override
	public String move(Road road) {

		if (road.getClass() == Road.class) {

			if (getFuelInTank() >= getConsumption() * road.getDistance() / 100) {

				this.setFuelInTank(getFuelInTank() - road.getDistance() * getConsumption() / 100);
				return getId() + " Vehicle is driving on " + road.toString() + " with " + wheels + " wheels";
			} else {
				return String.format(Locale.US,
						"Cannot move on " + road.toString() + ". Necessary fuel:%.2fl, fuel in tank:%.2fl",
						road.getDistance() * getConsumption() / 100, getFuelInTank());
				// Necessary fuel:%.2fl, fuel in tank:%.2fl",
				// road.getDistance()*getConsumption()/100, fuelResult);
			}

		} else {
			return "Cannot drive on " + road.toString();

		}

	}

}
