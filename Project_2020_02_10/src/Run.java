public class Run {

	public static void main(String[] args) {
		
//		System.out.println(Car.number);
//		Car c = new Car();
//		
//		System.out.println(c.color+ ", " + c.gear+ ", " + c.door);
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(SerialNo)는: "+ p1.serialNo);
		System.out.println("p2의 제품번호(SerialNo)는: "+ p2.serialNo);
		System.out.println("p3의 제품번호(SerialNo)는: "+ p3.serialNo);
		System.out.println("전체 생산된 제품의 수는: "+ Product.count+"개 입니다.");
		
	}
}
