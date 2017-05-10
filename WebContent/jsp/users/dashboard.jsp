<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	<%= session.getAttribute("users_first_name") %>
	 -->
	<a style="float: right;"
		href="${pageContext.request.contextPath}/users/logout">Logout</a>

	<c:if
		test="${param['update']!=null && param['update']=='success'}">
		<div class="flash_message info" style="top: 0px; padding: 10px;">
			<div class="message">Congress Your Profile Successfully Update</div>
			<div class="close_button" onClick="close_flash()"></div>
		</div>
	</c:if>

<c:if
		test="${param['update']!=null && param['update']=='failed'}">
		<div class="flash_message info" style="top: 0px; padding: 10px;">
			<div class="message">Your Profile not Update ! please Try Again.</div>
			<div class="close_button" onClick="close_flash()"></div>
		</div>
	</c:if>

	<form action="${pageContext.request.contextPath}/users/edit_users"
		id="edit_profile" method="post" class="login">

		<input type="hidden" name="id" value="${user.id}">

		<p class="form-row form-row-wide">
			<label for="username">First Name <span class="required">*</span></label>
			<input type="text" name="first_name"
				class="input-text form-control validate[required]"
				placeholder="First Name" id="first_name" value="${user.first_name}">
		</p>

		<p class="form-row form-row-wide">
			<label for="username">Last Name <span class="required">*</span></label>
			<input type="text" name="last_name"
				class="input-text form-control validate[required]"
				placeholder="Last Name" id="last_name" value="${user.last_name}">
		</p>


		<p class="form-row form-row-wide">
			<label for="username">Email address <span class="required">*</span></label>
			<input type="email" name="email"
				class="input-text form-control validate[required]"
				placeholder="Email" id="email" value="${user.email}">
		</p>
		<p class="form-row form-row-wide">
			<label for="password">Password <span class="required">*</span></label>
			<input class="input-text form-control validate[required]" type="text"
				name="password" placeholder="Password" id="password"
				value="${user.password}">
		</p>

		<p class="form-row form-row-wide">
			<label for="password">Password <span class="required">*</span></label>

			Hobbies 1 <input type="checkbox" name="hobbies1"
				<c:if test="${user.hobbies1==1}">checked='checked' </c:if>
				id="hobbies1" value="1"></input> Hobbies 2 <input type="checkbox"
				name="hobbies2"
				<c:if test="${user.hobbies2==1}">checked='checked' </c:if>
				id="hobbies2" value="1"></input> Hobbies 3 <input type="checkbox"
				name="hobbies3"
				<c:if test="${user.hobbies3==1}">checked='checked' </c:if>
				id="hobbies3" value="1"></input>


		</p>



		<p class="form-row form-row-wide">
			<label for="password">Interest <span class="required">*</span></label>

			Interest 1 <input type="radio" name="interest"
				<c:if test="${user.interest==1}">checked='checked' </c:if>
				id="hobbies1" value="1"></input> Interest 2 <input type="radio"
				name="interest"
				<c:if test="${user.interest==2}">checked='checked' </c:if>
				id="hobbies2" value="2"></input> Interest 3 <input type="radio"
				name="interest"
				<c:if test="${user.interest==3}">checked='checked' </c:if>
				id="hobbies3" value="3"></input>


		</p>



		<p class="form-row form-row-wide">
			<span class="inline-block  submit"> <input type="submit"
				class="button" value="Save"
				style="width: 250px; background: #00D4BF; color: #164E6A;">
			</span>
		</p>

	</form>



</body>
</html>