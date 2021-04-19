<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>

<!-- 예약 관련 추가 버튼 -->
<h3 class="text-center">예약 현황</h3>
<main class="overflow-auto">
	<!-- 예약 카드 -->
	<div class="row row-cols-1 row-cols-md-3 g-4">
	<!-- 여기는 유저에서 예약한 사람들을 넣어야지!!!!그럼 그럼!  -->
		<c:forEach items="${ rlist }" var="re">
			<div class="col">
				<!-- 카드 추가 시작 -->
				<div class="card h-100">
					<div class="card-body">
						<p class="card-title">예약한 가게 :${re.title }</p>
						<p class="card-title">예약자 :${re.rname }</p>
						<p class="card-text">예약 인원 : ${re.rcount }</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">예약 시간 : ${re.rdate }</small>
						<hr>
						<!-- 버튼  -->
						<div class="d-flex justify-content-center">
							<div class="d-flex bd-highlight mb-3">
								<div class="me-auto p-2 bd-highlight">
									<button type="submit" class="btn btn-outline-dark m-2">예약
										취소</button>
									<button type="button" class="btn btn-outline-dark m-2">예약
										수정</button>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!--카드 추가끝 -->


		</c:forEach>
	</div>
	<!-- 여기가 예약 끝 -->
	<!-- 모달 추가  -->
	<div class="modal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">이 예약을 취소하시겠습니까?</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<p>
						<!-- 이유-->
						<select class="form-select mb-3"
							aria-label="Default select example" name="tno">
							<option selected>취소 이유</option>
							<option value="1">노쇼</option>
							<option value="2">다시 예약</option>
							<option value="3">예약 취소</option>
						</select>
					</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</main>

<jsp:include page="../includes/footer.jsp"></jsp:include>