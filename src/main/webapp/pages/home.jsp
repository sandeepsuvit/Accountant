<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app>
<head>
<%@include file='templates/header-file-includes.jsp'%>
<title>Accountant - Dashboard</title>
</head>
<body>
	<%@include file='templates/top-navigation-bar.jsp'%>
	<div
		class="container padding-top-15 padding-bottom-15 content-area remove-top-margin">
		<div class="row">
			<%@include file='templates/main-navigation-menu.jsp'%>
			<div
				class="col-md-9 bg-color-white padding-top-15 padding-bottom-15 height-100">
				<h3>Dashboard</h3>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type and scrambled it to make a type specimen book. </p>
				
				<div ng-controller="getListOfAllEmployees">
					<table style="width: 100%;" ng-show="employees.length > 0"	class="table table-hover">
						<thead>
							<tr class="table-header-color">
								<th>First name</th>
								<th>Last name</th>
								<th>Email</th>
								<th>DOB</th>
								<th>Created on</th>
								<th>Last accessed on</th>
								<th>Last accessed IP</th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="employee in employees">
								<td>{{employee.empFname}}</td>
								<td>{{employee.empLname}}</td>
								<td>{{employee.empEmail}}</td>
								<td>{{employee.empDob}}</td>
								<td>{{employee.empCreatedOn}}</td>
								<td>{{employee.empLastAccess}}</td>
								<td>{{employee.empLastAccessIp}}</td>
							</tr>
						</tbody>
					</table>
				
				</div>	
					
				<%-- <c:if test="${!empty usersList}">
					<div class="table-responsive">
						<table class="table table-hover">
							<tr class="table-header-color">
								<th>First name</th>
								<th>Last name</th>
								<th>Email</th>
								<th>DOB</th>
								<th>Created on</th>
								<th>Last accessed on</th>
								<th>Last accessed IP</th>
							</tr>

							<c:forEach items="${usersList}" var="user">
								<tr>
									<td><c:out value="${user.empFname}" /></td>
									<td><c:out value="${user.empLname}" /></td>
									<td><c:out value="${user.empEmail}" /></td>
									<td><c:out value="${user.empDob}" /></td>
									<td><c:out value="${user.empCreatedOn}" /></td>
									<td><c:out value="${user.empLastAccess}" /></td>
									<td><c:out value="${user.empLastAccessIp}" /></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</c:if> --%>

			</div>
		</div>
	</div>
	<!-- /container -->

	<%@include file='templates/footer-content.jsp'%>

	<%@include file='templates/footer-file-includes.jsp'%>
</body>
</html>