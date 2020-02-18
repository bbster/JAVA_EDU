import java.time.LocalDate;

import java.time.chrono.JapaneseDate;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate kDate = LocalDate.of(1984,  12, 31);
		JapaneseDate jDate = JapaneseDate.of(1994,  1, 31);
		
		
		System.out.println(kDate.equals(jDate));
		System.out.println(kDate.isEqual(jDate));
		

	}

}
