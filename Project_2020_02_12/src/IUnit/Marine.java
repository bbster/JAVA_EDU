package IUnit;

public class Marine extends GroundUnit implements Repairable{
	
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}
