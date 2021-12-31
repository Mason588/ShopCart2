package Entity;

import java.util.HashMap;

public class Cart {
	//購物車中添加的商品
	private HashMap<String, CartItem> cartItems = new HashMap<String,CartItem>();
	//總計
	private double total;
	
	public HashMap<String, CartItem> getCarItems() {
		return cartItems;
	}
	
	public void setCarItems(HashMap<String, CartItem> cartItems)  {
		this.cartItems = cartItems;
	}
	
	public double getToal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
}
