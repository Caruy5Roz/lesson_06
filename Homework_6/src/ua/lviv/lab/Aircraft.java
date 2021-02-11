package ua.lviv.lab;

public abstract class Aircraft {
	
	private double length;
	private double width;
	private double weight;
	
	public Aircraft(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	
	public abstract int startEngines();
	
	
	public abstract int aircraftTakeoff();
	
	public abstract void aircraftLanding();

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Aircraft [length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	public void stealthTechnology() {
		// TODO Auto-generated method stub
		
	}

	public void nuclearStrike() {
		// TODO Auto-generated method stub
		
	}

	public void turboAcceleration() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
