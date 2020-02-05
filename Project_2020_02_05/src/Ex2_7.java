
public class Ex2_7 {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + " ");  //  덧셈 연산자 진행먼저 되어서 14 
		System.out.println(" "+ 7 + 7);  // 연산자 진행시 문자형 " " 인하여 7이 문자형으로 인식되어 77
		

	}

}
