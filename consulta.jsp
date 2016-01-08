<%@ page language="java" contentType="text/html; charset=utf-8"
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
		
			<c:if test="${numberList == 1}">
				<!-- Init Matches list -->
				<!-- Init row -->
				<div class="row">
					<div class="col-sm-5 col-xs-5 col-md-5"></div>
					<div class="col-sm-2 col-xs-2 col-md-2">
						<h1 class="text-success text-center">
							<u><i>Partidas</i></u>
						</h1>
					</div>
					<div class="col-sm-5 col-xs-5 col-md-5"></div>
				</div>
				<!-- End row -->

				<hr />
				<!-- Init row -->
				<div class="row-fluid">
					<div class="col-sm-5 text-info">
						<h2 class="text-center text-capitalize">Raphael</h2>
					</div>
					<div class="col-sm-2">
						<h2 class="text-center text-capitalize">5 X 0</h2>
					</div>
					<div class="col-sm-5 center text-info">
						<h2 class="text-center text-capitalize">Bruno Colla</h2>
					</div>
				</div>
				<!-- End row -->

				<!-- Init Accordion -->
				<div class="accordion" id="accordion1">
					<!-- Init Accordion-Group -->
					<div class="accordion-group">
						<!-- Init Accordion-Heading -->
						<div class="accordion-heading">
							<!-- Init row -->
							<div class="row">
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
								<div class="col-sm-2 col-xs-2 col-md-2 text-center">
									<button class="accordion-toggle" data-toggle="collapse"
										data-parent="#accordion1" href="#collapse1">Estatísticas</button>
								</div>
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
							</div>
							<!-- End row -->
						</div>
						<!-- End Accordion-Heading -->

						<!-- Init Accordion-Body -->
						<div id="collapse1" class="accordion-body collapse row">
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Barcelona</i>
									</h3>
								</div>

								<div class="col-sm-2 col-xs-2 col-md-2">
									<h3 class="text-center text-primary">
										<i>Amistoso</i>
									</h3>
								</div>

								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Real Madrid</i>
									</h3>
								</div>
							</div>
							<!-- End row-fluid -->
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th>Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>5</td>
													<td>67%</td>
													<td>3</td>
													<td>78</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th class="haha">Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>2</td>
													<td>33%</td>
													<td>3</td>
													<td>78</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
							</div>
							<!-- End row-fluid -->
						</div>
						<!-- End Accordion-Body -->
					</div>
					<!-- End Accordion-Group -->
				</div>
				<!-- End Accordion -->
				<hr />
				<hr />
				<!-- Init row -->
				<div class="row-fluid">
					<div class="col-sm-5 text-info">
						<h2 class="text-center text-capitalize">Vlad</h2>
					</div>
					<div class="col-sm-2">
						<h2 class="text-center text-capitalize">0 X 0</h2>
					</div>
					<div class="col-sm-5 center text-info">
						<h2 class="text-center text-capitalize">Lucas Colla</h2>
					</div>
				</div>
				<!-- End row -->
				<!-- Init Accordion -->
				<div class="accordion" id="accordion2">
					<!-- Init Accordion-Group -->
					<div class="accordion-group">
						<!-- Init Accordion-Heading -->
						<div class="accordion-heading">
							<!-- Init row -->
							<div class="row">
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
								<div class="col-sm-2 col-xs-2 col-md-2 text-center">
									<button class="accordion-toggle" data-toggle="collapse"
										data-parent="#accordion2" href="#collapse2">Estatísticas</button>
								</div>
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
							</div>
							<!-- End row -->
						</div>
						<!-- End Accordion-Heading -->

						<!-- Init Accordion-Body -->
						<div id="collapse2" class="accordion-body collapse row">
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Barcelona</i>
									</h3>
								</div>

								<div class="col-sm-2 col-xs-2 col-md-2">
									<h3 class="text-center text-primary">
										<i>Amistoso</i>
									</h3>
								</div>

								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Real Madrid</i>
									</h3>
								</div>
							</div>
							<!-- End row-fluid -->
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th>Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>2</td>
													<td>55%</td>
													<td>3</td>
													<td>73</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th class="haha">Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>2</td>
													<td>45%</td>
													<td>3</td>
													<td>78</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
							</div>
							<!-- End row-fluid -->
						</div>
						<!-- End Accordion-Body -->
					</div>
					<!-- End Accordion-Group -->
				</div>
				<!-- End Accordion -->
				<hr />
				<hr />
				<!-- Init row -->
				<div class="row-fluid">
					<div class="col-sm-5 text-info">
						<h2 class="text-center text-capitalize">Gesiel</h2>
					</div>
					<div class="col-sm-2">
						<h2 class="text-center text-capitalize">1 X 1</h2>
					</div>
					<div class="col-sm-5 center text-info">
						<h2 class="text-center text-capitalize">Edu</h2>
					</div>
				</div>
				<!-- End row -->
				<!-- Init Accordion -->
				<div class="accordion" id="accordion3">
					<!-- Init Accordion-Group -->
					<div class="accordion-group">
						<!-- Init Accordion-Heading -->
						<div class="accordion-heading">
							<!-- Init row -->
							<div class="row">
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
								<div class="col-sm-2 col-xs-2 col-md-2 text-center">
									<button class="accordion-toggle" data-toggle="collapse"
										data-parent="#accordion3" href="#collapse3">Estatísticas</button>
								</div>
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
							</div>
							<!-- End row -->
						</div>
						<!-- End Accordion-Heading -->

						<!-- Init Accordion-Body -->
						<div id="collapse3" class="accordion-body collapse row">
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Barcelona</i>
									</h3>
								</div>

								<div class="col-sm-2 col-xs-2 col-md-2">
									<h3 class="text-center text-primary">
										<i>Amistoso</i>
									</h3>
								</div>

								<div class="col-sm-5 col-xs-5 col-md-5">
									<h3 class="text-center">
										Time: <i class="text-success text-capitalize">Real Madrid</i>
									</h3>
								</div>
							</div>
							<!-- End row-fluid -->
							<!-- Init row-fluid -->
							<div class="row-fluid">
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th>Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>2</td>
													<td>55%</td>
													<td>3</td>
													<td>73</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
								<div class="col-sm-6 col-xs-6 col-md-6">
									<div class="table-hover table-responsive">
										<!-- Init table -->
										<table class="table table-bordered table-hover">
											<thead>
												<tr class="info text-center">
													<th class="haha">Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>5</td>
													<td>2</td>
													<td>45%</td>
													<td>3</td>
													<td>78</td>
												</tr>
											</tbody>
										</table>
										<!-- End Table -->
									</div>
								</div>
							</div>
							<!-- End row-fluid -->
						</div>
						<!-- End Accordion-Body -->
					</div>
					<!-- End Accordion-Group -->
				</div>
				<!-- End Accordion -->
				<hr />
				<!-- End Matches list -->
			</c:if>
			<c:if test="${numberList == 2}">
			<!-- Init Players/Leagues/Matches-type list -->
				<h3>${tipoLista}</h3>
				<div class="row">
					<div class="col-sm-5 col-xs-5 col-md-5">
						<div class="table-hover table-responsive">
							<!-- Init table -->
							<table class="table table-bordered table-hover">
								<thead>
									<tr class="info">
										<th>Código</th>
										<th>Nome</th>
										<c:if test="${tipoLista} == 'Times'">
											<th>${lista.liga.nome}</th>
										</c:if>
									</tr>
								</thead>
								<c:forEach var="lista" items="${listaOutros}">
									<tbody>
										<tr class="success text-left">
											<td>${lista.codigo}</td>
											<td>${lista.nome}</td>
											<c:if test="${tipoLista} == 'Times'">
											<td>${lista.liga.nome}</td>
											</c:if>
										</tr>
									</tbody>
								</c:forEach>
							</table>
							<!-- End Table -->
						</div>
					</div>
				</div>
				<!-- End Players/Leagues/Matches-type list -->
			</c:if>
	</div>
	<!-- End container -->
	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>
</body>
</html>