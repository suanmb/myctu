<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>����ԭ��Open Closed Principle(OCP)</title>
</head>
<body>
	<%@ page language="java"  import="principle.ocp.*"%>
	<%
			PriceCutGirlShoe a=new PriceCutGirlShoe("��ܽ��","a-b",160);
			out.println("Ь��Ϊ"+a.getValue());
	%>
</body>
</html>