<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>�ʪ��ӫ�����</title>
</head>
<body>
	�п�ܧA�Q�R���ӫ~ : <br>
	<form action = "<%=request.getContextPath() %>/zzz" method ="post">
	�G�M�ڪ��C�K�ʷR�߼@�d���F(13)($120)	
	<input name="Product" type="radio" value="001" checked="checked"> <br>
	<img src="/img/Fruit.jpg" height=100> <br>
	�ĤG����($100) 
	<input name="Product" type="radio" value="002"><br>
	<img src="/img/Punch.jpg" height=100> <br>
    �ï]����($50)
    <input name="Product" type="radio" value="003"><br>
    <img src="/img/MilkTea.jpg" height=100> <br> 
    �п�J�ƶq: 
    <input name="number" type="number"><br>
    <input type="submit" value="�T�{">
    </form>
	    
	</form>
</body>
</html>