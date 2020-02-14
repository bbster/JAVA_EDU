package Calendar;
import java.util.*;

public class Ex10_1 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
		System.out.println("월: " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇째주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 해의 몇째달: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이달의 몇일: " + today.get(Calendar.DATE));
		System.out.println("이달의 몇월: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이해의 몇일: " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("이해의 몇일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전 오후: " + today.get(Calendar.AM_PM));
		
		//System.out.println("시간: " + today.get(Calendar.HOUR));whffu졸려\\
		
		System.out.println("시간: " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: " + today.get(Calendar.MINUTE));
		System.out.println("초: " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초: " + today.get(Calendar.MILLISECOND));
		
		System.out.println("timezone: " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		
		System.out.println("이달의 마지막 날: " + today.get(Calendar.DATE));
				
	}

}
