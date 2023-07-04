<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Welcome JSTL APP </title>
</head>
<body>

  <c:set scope="page" value="10" var="x" />
  <c:if test="${x eq 10 }" var="y" scope="application">
  <h1 style='color:green; text-align: center;'>
  X value is not equal 10
  </h1>
  </c:if>
  
  <h1 style='color:blue; text-align: center;'>
		X value is :: ${x }<br/>
		Test Result is :: ${y }
	</h1>
	
	
</body>
</html>