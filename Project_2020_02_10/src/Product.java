public class Product {
	
	static int count;
	int serialNo;
	
	static{
		count = 200;
	}
	
	{
		++count; 
		serialNo = count;
	}
	
	public Product() {};

}
