<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="../includes/header.jsp"></jsp:include>

<!-- sign Up Form -->
<div class="container justify-content-center">
	<form action="/owner/register" role="form" method="POST">
		<div class="row mb-3">
			<label for="inputEmail3"  class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="title" name="title" class="form-control" id="inputEmail3">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" name="email" class="form-control" id="inputEmail3">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" name="pw" class="form-control" id="inputPassword3">
			</div>
		</div>
		<!-- <div class="d-flex justify-content-center">
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
          <label class="form-check-label" for="inlineRadio1">Female</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
          <label class="form-check-label" for="inlineRadio2">Male</label>
        </div>
      </div> -->
		<br>
		<!-- <div> -->
			<!-- <select class="form-select" aria-label="Disabled select example">
				<option selected>업종 선택</option>
				<option value="1" name="">식당</option>
			</select> -->
			<div class="row g-3">
				<div class="mb-3">
					<label for="formGroupExampleInput" class="form-label"></label> <input
						type="text" class="form-control" name="title" id="formGroupExampleInput"
						placeholder="식당 이름">
				</div>
			</div>
		<!-- </div> -->
		<br>
		<div class="d-flex justify-content-center">
			<button type="submit" class="btn btn-dark">Sign Up</button>
		</div>
	</form>
</div>


<jsp:include page="../includes/footer.jsp"></jsp:include>