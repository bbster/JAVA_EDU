
public class Car {
	
	String color;
	String gear;
	int door;
	
	static int number;
	
	Car(){  // �Ű����� ���� ������
//		this("white", "Auto", 4);
		 
	}
	
	Car(String color, String gear, int door){  // �Ű����� �ִ� ������
		
		this.color = color;
		this.gear = gear;
		this.door = door;
		
	}
	
	{
		color = "Black";
		gear = "Stick";
		door = 4;
		
	}
	
	static {
		number = 100;
	}

}
