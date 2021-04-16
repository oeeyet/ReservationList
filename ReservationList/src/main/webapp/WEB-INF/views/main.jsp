<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:include page="./includes/header.jsp"></jsp:include>

<!-- 메인 카드  -->
<div class="row row-cols-1 row-cols-md-3 g-4">
	<c:forEach items="${ main }" var="login">
		<div class="col">
			<div class="card h-100">
				<div class="card-body">
					<p class="card-text">예약 가능 식당 : ${login.title }
					<div class="d-flex bd-highlight">
		<div class="me-auto p-2 bd-highlight">
			<button type="button" class="btn btn-outline-dark " onclick="location.href='rboard.jsp'">예약하기</button>
		</div>
		</div></p>
		
					<!-- <h5 class="card-title">예약자 성함 : ${board.rname}</h5>
						<p class="card-text">테이블 번호 : ${board.tno } / 예약 인원 : ${board.rcount }</p>
						<p class="card-text">연락처 : ${board.pno }</p> -->
				</div>
				<!-- <div class="card-footer">
						<small class="text-muted">예약 시간 : ${board.rdate}</small>
					</div>
					</div> -->
			</div>
		</div>

	</c:forEach>

</div>
<jsp:include page="./includes/footer.jsp"></jsp:include>