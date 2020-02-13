package Clone;

public class Circle implements Cloneable{
	
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public String toString() {
		return p.toString()+", r =" + r;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x+1, this.p.y+1);
		
		return obj;
	}
}
