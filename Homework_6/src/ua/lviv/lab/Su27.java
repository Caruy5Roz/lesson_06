package ua.lviv.lab;


public class Su27 extends Aircraft implements AircraftCapabilities{

	private int maxspeed;
	private String color;
	private AircraftControl aircraftControls = new AircraftControl();

	public Su27(double length, double width, double weight, int maxspeed, String color) {
		super(length, width, weight);
		this.maxspeed = maxspeed;
		this.color = color;
	}
	
	public void up() {
		System.out.println("Рухаємось вверх на: " + aircraftControls.moveUp() + " метрів.");
	}
	
	public void down() {
		System.out.println("Рухаємось вниз на: " + aircraftControls.moveDown() + " метрів.");
	}
	
	public void left() {
		System.out.println("Рухаємось вліво на: " + aircraftControls.moveLeft() + " метрів.");
	}
	
	public void right() {
		System.out.println("Рухаємось вправо на: " + aircraftControls.moveRight() + " метрів.");
	}
	

	@Override
	public void turboAcceleration() {
		int x = 2500;
		int y = 3000;
		int axelerator = x + (int) (Math.random() * y);
		System.out.println("Турбо-прискорення літака: " + axelerator + " км/год.");
	}

	@Override
	public void stealthTechnology() {
		int x1 = 0;
		int y1 = 30;
		int invisibility = x1 + (int) (Math.random() * y1);
		System.out.println("Літака не видно протягом: " + invisibility+ " хв.");
	}

	
	@Override
	public void nuclearStrike() {
		int x2 = 0;
		int y2 = 10;
		int warheads = x2 + (int) (Math.random() * y2);
		System.out.println("Літака скине: " + warheads + " боєголовок.");
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Su27 [maxspeed=" + maxspeed + ", color=" + color + "]";
	}
	
	int a1 = 20;
	int b1 = 88;
	@Override
	public int startEngines() {
		int time = a1 + (int) (Math.random() * b1);
		 return time;
	}

	int a2 = 0;
	int b2 = 1000;
	@Override
	public int aircraftTakeoff() {
		int km = a2 + (int) (Math.random() * b2);
		 return km;
	}

	@Override
	public void aircraftLanding() {
		System.out.println("Літак іде на посадку!");
	}

}
