package ua.lviv.lab;

public class Main {

	public static void main(String[] args) {
		
		Su27 su = new Su27(22, 12, 16380, 2500, "gray");
		
		// А) Запускаємо двигуни літака
		System.out.println("До готовності взлетіти залишилось: " + su.startEngines() + " хв.");
		System.out.println();
		
		// Б) Проводимо взліт літака
		System.out.println("Літак з повним баком проїде: " + su.aircraftTakeoff() + " м.");
		System.out.println();
		
		// В) Рухаємось вверх ,вліво, вниз, вправо
		su.up();
		su.down();
		su.left();
		su.right();
		System.out.println();
		
		// Г) Включаємо технологію стелс
		su.stealthTechnology();
		System.out.println();
		
		// Д) Проводимо ядерний удар
		su.nuclearStrike();
		System.out.println();
		
		// Е) Включаємо турбоприскорення і тікаємо
		su.turboAcceleration();
		System.out.println();
		
		// Є) Проводимо посадку літака
		su.aircraftLanding();
	
	
	}

}
