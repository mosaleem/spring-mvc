<script src="${pageContext.request.contextPath}/jsp/users/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/users/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/users/js/userValidation.js"></script>
<link href="${pageContext.request.contextPath}/jsp/users/css/myCSS.css" rel="stylesheet">
  	
  	
  	<form action="${pageContext.request.contextPath}/users_login"
										id="users_login" method="post" class="login">
										<h3
											style="border-bottom: 1px solid rgba(0, 0, 0, 0.075); font-size: 1.125rem; margin-bottom: 20px; padding-bottom: 17px;">Login</h3>
										<%
											if (request.getParameter("login") != null) {
										%>
										<div class="alert alert-danger"
											style="padding: 20px; margin-bottom: 10px;">Incorrect Email and Password ! Please Try Again.</div>
										<%
											}
										%>
										<p class="form-row form-row-wide">
											<label for="username">Email1 address <span
												class="required">*</span></label> <input type="email" name="email"
												class="input-text form-control validate[required]"
												placeholder="Email" id="username" value="">
										</p>
										<p class="form-row form-row-wide">
											<label for="password">Password <span class="required">*</span></label>
											<input class="input-text form-control validate[required]"
												type="password" name="passw" placeholder="Password"
												id="password">
										</p>


										<p class="form-row form-row-wide">
											<span class="inline-block  submit"> <input
												type="submit" class="button" name="login" value="Login"
												style="width: 250px; background: #00D4BF; color: #164E6A;">
											</span>
										</p>
										
									</form>
  