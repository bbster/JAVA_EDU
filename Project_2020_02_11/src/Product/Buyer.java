package Product;

import java.util.Vector;

public class Buyer extends Product{

	Buyer(int price) {
		super(price);
	}

	int money = 1000;
	int bonusPoint = 0;
	Vector cart = new Vector();
//	int i=0;
//	Product[] cart = new Product[10];
	
	
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
		
//		cart[i++]=p;
		cart.add(p);
	}
	
	void showMoney() {
		System.out.println(money+" "+bonusPoint);
	}
	
	void showCart() {
		int sum = 0;
		String cartList = "";
		
		if(cart.isEmpty()) {
			System.out.println("구매한 내역이 없습니다.");
			return;
		}
//		for(int i=0; i<cart.length; i++) {
//			Product pc = cart[i];
//			if(pc == null)break;
//			System.out.println(pc.toString());
		for(int i=0;i<cart.size();i++) {
			Product pc = (Product)(cart.get(i));
			sum += pc.price;
			cartList += (i==0)?""+ pc.toString():", "+ pc.toString();
			System.out.println(pc.toString());
		}
		
		System.out.println(sum);
		System.out.print("구입하신 물품은: "+cartList);
	}
	
	void returnProduct(Product p) {
		
		if(p instanceof Audio){
			money += p.price;
			bonusPoint -= p.bonusPoint;
					
		}
		else if (p instanceof Computer) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
		}
		else if (p instanceof Tv) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
		}
		
		cart.remove(p);
		}
	}

