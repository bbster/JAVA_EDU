package Inner;

public class Run {

	public static void main(String[] args) {
		System.out.println("InstanceInner.CONST: " + InnerEx1.InstanceInner.CONST);
//		System.out.println(InnerEx1.StaticInner.iv);
		System.out.println("StaticInner.CONST: " + InnerEx1.StaticInner.CONST);
		System.out.println("StaticInner.cv: " + InnerEx1.StaticInner.cv);
		
		InnerEx1 e = new InnerEx1();
		InnerEx1.InstanceInner ie = e.new InstanceInner();
		
		System.out.println("ie.iv: " + ie.iv);
		e.myMethod();

	}

}
