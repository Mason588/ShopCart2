package Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Cart;
import Entity.CartItem;
import Entity.Product;
import Service.ProductService;

@WebServlet(name= "productServlet", urlPatterns = "{/productServlet}")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		  ProductService productService = new ProductService();
			
			
			String pid=(String)req.getParameter("Product");
			int buyNum=Integer.parseInt(req.getParameter("number"));
			HttpSession session=req.getSession();
			Cart cart=(Cart)session.getAttribute("cart");
			if(cart==null) {
				cart=new Cart();
			}
			CartItem cartItem=new CartItem();
			cartItem.setBuyNum(buyNum);
		   
			Product product=productService.findProductbtpid(pid);
			cartItem.setProduct(product);
			double subTotal=product.getPrice() * buyNum;
			cartItem.setSubTotal(subTotal);
			
			HashMap<String, CartItem> cartItems=cart.getCarItems();
			double newSubTotal=0;
			if(cartItems.containsKey(pid)) {
				CartItem item=cartItems.get(pid);
				
				int oldBuyNum= item.getBuyNum();
				oldBuyNum=oldBuyNum+buyNum;
				item.setBuyNum(oldBuyNum);
				
				double oldSubTotal= item.getSubTotal();
				 newSubTotal=buyNum*product.getPrice();
				 oldSubTotal=oldSubTotal+newSubTotal;
				 item.setSubTotal(oldSubTotal);
			}
			else {
				cartItems.put(pid, cartItem); 
				newSubTotal=buyNum*product.getPrice();
			}
			 double total=cart.getToal()+newSubTotal;
			 cart.setTotal(total);
			 cart.setCarItems(cartItems);
			 session.setAttribute("cart", cart);
			 req.getRequestDispatcher("cart.jsp").forward(req, resp);	
		}
	     
	   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductService productService = new ProductService();
		
		
		String pid=(String)req.getParameter("Product");
		int buyNum=Integer.parseInt(req.getParameter("number"));
		HttpSession session=req.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		if(cart==null) {
			cart=new Cart();
		}
		CartItem cartItem=new CartItem();
		cartItem.setBuyNum(buyNum);
	   
		Product product=productService.findProductbtpid(pid);
		cartItem.setProduct(product);
		double subTotal=product.getPrice() * buyNum;
		cartItem.setSubTotal(subTotal);
		
		HashMap<String, CartItem> cartItems=cart.getCarItems();
		double newSubTotal=0;
		if(cartItems.containsKey(pid)) {
			CartItem item=cartItems.get(pid);
			
			int oldBuyNum= item.getBuyNum();
			oldBuyNum=oldBuyNum+buyNum;
			item.setBuyNum(oldBuyNum);
			
			double oldSubTotal= item.getSubTotal();
			 newSubTotal=buyNum*product.getPrice();
			 oldSubTotal=oldSubTotal+newSubTotal;
			 item.setSubTotal(oldSubTotal);
		}
		else {
			cartItems.put(pid, cartItem); 
			newSubTotal=buyNum*product.getPrice();
		}
		 double total=cart.getToal()+newSubTotal;
		 cart.setTotal(total);
		 cart.setCarItems(cartItems);
		 session.setAttribute("cart", cart);
		 req.getRequestDispatcher("cart.jsp").forward(req, resp);	
	}
     

}
