<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<!-- Jquery JS -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<!-- Fontawesome JS -->
<script src="https://kit.fontawesome.com/7d6b56a039.js"
	crossorigin="anonymous"></script>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid d-flex justify-content-center">
			<a class="navbar-brand" href="#"><i class="fa fa-address-book-o"
				aria-hidden="true"></i> 오늘의 예약</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="#">단골 확인</a></li>
					<li class="nav-item"><a class="nav-link" href="#">노쇼 확인</a></li>
					<li class="nav-item"><a class="nav-link p-2 bd-highlight"
						href="#">로그인</a></li>
					<li class="nav-item"><a class="nav-link p-2 bd-highlight"
						href="#">회원가입</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<br>
	<!-- add button -->
	<div class="d-flex bd-highlight mb-3">
		<div class="me-auto p-2 bd-highlight">
			<button type="button" class="btn btn-outline-dark m-2">예약 현황</button>
		</div>
		<div class="p-2 bd-highlight">
			<button type="button" class="btn btn-outline-dark m-2">예약 추가</button>
		</div>
		<div class="p-2 bd-highlight">
			<button type="button" class="btn btn-outline-dark m-2">예약 수정</button>
		</div>
	</div>
	<br>
	<br>

</body>
<!-- Bootstrap JS -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>

</html>