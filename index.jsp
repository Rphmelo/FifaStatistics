<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="resources/imports/bootstrap/css-bootstrap.jsp"%>
<%@ include file="resources/imports/jstl/jstl.jsp"%>

<title>Home</title>
</head>
<body>
	<!-- Init Container -->
	<div class="container">
	<!-- Menu -->
		<c:import url="resources/imports/menu/menu.jsp"></c:import>
		<div class="img-responsive text-center">
		<img class="center " width="510" height="253"  src="resources/images/fifa.jpg"/> <br/><br/>
		 </div>

		<!-- Init row -->
		<div class="row">

			<!-- Init col-sm-4 -->
			<div class="col-sm-4">
				<img src="resources/images/fifa-james.jpg"/>
			</div>
			<!-- End col-sm-4 -->
			<!-- Init col-sm-4 -->
			<div class="col-sm-4">
				<img src="resources/images/fifa-defense.jpg"/>
			</div>
			<div class="col-sm-4">
				<img src="resources/images/fifa-cr7.jpg"/>
			</div>
			<!-- End col-sm-4 -->
		</div>
		<!-- End row -->
	</div>
	<!-- End container -->

<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>

</body>
</html>


















