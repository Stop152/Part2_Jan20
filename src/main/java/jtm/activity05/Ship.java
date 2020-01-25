package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	protected byte sails;

	public Ship(String id, byte sails) {
		super(id, 0, 0);
		this.sails = sails;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String move(Road road) {

		if (road.getClass() == Road.class) {
			return "Cannot sail on " + road.toString();
		} else {

//		if (getFuelInTank() >= getConsumption()*road.getDistance()/100) {
//			
//			fuelResult = getFuelInTank() - road.getDistance()*getConsumption()/100;
//		//String result = String.format("ID %s is moving on %s - %s, %d km", id, getFrom, getTo, distance);
			return getId() + " Ship is sailing on " + road.toString() + " with " + sails + " sails";
			
		}

	}

	// ID Ship is sailing on (Road as String) with x sails

}
