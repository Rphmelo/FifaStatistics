<nav class="nav-custom">
	<div id="custom-bootstrap-menu" class="navbar navbar-default"
		role="navigation">
		<div class="container-fluid">
			<div class="navbar-header nav-custom-margin nav-custom-padding">
				<a class="navbar-brand" href="index.jsp"><img height="50px" width="110%"
					src="resources/images/logo.jpg" /></a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li role="presentation" class="dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown" href="#"><b>Cadastros</b>
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Jogador</a></li>
							<li><a href="#">Liga</a></li>
							<li><a href="#">Partida</a></li>
							<li><a href="#">Time</a></li>
							<li><a href="#">Tipo de Partida</a></li>
						</ul></li>
					<li role="presentation" class="dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown"><b>Consultas</b>
							<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li class="dropdown-header">Consulta Simples</li>
							<li><a href="ServletFifa?fork=jogador&numberList=2">Jogadores</a></li>
							<li><a href="ServletFifa?fork=liga&numberList=2">Ligas</a></li>
							<li><a href="ServletFifa?fork=partida&numberList=1">Partidas</a></li>
							<li><a href="ServletFifa?fork=time&numberList=3">Times</a></li>
							<li><a href="ServletFifa?fork=tppartida&numberList=2">Tipos de Partida</a></li>
							<li class="dropdown-header">Consulta Personalizada</li>
							<li><a href="ServletFifa?fork=consulta-p&numberList=2">Ir </a></li>
							
						</ul>
						</li>
					<li role="presentation">
					<a href="ServletFifa?fork=media">
					<b>Desempenho</b></a></li>
				</ul>
			</div>
			<div id="navbar" class="navbar-collapse collapse"></div>
		</div>
	</div>
</nav>