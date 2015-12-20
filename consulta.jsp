<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="resources/imports/bootstrap/css-bootstrap.jsp"%>
<%@ include file="resources/imports/jstl/jstl.jsp"%>

<title></title>
</head>
<body>
	<!-- Init Container -->
	<div class="container">
		<!-- Menu -->
		<c:import url="resources/imports/menu/menu.jsp"></c:import>

		<!-- Init row -->
		<div class="row">
			<div class="col-sm-5">
				<h2 class="text-center">
					Raphael - <i class="text-primary">Barcelona</i>
				</h2>
			</div>
			<div class="col-sm-2">
				<h2 class="text-center">2 X 1</h2>
			</div>
			<div class="col-sm-5 center">
				<h2 class="text-center">
					Gesiel - <i class="text-primary">REAL MADRID</i>
				</h2>
			</div>
		</div>
		<!-- End row -->
		<div class="row">
			<div class="col-sm-6">
				<h3 class="text-center text-success">
					<i>Vitória</i>
				</h3>
			</div>
			<div class="col-sm-6">
				<h3 class="text-center text-danger">
					<i>Derrota</i>
				</h3>
			</div>
		</div>
		<!-- End row -->

		<div class="accordion" id="accordion2">

			<div class="accordion-group">
				<div class="accordion-heading">
					<a class="accordion-toggle" data-toggle="collapse"
						data-parent="#accordion2" href="#collapseTwo">
						<button>Estatísticas</button>
					</a>
				</div>
				<br />
				<div id="collapseTwo" class="accordion-body collapse">
					<div class="row">
						<div class="col-sm-6 col-xs-6 col-md-6">
							<div class="table-hover table-responsive">
								<table class="table table-bordered table-hover">
									<thead>
										<tr>
											<th>Finalizações</th>
											<th>Finalizações no gol</th>
											<th>Posse de bola</th>
											<th>Faltas cometidas</th>
											<th>Precisão no passe</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>5</td>
											<td>2</td>
											<td>45%</td>
											<td>3</td>
											<td>78</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-sm-6 col-xs-6 col-md-6">
							<div class="table-hover table-responsive">
								<table class="table table-bordered table-hover">
									<thead>
										<tr>
											<th>Finalizações</th>
											<th>Finalizações no gol</th>
											<th>Posse de bola</th>
											<th>Faltas cometidas</th>
											<th>Precisão no passe</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>5</td>
											<td>2</td>
											<td>45%</td>
											<td>3</td>
											<td>78</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- End row -->
	</div>
	<!-- End container -->
	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>
</body>
</html>