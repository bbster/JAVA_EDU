package IUnit;

public class Tank extends GroundUnit implements Repairable{
	
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

}
