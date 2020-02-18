import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int min = time.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(min);
		
		int hour = time.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hour);
		
		long min3 = time.getLong(ChronoField.MICRO_OF_SECOND);
		System.out.println(min3);

	}
}
