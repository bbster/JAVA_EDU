
public class Test {
	public static void main(String[] args) {
		Card c = new Card();
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(cObj);
		
		Class cObj1 = Card.class;
		System.out.println(cObj1);
		
		String className = cObj.getName();
		System.out.println(className);
		
		try {
		Class cObj2 = Class.forName("card");
		System.out.println(cObj2);
		}catch(Exception e) {
		}
		
		
	}

}
