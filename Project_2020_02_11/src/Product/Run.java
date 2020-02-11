package Product;

public class Run {

	public static void main(String[] args) {
		
		Buyer b = new Buyer(0);
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio au = new Audio();
		
		b.buy(tv);
		b.showMoney();
		b.buy(com);
		b.showMoney();
		b.buy(au);
		b.showMoney();
		b.buy(com);
		b.showMoney();
		
		b.showCart();
	}

}
