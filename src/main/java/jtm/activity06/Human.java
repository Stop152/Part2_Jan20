package jtm.activity06;

public class Human implements Humanoid {
	private int weight;
	private boolean alive;
	private String[] backpack;

	public Human(int weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.alive = true;
		this.backpack = new String[10];
	}

	public Human() {
		this(42);
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub

		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public String killHimself() {
		if (this.alive == true) {
			this.alive = false;
			return "Dead";
		}
		return null;
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {

		// TODO Auto-generated method stub

		return this.backpack;
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
	public String isAlive() {
		// TODO Auto-generated method stub
		if (this.alive == true) {
			return "Alive";
		} else {
			return "Dead";
		}
	}
}
