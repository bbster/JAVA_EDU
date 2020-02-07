public class Run {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		System.out.println(tv.power);
		System.out.println(tv.channel);
		
		tv.channel = 3;
		System.out.println(tv.channel);
		
		tv.channelup();
		System.out.println(tv.channel);
	}
}
