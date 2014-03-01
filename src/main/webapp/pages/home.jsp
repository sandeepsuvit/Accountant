<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<%@include file='templates/header-file-includes.jsp'%>
</head>
<body>
	<%@include file='templates/top-navigation-bar.jsp'%>
	<div class="container padding-top-15 padding-bottom-15">
		<div class="row">
			<%@include file='templates/main-navigation-menu.jsp'%>
			<div class="col-md-9 bg-color-white padding-top-15 padding-bottom-15 height-100">
				<c:if test="${!empty usersList}">
				    <table class="table">
				        <tr>
				            <th>First name</th>
				            <th>Last name</th>
				            <th>Email</th>
				        </tr>
				 
				        <c:forEach items="${usersList}" var="user">
				        <tr>
				            <td><c:out value="${user.userFname}" /></td>
				            <td><c:out value="${user.userLname}" /></td>
				            <td><c:out value="${user.userEmail}" /></td>
				        </tr>
				        </c:forEach>
				    </table>
				</c:if>
			
			</div>
		</div>
	</div>
	<!-- /container -->
	
	<%@include file='templates/footer-content.jsp'%>
	
	<%@include file='templates/footer-file-includes.jsp'%>
</body>
</html>