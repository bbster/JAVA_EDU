package Unit;

import java.util.Vector;

public class Run {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		marine.move(100, 100);
		marine.stimPack();
		
		tank.move(200, 200);
		tank.changeMode();
		
		dropship.move(300, 300);
		dropship.load();
		dropship.move(150, 150);
		dropship.unLoad();
		
		marine.stop();
		tank.stop();
		dropship.stop();
		
		

	}

}
