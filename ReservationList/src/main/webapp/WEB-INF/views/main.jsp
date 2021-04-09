<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<jsp:include page="./board/header.jsp"></jsp:include>
	<!-- 메인 카드  -->
	<div class="row row-cols-1 row-cols-md-3 g-4">
				<c:forEach items="${ boardList }" var="board">
		<div class="col">
			<div class="card h-100">
					<div class="card-body">
						<p class="card-text">예약번호 : ${board.bno }</p>
						<h5 class="card-title">예약자 성함 : ${board.rname}</h5>
						<p class="card-text">테이블 번호 : ${board.tno } / 예약 인원 : ${board.rcount }</p>
						<p class="card-text">연락처 : ${board.pno }</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">예약 시간 : ${board.rdate}</small>
					</div>
			</div>
		</div>
				</c:forEach>

	</div>
<jsp:include page="./board/footer.jsp"></jsp:include>