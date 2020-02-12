package Unit;

public class Tank extends Unit{
	
	void move(int x, int y) {
		System.out.println("Tank.move(" + x + ", " + y + ")");
	}

	void changeMode() {
		System.out.println("Tank.changeMode()");
	}

}
