public class Run {

	public static void main(String[] args) {
		
//		System.out.println(Car.number);
//		Car c = new Car();
//		
//		System.out.println(c.color+ ", " + c.gear+ ", " + c.door);
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(SerialNo)��: "+ p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(SerialNo)��: "+ p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(SerialNo)��: "+ p3.serialNo);
		System.out.println("��ü ����� ��ǰ�� ����: "+ Product.count+"�� �Դϴ�.");
		
	}
}
