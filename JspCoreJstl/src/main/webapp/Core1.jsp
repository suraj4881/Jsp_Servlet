<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Welcome JSTL APP </title>
</head>
<body>

  <c:set scope="page" var="x" value="10" />
  <c:set scope="page" var="y" value="20"/>
  <c:set scope="page" var="z" value="${x+y}"/>
  
  <h1 style='color:blue; text-align: center;'>
   The sum of::<c:out value="${z}"/>
  </h1>

  <c:remove var="x"/>
  <c:remove var="y"/>
  <c:remove var="z"/>
  
  
  <h1 style='color:red; text-align: center;'>
  The sum of::<c:out value="${z}" default="1000"/>
   </h1>


</body>
</html>