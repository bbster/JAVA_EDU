import java.text.*;

public class MessageFormatFix {

	public static void main(String[] args) {
		
		String pattern = "Name: {0} Tel: {1}, Age: {2}, Birthday:{3}";
		
		Object[][] argument = {{"김자바", "02-123-4567", "27", "07-09"},	
							{"이지찬", "010-2923-3977", "29", "01-26"},
							{"홍길동", "010-1234-1234", "12", "12-12"}};		
		
		String[] result = new String[3];
		
		for(int i=0; i< argument.length; i++) {
			result[i] = MessageFormat.format(pattern, argument[i]);
			System.out.println(result[i]);	
		}
	}
}
