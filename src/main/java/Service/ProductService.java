package Service;

import java.util.HashMap;

import Entity.CartItem;
import Entity.Product;

public class ProductService {
	private HashMap<String, CartItem> cartItems = new HashMap <String, CartItem>();
	
	public ProductService() {
		  	CartItem cartltem1=new CartItem();
		    CartItem cartltem2=new CartItem();
		    CartItem cartltem3=new CartItem();
		    Product product1=new Product("001","果然我的青春戀愛喜劇搞錯了13",120);
		    Product product2=new Product("002","第二神拳",100);
		    Product product3=new Product("003","珍珠奶茶",50);
		    cartltem1.setProduct(product1);
		    cartltem2.setProduct(product2);
		    cartltem3.setProduct(product3);
			cartItems.put("001",cartltem1);
			cartItems.put("002", cartltem2);
			cartItems.put("003", cartltem3);
	}
	
	public Product findProductbtpid(String pid) 
	{
		CartItem cartItem = cartItems.get(pid);
		Product product = cartItem.getProduct();
		return product;
	}
	

}
