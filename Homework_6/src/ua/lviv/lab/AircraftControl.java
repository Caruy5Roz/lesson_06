package ua.lviv.lab;

public class AircraftControl {
	
	int a = 0; 
    int b = 25;
	
	public int moveUp() {
		 int distance = a + (int) (Math.random() * b);
		 return distance;
	}
	
	public int moveDown() {
		 int distance = a + (int) (Math.random() * b);
		 return distance;
	}
	
	public int moveLeft() {
		 int distance = a + (int) (Math.random() * b);
		 return distance;
	}
	
	public int moveRight() {
		 int distance = a + (int) (Math.random() * b);
		 return distance;
	}

}
