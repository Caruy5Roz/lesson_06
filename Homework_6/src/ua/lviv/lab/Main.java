package ua.lviv.lab;

public class Main {

	public static void main(String[] args) {
		
		Su27 su = new Su27(22, 12, 16380, 2500, "gray");
		
		// �) ��������� ������� �����
		System.out.println("�� ��������� ������� ����������: " + su.startEngines() + " ��.");
		System.out.println();
		
		// �) ��������� ���� �����
		System.out.println("˳��� � ������ ����� �����: " + su.aircraftTakeoff() + " �.");
		System.out.println();
		
		// �) �������� ����� ,����, ����, ������
		su.up();
		su.down();
		su.left();
		su.right();
		System.out.println();
		
		// �) �������� ��������� �����
		su.stealthTechnology();
		System.out.println();
		
		// �) ��������� ������� ����
		su.nuclearStrike();
		System.out.println();
		
		// �) �������� ���������������� � �����
		su.turboAcceleration();
		System.out.println();
		
		// �) ��������� ������� �����
		su.aircraftLanding();
	
	
	}

}
