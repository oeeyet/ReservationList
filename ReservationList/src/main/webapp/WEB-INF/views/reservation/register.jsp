<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:include page="../includes/header.jsp"></jsp:include>


<!-- register 시작   -->
<!-- 추가입력폼 -->
<form action="/reservation/register" role="form" method="POST">
	<div class="d-flex justify-content-center">
		<div class="mb-3">
			<!-- 예약 가게 -->
			<label for="formGroupExampleInput" name="title" class="form-label">
				${title} </label>
			<!-- <input type="text" name="rname" 
					id="formGroupExampleInput " class="form-control mb-3"> -->
			<!-- 예약자 이름 -->
			<label for="formGroupExampleInput" class="form-label"></label> <input
				type="text" name="rname" class="form-control mb-3"
				id="formGroupExampleInput" placeholder="예약자 성함">
			<!-- 예약 인원 -->
			<select class="form-select mb-3" aria-label="Default select example"
				name="rcount">
				<option selected>예약 인원</option>
				<option value="1">1명</option>
				<option value="2">2명</option>
				<option value="3">3명</option>
				<option value="4">4명</option>
				<option value="5">5명</option>
				<option value="6">6명</option>
				<option value="7">7명</option>
				<option value="8">8명</option>
				<option value="9">9명</option>
				<option value="10">10명</option>
			</select>
			<!--  달력 -->
			<div class="container">
				<div class="row">
					<div class="col-sm">
						<div class="form-group">
							<div class="input-group date" id="datetimepicker4"
								data-target-input="nearest">
								<input type="text" class="form-control datetimepicker-input"
									data-target="#datetimepicker4" />
								<div class="input-group-append" data-target="#datetimepicker4"
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
							$('#datetimepicker4').datetimepicker({
								format : 'L'
							});
						});
					</script>
				</div>
			</div>
			<!-- 달력용 div -->

			<!-- 버튼  -->
			<div class="d-flex justify-content-center">
				<div class="d-flex bd-highlight mb-3">
					<div class="me-auto p-2 bd-highlight">
						<button type="submit" class="btn btn-outline-dark m-2">예약
							추가</button>
						<button type="reset" class="btn btn-outline-dark m-2">다시
							쓰기</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</form>



<jsp:include page="../includes/footer.jsp"></jsp:include>