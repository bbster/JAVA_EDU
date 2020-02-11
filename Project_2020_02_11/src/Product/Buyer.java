package Product;

public class Buyer extends Product{

	Buyer(int price) {
		super(price);
	}

	int money = 1000;
	int bonusPoint = 0;
	int i=0;
	Product[] cart = new Product[10];
	
	
	void buy(Product p) {

		
		if(p instanceof Audio){
			money -= p.price;
			bonusPoint += p.bonusPoint;
					
		}
		else if (p instanceof Computer) {
			money -= p.price;
			bonusPoint =+ p.bonusPoint;
		}
		else if (p instanceof Tv) {
			money -= p.price;
			bonusPoint += p.bonusPoint;
		}
		cart[i++]=p;
	}
	
	void showMoney() {
		System.out.println(money+" "+bonusPoint);
	}
	
	void showCart() {
		for(int i=0; i<cart.length; i++) {
			Product pc = cart[i];
			if(pc == null)break;
			System.out.println(pc.toString());
		}
	}
}
