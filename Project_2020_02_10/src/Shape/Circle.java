package Shape;

public class Circle extends Shape{
	
	Point center;
	int redius;
	
	Circle(){
		this(new Point(0,0), 100);
	}
	
	Circle(Point center, int redius){
		this.center = center;
		this.redius = redius;
	}

}
