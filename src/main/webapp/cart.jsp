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
<title>�ʪ���</title>
</head>
<body>

<%   Cart cart=(Cart)request.getSession().getAttribute("cart");
     if(cart==null) {
 %>
	<p>�S�R�F��</p>
	<%
     }
     else{
     HashMap<String, CartItem> cartItems=cart.getCarItems();
     double total=cart.getToal();
     %>
     <h1><font color ="blue">�A���ʪ��M�� : </font></h1><br>
     <%
     Set<String> keys=cartItems.keySet();
     Iterator<String> iter = keys.iterator();
     while(iter.hasNext()){
     String key= iter.next();
     CartItem cartItem=cartItems.get(key);
     Product product=cartItem.getProduct();
     out.print(product.getName()+"   ") ;
     out.println("�ƶq:"+cartItem.getBuyNum()+"     ");
     out.println("���� : "+product.getPrice()+"��") ;
     };
     %>
   <br>
    <%
    out.print("               �`�@:"+total+"$");
    }
    %>
		

</body>
</html>