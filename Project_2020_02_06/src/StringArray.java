import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		String[] names = {"kims", "yong", "kook"};
		char ch;
		
		ch = names[0].charAt(3);
		System.out.println(ch);
		
		int i = names[1].length();
		System.out.println(i);
		
		String temp = names[1].substring(1,3);
		System.out.println(temp);
		
		if(names[2].equals("yi"))
			System.out.println("Same");
		else
			System.out.println("different");
		
		char[] ch1 = new char[5];
		ch1 = names[0].toCharArray();
		
		for(int j=0; j<ch1.length; j++)
			System.out.printf("%c", ch1[j]);
	}
}
