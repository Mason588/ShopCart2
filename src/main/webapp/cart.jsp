<%@page import ="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>

<%@page import = "Entity.Cart"%>    
<%@page import = "Entity.CartItem"%>
<%@page import = "Entity.Product"%>
<%@page import = "java.util.*"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>購物車</title>
</head>
<body>

<%   Cart cart=(Cart)request.getSession().getAttribute("cart");
     if(cart==null) {
 %>
	<p>沒買東西</p>
	<%
     }
     else{
     HashMap<String, CartItem> cartItems=cart.getCarItems();
     double total=cart.getToal();
     %>
     <h1><font color ="blue">你的購物清單 : </font></h1><br>
     <%
     Set<String> keys=cartItems.keySet();
     Iterator<String> iter = keys.iterator();
     while(iter.hasNext()){
     String key= iter.next();
     CartItem cartItem=cartItems.get(key);
     Product product=cartItem.getProduct();
     out.print(product.getName()+"   ") ;
     out.println("數量:"+cartItem.getBuyNum()+"     ");
     out.println("價格 : "+product.getPrice()+"元") ;
     };
     %>
   <br>
    <%
    out.print("               總共:"+total+"$");
    }
    %>
		

</body>
</html>