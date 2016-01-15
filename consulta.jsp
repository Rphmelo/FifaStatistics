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
			<%int i = 1; %>
			<c:forEach var="partida" items="${listaPartida}">	
				<hr />
				<!-- Init row -->
				<div class="row-fluid">
					<div class="col-sm-5 text-info">
						<h3 class="text-center text-capitalize">${partida.casa.estatistica.jogador.nome}</h3>
					</div>
					<div class="col-sm-2">
						<h3 class="text-center text-capitalize">${partida.casa.estatistica.gols}
							X ${partida.visitante.estatistica.gols}</h3>
					</div>
					<div class="col-sm-5 center text-info">
						<h3 class="text-center text-capitalize">${partida.visitante.estatistica.jogador.nome}</h3>
					</div>
				</div>
				<!-- End row -->

				<!-- Init Accordion -->
				<div class="accordion" id="accordion<%=i%>">
					<!-- Init Accordion-Group -->
					<div class="accordion-group">
						<!-- Init Accordion-Heading -->
						<div class="accordion-heading">
							<!-- Init row -->
							<div class="row">
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
								<div class="col-sm-2 col-xs-2 col-md-2 text-center">
									<button class="accordion-toggle" data-toggle="collapse"
										data-parent="#accordion<%=i%>" href="#collapse<%=i%>">Estatísticas</button>
								</div>
								<div class="col-sm-5 col-xs-5 col-md-5"></div>
							</div>
							<!-- End row -->
						</div>
						<!-- End Accordion-Heading -->

						<!-- Init Accordion-Body -->
						<div id="collapse<%=i%>" class="accordion-body collapse row">
							<!-- Init row-fluid -->
							
								<div class="col-sm-5 col-xs-5 col-md-5">
									<h4 class="text-center">
										Time: <i class="text-success text-capitalize">${partida.casa.estatistica.time.nome}</i>
									</h4>
								</div>
								<div class="col-sm-2 col-xs-2 col-md-2">
									<h4 class="text-center text-primary text-capitalize">
										<i>${partida.tipo_partida.nome}</i>
									</h4>
								</div>
								<div class="col-sm-5 col-xs-5 col-md-5">
									<h4 class="text-center">
										Time: <i class="text-success text-capitalize">${partida.visitante.estatistica.time.nome}</i>
									</h4>
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
													<td>${partida.casa.estatistica.finalizacao}</td>
													<td>${partida.casa.estatistica.finalizacaoCerta}</td>
													<td>${partida.casa.estatistica.posseDeBola}%</td>
													<td>${partida.casa.estatistica.faltasCometidas}</td>
													<td>${partida.casa.estatistica.precisaoPasse}%</td>
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
													<th>Finalizações</th>
													<th>Finalizações no gol</th>
													<th>Posse de bola</th>
													<th>Faltas cometidas</th>
													<th>Precisão no passe</th>
												</tr>
											</thead>
											<tbody>
												<tr class="success text-center">
													<td>${partida.visitante.estatistica.finalizacao}</td>
													<td>${partida.visitante.estatistica.finalizacaoCerta}</td>
													<td>${partida.visitante.estatistica.posseDeBola}%</td>
													<td>${partida.visitante.estatistica.faltasCometidas}</td>
													<td>${partida.visitante.estatistica.precisaoPasse}%</td>
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
				<%i++; %>
			</c:forEach>
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
								</tr>
							</thead>
							<c:forEach var="lista" items="${listaOutros}">
								<tbody>
									<tr class="success text-left">
										<td>${lista.codigo}</td>
										<td>${lista.nome}</td>
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

		<c:if test="${numberList == 3}">
			<!-- Init Teams list -->
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
									<th>Liga</th>
								</tr>
							</thead>
							<c:forEach var="lista" items="${listaTime}">
								<tbody>
									<tr class="success text-left">
										<td>${lista.codigo}</td>
										<td>${lista.nome}</td>
										<td>${lista.liga.nome}</td>
									</tr>
								</tbody>
							</c:forEach>
						</table>
						<!-- End Table -->
					</div>
				</div>
			</div>
			<!-- End Teams list -->
		</c:if>
	</div>
	<!-- End container -->
	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>
</body>
</html>