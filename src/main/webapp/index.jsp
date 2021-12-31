<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>購物商城首頁</title>
</head>
<body>
	請選擇你想買的商品 : <br>
	<form action = "<%=request.getContextPath() %>/zzz" method ="post">
	果然我的青春戀愛喜劇搞錯了(13)($120)	
	<input name="Product" type="radio" value="001" checked="checked"> <br>
	<img src="/img/Fruit.jpg" height=100> <br>
	第二神拳($100) 
	<input name="Product" type="radio" value="002"><br>
	<img src="/img/Punch.jpg" height=100> <br>
    珍珠奶茶($50)
    <input name="Product" type="radio" value="003"><br>
    <img src="/img/MilkTea.jpg" height=100> <br> 
    請輸入數量: 
    <input name="number" type="number"><br>
    <input type="submit" value="確認">
    </form>
	    
	</form>
</body>
</html>