package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {
	
	private int weight;
	private String[] backpack;

	public Martian(int weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.backpack = new String[10];
	}
	
	public Martian() {
		this(42);
	}
	@Override
	public String killHimself() {
		// TODO Auto-generated method stub	
			return "I AM IMMORTAL!";
		}
		

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}
	
	
	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		return backpack;
	}

	@Override
	public void addToBackpack(String item) {
		// TODO Auto-generated method stub
		for (int i = 0; i < backpack.length; i++) {
			if (backpack[i] == null) {
				backpack[i] = item;
				break; // lai tikai vienu reizi pieliek vienu "item"
			}
		}

	}
			


	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
				
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		
		if (humanoid.isAlive().equals("Alive")) {
			humanoid.killHimself();
			this.weight = weight + humanoid.getWeight();
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stu
		return LEG_COUNT;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return "I AM IMMORTAL!";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Martian m = new Martian(weight);
	//	m.setArmCount(this.getArmCount());
	//    m.setLegCount(this.getLegCount());
	//    m.setWeight(weight);
	    return m;

	}

	private void setLegCount(int legCount) {
		// TODO Auto-generated method stub
		legCount = 7;
	}

	private void setArmCount(int armCount) {
		// TODO Auto-generated method stub
		armCount = 2;
	}

}
