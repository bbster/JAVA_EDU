package Outer;

public class Outer {
	int value = 10;
	
	class Inner{
		int value = 20;
		void method() {
			int value = 30;
			System.out.println("value : " + value);
			System.out.println("this.value : " + this.value);
			System.out.println("Oute.this.value : " + Outer.this.value);
		}
	}

}
