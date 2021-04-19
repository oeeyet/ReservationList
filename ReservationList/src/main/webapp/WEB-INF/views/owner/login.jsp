<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>

<!-- sign Up Form -->
<div class="container justify-content-center">
	<form action="/owner/login" method="post">

		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" name="email" class="form-control"
					id="inputEmail3">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" name="pw" class="form-control"
					id="inputPassword3">
			</div>
		</div>
		<br>
		<div class="d-flex justify-content-center">
			<button type="submit" class="btn btn-dark">Sign In</button>
		</div>
	</form>
</div>



<jsp:include page="../includes/footer.jsp"></jsp:include>