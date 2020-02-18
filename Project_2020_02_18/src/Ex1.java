import java.time.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime nowTime = LocalTime.now();
		LocalTime editTime = nowTime.plusHours(2);
		
		System.out.println(nowTime);
		System.out.println(editTime);

	}

}
