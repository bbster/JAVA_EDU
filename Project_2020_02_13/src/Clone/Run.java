package Clone;

public class Run {

	public static void main(String[] args) {
		Point original = new Point(4,5);
		Point copy = (Point)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		
		Circle originalC = new Circle(copy, 5);
		Circle copyC = (Circle)originalC.clone();
		
		System.out.println(originalC);
		System.out.println(copyC);

	}

}
