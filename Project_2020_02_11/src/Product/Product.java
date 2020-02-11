package Product;

public class Product {
	int price=100;
	int bonusPoint=10;
	
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
		
	}

}
