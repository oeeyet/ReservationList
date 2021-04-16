<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="./includes/header.jsp"></jsp:include>

<body>
	<!-- 추가입력폼 -->
	<form action="/register" role="form" method="POST">
		<div class="d-flex justify-content-center">
			<div class="mb-3">
				<!-- 예약자 이름 -->
				<label for="formGroupExampleInput" class="form-label"></label> <input
					type="text" name="rname" class="form-control mb-3"
					id="formGroupExampleInput" placeholder="예약자 성함">
				<!-- 테이블 번호 -->
				<select class="form-select mb-3" aria-label="Default select example"
					name="tno">
					<option selected>테이블 번호</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="3">4</option>
					<option value="3">5</option>
					<option value="3">6</option>
					<option value="3">7</option>
					<option value="3">8</option>
				</select>
				<!-- 예약 인원 -->
				<select class="form-select mb-3" aria-label="Default select example"
					name="rcount">
					<option selected>예약 인원</option>
					<option value="1">1명</option>
					<option value="2">2명</option>
					<option value="3">3명</option>
					<option value="3">4명</option>
					<option value="3">5명</option>
					<option value="3">6명</option>
					<option value="3">7명</option>
					<option value="3">8명</option>
					<option value="3">9명</option>
					<option value="3">10명</option>
				</select>
				<!--  달력 -->
				<div class="container">
					<div class="row">
						<div class="col-sm">
							<div class="form-group">
								<div class="input-group date" id="datetimepicker2"
									data-target-input="nearest">
									<input name="rdate" type="text" class="form-control datetimepicker-input"
										data-target="#datetimepicker2" />
									<div class="input-group-append" data-target="#datetimepicker2"
										data-toggle="datetimepicker">
										<div class="input-group-text">
											<i class="fa fa-calendar"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
						<script type="text/javascript">
							$(function() {
								$('#datetimepicker2').datetimepicker({
									locale : 'ru'
								});
							});
						</script>
					</div>
				</div>
				<!-- 달력용 div -->

				<!-- 예약자 번호-->
				<label for="formGroupExampleInput" class="form-label"></label> <input
					name="pno" type="text" class="form-control mb-3"
					id="formGroupExampleInput" placeholder="핸드폰 끝번호">

				<!-- 버튼  -->
				<div class="d-flex justify-content-center">
					<div class="d-flex bd-highlight mb-3">
						<div class="me-auto p-2 bd-highlight">
							<button type="submit" class="btn btn-outline-dark m-2">예약
								추가</button>
							<button type="button" class="btn btn-outline-dark m-2">다시
								쓰기</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- 위에가 제일 마지막! -->
	<jsp:include page="./includes/footer.jsp"></jsp:include>