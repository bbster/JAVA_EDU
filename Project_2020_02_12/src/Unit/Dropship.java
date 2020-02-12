package Unit;

public class Dropship extends Unit{
	
	void move(int x, int y) {
		System.out.println("Dropship.move(" + x + ", " + y + ")");
	}
	
	void load() {
		System.out.println("Dropship.load()");
	}
	
	void unLoad() {
		System.out.println("Dropship.unoad()");
	}

}
