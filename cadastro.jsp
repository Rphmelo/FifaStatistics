<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="resources/imports/bootstrap/css-bootstrap.jsp"%>
<%@ include file="resources/imports/jstl/jstl.jsp"%>

<title>Cadastro</title>
</head>
<body>
	<!-- Init Container -->
	<div class="container">
		<!-- Menu -->
		<c:import url="resources/imports/menu/menu.jsp"></c:import>
		<c:if test="${partida-msg == 1}">
			<!-- Init Messages -->
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-8 col-xs-8 col-md-8">
					<div class="alert alert-success fade in">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>

					</div>
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
			</div>
			<!-- End row -->
		</c:if>

		<c:if test="${partida-msg == 2}">
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-8 col-xs-8 col-md-8">
					<div class="alert alert-danger fade in">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>

					</div>
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
			</div>
			<!-- End row -->
		</c:if>
		<!-- End Messages -->

		<!-- Init Matche's form -->
		<form class="form" role="form" action="" method="post">
			<h2 class="text-center text-primary">
				<u>Partidas</u>
			</h2>
			<br />
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-8 col-xs-8 col-md-8">
					<h3 class="text-center text-success">
						<i>Insira os dados abaixo:</i>
					</h3>
					<br />
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
			</div>
			<!-- End row -->

			<!-- Init row -->
			<div class="row">
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
				<div class="col-sm-4 col-xs-4 col-md-4">
					<div class="form-group">
						<label class="control-label" for="tp-partida">Tipo de
							partida:</label> <select class="form-control" id="tp-partida"
							name="nm-tp-partida" required>
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Escolha o tipo de partida</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="dt-partida">Data da
							partida:</label> <input type="date" class="form-control" id="dt-partida"
							pattern="dd/mm/yyyy" name="nm-dt-partida" required />
						<p class="help-block">Escolha a data da partida no formato:
							dd/mm/aaaa</p>
					</div>
				</div>
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
			</div>
			<!-- End row -->

			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-4 col-xs-4 col-md-4">
					<h3 class="text-center text-primary">
						<i>Jogador 1:</i>
					</h3>
					<div class="form-group">
						<label class="control-label" for="jogador-1">Jogador:</label> <select
							class="form-control" id="jogador-1" name="nm-jogador-1" required>
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Escolha o jogador</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="time-1">Time:</label> <select
							required class="form-control" id="time-1" name="nm-time-1">
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Escolha o time</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="resultado-1">Resultado:</label>
						<select class="form-control" id="resultado-1" required
							name="nm-resultado-1">
							<option value="">Selecione</option>
							<option value="v">Vitória</option>
							<option value="d">Derrota</option>
							<option value="e">Empate</option>
						</select>
						<p class="help-block">Selecione o resultado</p>
					</div>

					<div class="form-group">
						<label class="control-label" for="qt-gols-1">Gols:</label> <input
							type="number" max="15" class="form-control" required
							id="qt-gols-1" name="nm-qt-gols-1" />
						<p class="help-block">Digite a quantidade de gols</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="posse-bola-1">Posse de
							bola (%):</label> <input type="number" max="100" required
							class="form-control" id="posse-bola-1" name="nm-posse-bola-1" />
						<p class="help-block">Digite a porcentagem de posse de bola</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="fin-certas-1">Finalizações
							certas:</label> <input required type="number" max="30"
							class="form-control" id="fin-certas-1" name="nm-fin-certas-1" />
						<p class="help-block">Digite o total de finalizações certas</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="fin-1">Finalizações:</label> <input
							type="number" max="40" class="form-control" id="fin-1"
							name="nm-fin-1" required />
						<p class="help-block">Digite o total de finalizações</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="faltas-1">Faltas:</label> <input
							type="number" max="100" class="form-control" id="faltas-1"
							name="nm-faltas-1" required />
						<p class="help-block">Digite a quantidade de faltas cometidas</p>
					</div>
				</div>

				<div class="col-sm-4 col-xs-4 col-md-4">
					<h3 class="text-center text-primary">
						<i>Jogador 2:</i>
					</h3>
					<div class="form-group">
						<label class="control-label" for="jogador-2">Jogador:</label> <select
							class="form-control" id="jogador-2" name="nm-jogador-2" required>
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Escolha o jogador</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="time-2">Time:</label> <select
							class="form-control" id="time-2" name="nm-time-2" required>
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Escolha o time</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="resultado-2">Resultado:</label>
						<select class="form-control" id="resultado-2"
							name="nm-resultado-2" required>
							<option value="">Selecione</option>
							<option value="v">Vitória</option>
							<option value="d">Derrota</option>
							<option value="e">Empate</option>
						</select>
						<p class="help-block">Selecione o resultado</p>
					</div>

					<div class="form-group">
						<label class="control-label" for="qt-gols-2">Gols:</label> <input
							type="number" max="15" class="form-control" id="qt-gols-2"
							name="nm-qt-gols-2" required />
						<p class="help-block">Digite a quantidade de gols</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="posse-bola-2">Posse de
							bola (%):</label> <input type="number" max="100" class="form-control"
							id="posse-bola-2" name="nm-posse-bola-2" required />
						<p class="help-block">Digite a porcentagem de posse de bola</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="fin-certas-2">Finalizações
							certas:</label> <input type="number" max="30" class="form-control"
							id="fin-certas-2" name="nm-fin-certas-2" required />
						<p class="help-block">Digite o total de finalizações certas</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="fin-2">Finalizações:</label> <input
							type="number" max="40" class="form-control" id="fin-2"
							name="nm-fin-2" required />
						<p class="help-block">Digite o total de finalizações</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="faltas-2">Faltas:</label> <input
							type="number" max="100" class="form-control" id="faltas-2"
							name="nm-faltas-2" required />
						<p class="help-block">Digite a quantidade de faltas cometidas</p>
					</div>

					<div class="col-sm-2 col-xs-2 col-md-2"></div>
				</div>
			</div>
			<!-- End row -->

			<!-- Init row -->
			<div class="row">
				<div class="col-sm-5 col-xs-5 col-md-5"></div>

				<div class="col-sm-2 col-xs-2 col-md-2 text-center">
					<br /> <input class="btn btn-lg btn-primary" type="submit"
						value="Enviar" name="nm-enviar" /> <br /> <br /> <br />
				</div>

				<div class="col-sm-5 col-xs-5 col-md-5"></div>
			</div>
			<!-- End row -->
		</form>
		<!-- End Matche's form -->
		<!-- Init other's form -->
		<form class="form" role="form" action="" method="post">
			<h2 class="text-center text-primary">
				<u>Jogadores</u>
			</h2>
			<br />
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-8 col-xs-8 col-md-8">
					<h3 class="text-center text-success">
						<i>Insira os dados abaixo:</i>
					</h3>
					<br />
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
			</div>
			<!-- End row -->
			<div class="row">
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
				<div class="col-sm-4 col-xs-4 col-md-4">
					<div class="form-group">
						<label class="control-label" for="nm-rg-outros">Nome:</label> <input
							type="text" maxlength="40" class="form-control" id="id-rg-outros"
							name="nm-rg-outros" required />
						<p class="help-block">Digite o nome</p>
					</div>
				</div>
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
			</div>

			<!-- Init row -->
			<div class="row">
				<div class="col-sm-5 col-xs-5 col-md-5"></div>

				<div class="col-sm-2 col-xs-2 col-md-2 text-center">
					<br /> <input class="btn btn-primary" type="submit" value="Enviar"
						name="nm-enviar" /> <br /> <br /> <br />
				</div>

				<div class="col-sm-5 col-xs-5 col-md-5"></div>
			</div>
			<!-- End row -->
		</form>
		<!-- End other's form -->


		<!-- Init team's form -->
		<form class="form" role="form" action="" method="post">
			<h2 class="text-center text-primary">
				<u>Times</u>
			</h2>
			<br />
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
				<div class="col-sm-8 col-xs-8 col-md-8">
					<h3 class="text-center text-success">
						<i>Insira os dados abaixo:</i>
					</h3>
					<br />
				</div>
				<div class="col-sm-2 col-xs-2 col-md-2"></div>
			</div>
			<!-- End row -->
			<div class="row">
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
				<div class="col-sm-4 col-xs-4 col-md-4">
					<div class="form-group">
						<label class="control-label" for="nm-rg-time">Nome:</label> <input
							type="text" maxlength="40" class="form-control" id="id-rg-time"
							name="nm-rg-time" required />
						<p class="help-block">Digite o nome do time</p>
					</div>
					<div class="form-group">
						<label class="control-label" for="id-liga">Liga:</label>
						<select class="form-control" id="id-liga"
							name="nm-liga" required>
							<option value="">Selecione</option>
						</select>
						<p class="help-block">Selecione a liga</p>
					</div>
				</div>
				<div class="col-sm-4 col-xs-4 col-md-4"></div>
			</div>
			<!-- Init row -->
			<div class="row">
				<div class="col-sm-5 col-xs-5 col-md-5"></div>

				<div class="col-sm-2 col-xs-2 col-md-2 text-center">
					<br /> <input class="btn btn-primary" type="submit" value="Enviar"
						name="nm-enviar" /> <br /> <br /> <br />
				</div>

				<div class="col-sm-5 col-xs-5 col-md-5"></div>
			</div>
			<!-- End row -->
		</form>
		<!-- End other's form -->
	</div>
	<!-- End Container -->
	<c:import url="resources/imports/bootstrap/js-bootstrap.jsp"></c:import>
</body>
</html>