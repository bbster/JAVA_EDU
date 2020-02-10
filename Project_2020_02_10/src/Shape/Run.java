package Shape;

public class Run {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(150, 150), 50);
		
		Point[] p = {new Point(100, 100),
					new Point(140, 50),
					new Point(200, 100)
		};
		Triangle t1 = new Triangle(p);
		
		System.out.println(c1.color + c1.redius);
		System.out.println(c2.color + c2.redius);
		
		System.out.println(t1.color);

	}

}
