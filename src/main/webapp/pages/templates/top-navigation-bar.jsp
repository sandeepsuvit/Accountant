<!-- Fixed navbar -->
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Accountant</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="#contact"><span
						class="glyphicon glyphicon-cog"></span> Settings</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><span
						class="glyphicon glyphicon-question-sign"></span> Support<b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Help Documentation</a></li>
						<li><a href="#">Other products</a></li>
						<li><a href="#">Feedback</a></li>
						<li class="divider"></li>
						<li><a href="#" data-toggle="modal"
							data-target="#registrationAccountantDialog">Registration
								Information</a></li>
						<li><a href="#" data-toggle="modal"
							data-target="#aboutAccountantDialog">About Accountant</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="../navbar-static-top/" data-toggle="tooltip"
					data-animation="true" data-placement="bottom"
					title="Click here to update your profile details"><span
						class="glyphicon glyphicon-user"></span> Welcome ${userName}</a></li>
				<li class="active"><a href="./"><span
						class="glyphicon glyphicon-off"></span> Logout</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</div>

<!-- DIALOGS -->
<!-- ABOUT ACCOUNTANT DIALOG -->
<div id="aboutAccountantDialog" class="modal fade" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
	data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">
					<span class="glyphicon glyphicon-th-large"></span> About Accountant
				</h4>
			</div>
			<div class="modal-body">
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type and scrambled it to make a type specimen book. It
					has survived not only five centuries, but also the leap into
					electronic typesetting, remaining essentially unchanged. It was
					popularised in the 1960s with the release of Letraset sheets
					containing Lorem Ipsum passages, and more recently with desktop
					publishing software like Aldus PageMaker including versions of
					Lorem Ipsum.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>

<!-- REGISTRATION INFORMATION DIALOG -->
<div id="registrationAccountantDialog" class="modal fade" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
	data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">
					<span class="glyphicon glyphicon-qrcode"></span> Accountant License
					Information
				</h4>
			</div>
			<div class="modal-body">
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type and scrambled it to make a type specimen book. It
					has survived not only five centuries, but also the leap into
					electronic typesetting, remaining essentially unchanged. It was
					popularised in the 1960s with the release of Letraset sheets
					containing Lorem Ipsum passages, and more recently with desktop
					publishing software like Aldus PageMaker including versions of
					Lorem Ipsum.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-success pull-left"
					data-dismiss="modal">
					<span class="glyphicon glyphicon-heart"></span> Renew your License
				</button>
				<button type="button" class="btn btn btn-primary"
					data-dismiss="modal">
					<span class="glyphicon glyphicon-print"></span> Print
				</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>