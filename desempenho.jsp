<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="resources/imports/bootstrap/css-bootstrap.jsp"%>
<%@ include file="resources/imports/jstl/jstl.jsp"%>

<title>Desempenho</title>
</head>
<body>
	<!-- Init Container -->
	<div class="container">
		<!-- Menu -->
		<c:import url="resources/imports/menu/menu.jsp"></c:import>
		<!-- Init Performance list -->
		<!-- Init row -->
		<div class="row">
			<div class="col-sm-5 col-xs-5 col-md-5"></div>
			<div class="col-sm-2 col-xs-2 col-md-2">
				<h1 class="text-success text-center">
					<i>Desempenho</i>
				</h1>
			</div>
			<div class="col-sm-5 col-xs-5 col-md-5"></div><br/>
		</div>
		<!-- End row -->
		<br />
		<h4 class="help-block">Abaixo estão todos os jogadores. 
			Clique no da sua escolha para ver o desempenho dele.</h4>
		<%
			int i = 1;
		%>
		<div class="row">
		<c:forEach var="media" items="${listaMedia}">
			<div class="col-sm-3 col-xs-3 col-md-3">
		
			<!-- Trigger the modal with a button -->
			<button type="button" class="btn btn-success btn-lg" data-toggle="modal"
				data-target="#myModal<%=i%>">${media.jogador.nome}</button>

			<!-- Modal -->
			<div id="myModal<%=i%>" class="modal" role="dialog">
				<div class="modal-dialog modal-lg">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Desempenho de ${media.jogador.nome}</h4>
						</div>
						<div class="modal-body">
							<!-- Init table -->
							<table class="table table-bordered table-hover">
								<tbody>
									<tr class="info text-center text-capitalize">
										<th>Número de partidas</th>
										<th>Vitórias</th>
										<th>Derrotas</th>
										<th>Empates</th>
										<th>Aproveitamento</th>
									</tr>
									<tr class="success text-center text-capitalize">
										<td>${media.qtPartida}</td>
										<td>${media.qtVitoria}</td>
										<td>${media.qtDerrota}</td>
										<td>${media.qtEmpate}</td>
										<td>${media.aproveitamento}</td>
									</tr>
								</tbody>
							</table>
							<!-- End Table -->

							<!-- Init table -->
							<table class="table table-bordered table-hover">
								<tbody>
									<tr class="info text-center text-capitalize">
										<th>Gols Pró</th>
										<th>Gols contra</th>
										<th>Saldo de gols</th>
										<th>Média de gols</th>
										<th>Total de faltas</th>
										<th>Média de faltas</th>
									</tr>
									<tr class="success text-center text-capitalize">
										<td>${media.gol.golsPro}</td>
										<td>${media.gol.golsContra}</td>
										<td>${media.gol.saldo}</td>
										<td>${media.gol.media }</td>
										<td>${media.falta.total}</td>
										<td>${media.falta.media}</td>
									</tr>
								</tbody>
							</table>
							<!-- End Table -->

							<!-- Init table -->
							<table class="table table-bordered table-hover">
								<tbody>
									<tr class="info text-center text-capitalize">
										<th>Total de Finalizações</th>
										<th>Média de Finalizações</th>
										<th>Total de Fin. Certas</th>
										<th>Média de Fin. Certas</th>
										<th>Aproveitamento de Finalizações</th>
										<th>Média de Precisão no passe</th>
										<th>Média de Posse de bola</th>
									</tr>
									<tr class="success text-center text-capitalize">
										<td>${media.fin.totalFin}</td>
										<td>${media.fin.mediaFin}</td>
										<td>${media.fin.totalFinCerta}</td>
										<td>${media.fin.mediaFinCerta}</td>
										<td>${media.fin.aproveitamento}%</td>
										<td>${media.precisaoPasse}%</td>
										<td>${media.posseBola}%</td>
									</tr>
								</tbody>
							</table>
							<!-- End Table -->
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Fechar</button>
						</div>
					</div>

				</div>
			</div>
			<!-- End Performance list -->
			<%
				i++;
			%>
			</div> <!-- End col-sm-3 col-xs-3 col-md-3 -->
			<br/>
		</c:forEach>
		</div> <!-- End row -->
	</div>
	<!-- End container -->

	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>

</body>
</html>