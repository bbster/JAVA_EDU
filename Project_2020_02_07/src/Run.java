public class Run {

	public static void main(String[] args) {
		
//		 Tv tv = new Tv();
//		 Tv tv1 = new Tv();
//		
//		System.out.println(tv.power);
//		System.out.println(tv.channel);	
//		tv.channel = 3;
//		System.out.println(tv.channel);
//	
//		tv.channelup();
//		System.out.println(tv.channel);
//		System.out.printf("-----------%n");
//		
//		
//		System.out.println(tv1.channel);
//		tv1 = tv;
//		System.out.println(tv1.channel);
		
		//-----------------------------------------------------------------------------//
//		CardTest.java
		
//		CardTest c1 = new CardTest();
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		CardTest c2 = new CardTest();
//		c2.kind =  "spade";
//		c2.number = 4;
//		
//		System.out.println("c1는 " + c1.kind +" " + c1.number + "이며 좌우폭은 " + c1.width + "이며, 높이는" + c1.height + "이다" );
//		System.out.println("c2는 " + c2.kind +" " + c2.number + "이며 좌우폭은 " + c2.width + "이며, 높이는" + c2.height + "이다" );
//		
//		c1.width = 30;
//		c2.height = 40;
//		System.out.println("c1는 " + c1.kind +" " + c1.number + "이며 좌우폭은 " + c1.width + "이며, 높이는" + c1.height + "이다" );
//		System.out.println("c2는 " + c2.kind +" " + c2.number + "이며 좌우폭은 " + c2.width + "이며, 높이는" + c2.height + "이다" );
//
//	
//  Data.java
		
//		Data d = new Data();
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d);
//		System.out.println("after change: " + d.x);
//	}
//	
//	static void change(Data t) {
//		t.x = 1000;
//		System.out.println("change x:" + t.x);
		
//		Data1, Data2.java
//		Data1 d1 = new Data1();
//		Data1 d4 = new Data1(10);
//		Data2 d2 = new Data2();
//		Data2 d3 = new Data2(10);
//		
//		System.out.println(d1.value);
//		System.out.println(d2.value);
//		System.out.println(d3.value);
//		System.out.println(d4.value);
		
		Car car1 = new Car();
		
		System.out.println(car1.color);
		System.out.println(car1.gearType);
		System.out.println(car1.door);
		
		Car car2 = new Car("white", "Auto", 4);
		
		System.out.println(car2.color);
		System.out.println(car2.gearType);
		System.out.println(car2.door);	
	}
}
