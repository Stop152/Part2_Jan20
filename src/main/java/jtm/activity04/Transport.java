package jtm.activity04;

import java.util.Locale;

public class Transport {
	// Do not change access modifiers to encapsulate internal properties!
	
	private String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank
	
	/*- TODO #1
	 * Generate Constructor using Fields...
	 * which sets id, consumption, tankSize
	 * values of the newly created object
	 * And make fuel tank full.
	 */


	public Transport(String id, float consumption, int tankSize) {
		super();
		this.id = id;
		this.consumption = consumption;
		this.tankSize = tankSize;
		this.fuelInTank = tankSize;
		
	}	

	@Override
	public String toString() {
		String formated = String.format(Locale.US, "Id:%s cons:%.1fl/100km, tank:%dl, fuel:%.2fl", id,consumption,tankSize,fuelInTank);
		return formated;
		}

	/*- TODO #2
	 * Generate getters and Setters for consumption, tankSize, id, and fuelInTank fields
	 */

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getConsumption() {
		return consumption;
	}

	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public float getFuelInTank() {
		return fuelInTank;
	}

	public void setFuelInTank(float fuelInTank) {
		this.fuelInTank = fuelInTank;
	}

	/*- TODO #3
	 * Generate toString()...
	 * and implement this method, that t returns String in form:
	 *
	 * where ID and numbers are actual numbers of the transport
	 * HINT: use String.format(Locale.US, "%.2f", float) to limit shown numbers
	 * to 2 decimal for fractions, and dot as a decimal delimiter.
	 */

	


	
	// Return transport id and type as string e.g. "AAA Transport"
		// HINT: use this.getClass().getSimpleName(); to get type of transport
		protected final String getType() {				
			
			return id + " " + this.getClass().getSimpleName();
		}			
			
	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask
		
	public String move(Road road) {
		
		//float distanceThis = road.getDistance();
		if (fuelInTank >= consumption*road.getDistance()/100) {
			fuelInTank = fuelInTank - road.getDistance()*consumption/100;
		//String result = String.format("ID %s is moving on %s - %s, %d km", id, getFrom, getTo, distance);
			return getType() + " is moving on " + road.toString();
		}
		else {			
			
		// TODO If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on From–To, 180km"
		// TODO If there is no enough fuel in tank, return string in form:
		// "Cannot move on From–To, 180km. Necessary
		// fuel:0.00l, fuel in tank:0.00l"
			
		return String.format(Locale.US, "Cannot move on " + road.toString() + ". Necessary fuel:%.2fl, fuel in tank:%.2fl", road.getDistance()*consumption/100, fuelInTank);
	}
	}

}
