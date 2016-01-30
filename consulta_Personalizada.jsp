<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="resources/imports/bootstrap/css-bootstrap.jsp"%>
<%@ include file="resources/imports/jstl/jstl.jsp"%>
<title>Consulta Personalizada</title>

</head>
<body>
	<!-- Init Container -->
	<div class="container">
		<!-- Menu -->
		<c:import url="resources/imports/menu/menu.jsp"></c:import>

		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#jogador">Jogadores</a></li>
			<li><a data-toggle="tab" href="#liga">Ligas</a></li>
			<li><a data-toggle="tab" href="#partida">Partidas</a></li>
			<li><a data-toggle="tab" href="#time">Times</a></li>
		</ul>
		<div class="tab-content">
			<div id="jogador" class="tab-pane fade active">
				<br />
				<h4 class="text-center">Abaixo você pode filtrar a pesquisa que
					deseja fazer.</h4>
				<br />
				<div class="row-fluid">
					<form class="form" role="form" action="ServletFifa" method="get">
						<input type="hidden" name="fork" value="p-jog-1" />
						<div class="col-sm-4 col-xs-4 col-md-4">
							<p>Pesquisar desempenho do jogador com um time</p>
							<div class="form-group">
								<label class="control-label" for="jog-2">Jogador:</label> <select
									class="form-control" id="jog-2" name="nm-jog-2" required>
									<option value="">Selecione</option>
									<c:forEach var="jogador" items="${listaOutros}">
										<option value="${jogador.codigo}">${jogador.nome}</option>
									</c:forEach>
								</select>
								<h5 class="help-block">Escolha o jogador</h5>
								<label class="control-label" for="time-1">Time:</label> <select
									class="form-control" id="time-1" name="nm-time-1" required>
									<option value="">Selecione</option>
									<c:forEach var="time" items="${listaTime}">
										<option value="${time.codigo}">${time.nome}</option>
									</c:forEach>
								</select>
								<h5 class="help-block">Escolha o time</h5>
								<input class="btn btn-primary" type="submit" value="Pesquisar"
									name="nm-enviar" />
							</div>
						</div>
					</form>
					<form class="form" role="form" action="ServletFifa" method="get">
						<input type="hidden" name="fork" value="p-jog-2" />
						<div class="col-sm-4 col-xs-4 col-md-4"></div>
						<div class="col-sm-4 col-xs-4 col-md-4">
							<p>Consultar desempenho dos jogadores</p>
							<div class="form-group">
								<input class="btn btn-primary" type="submit" value="Ir"
									name="nm-enviar" />
							</div>
						</div>
					</form>
				</div>

			</div>
			<div id="liga" class="tab-pane fade">
				<h3>Menu 1</h3>
				<p>Some content in menu 1.</p>
			</div>
			<div id="partida" class="tab-pane fade">
				<h3>Menu 2</h3>
				<p>Some content in menu 2.</p>
			</div>
			<div id="time" class="tab-pane fade">
				<h3>Menu 2</h3>
				<p>Some content in menu 2.</p>
			</div>
		</div>

	</div>
	<!-- End container -->
	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>
</body>
</html>