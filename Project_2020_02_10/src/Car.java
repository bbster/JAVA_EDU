
public class Car {
	
	String color;
	String gear;
	int door;
	
	static int number;
	
	Car(){  // 매개변수 없는 생성자
//		this("white", "Auto", 4);
		 
	}
	
	Car(String color, String gear, int door){  // 매개변수 있는 생성자
		
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
