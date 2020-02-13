package Outer;

public class Run {

	public static void main(String[] args) {
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
		
		inner.method();

	}

}
