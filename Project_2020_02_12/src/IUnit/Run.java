package IUnit;

public class Run {

	public static void main(String[] args) {
		Tank tank = new Tank();
		SCV scv = new SCV();
		Marine marine = new Marine();
		
		
		tank.hitPoint = 1;
		marine.hitPoint = 1;
		scv.repair(tank);
		scv.repair(marine);
		
//		scv.repair(marine);

	}

}
