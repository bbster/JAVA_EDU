
public class Array {
	
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i< arr.length; i++)
			arr[i] = (int)(Math.random()*10)+1;
	}
}
