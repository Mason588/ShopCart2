package Entity;

import java.util.HashMap;

public class Cart {
	//�ʪ������K�[���ӫ~
	private HashMap<String, CartItem> cartItems = new HashMap<String,CartItem>();
	//�`�p
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
