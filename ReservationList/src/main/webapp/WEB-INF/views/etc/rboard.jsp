<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:include page="../includes/header.jsp"></jsp:include>


 <div class="container-fluid">
    <!-- 예약 관련 추가 버튼 -->
    <main class="overflow-auto">
      <div class="d-flex bd-highlight mb-3">
        <div class="me-auto p-2 bd-highlight">
          <button type="button" class="btn btn-outline-dark m-2">예약 현황</button>
        </div>
      </div>
      <br>
      <h2 class="text-center">오늘의 예약</h2>
      <br>
      <!-- 예약 카드 -->
      <div class="row row-cols-1 row-cols-md-3 g-4">
        <c:forEach items="${ boardList }" var="board">
          <div class="col">
            <div class="card h-100">
              <div class="card-body">
                <p class="card-text">예약 가능 식당 : 식당 이름 </p>
              </div>
              <div class="card-footer">
                <small class="text-muted">예약 날짜 :
                  <!-- 예약 날짜 -->
                  <div class="container">
                    <div class="row">
                      <div class="col-sm">
                        <div class="form-group">
                          <div class="input-group date" id="datetimepicker4" data-target-input="nearest">
                            <input type="text" class="form-control datetimepicker-input"
                              data-target="#datetimepicker4" />
                            <div class="input-group-append" data-target="#datetimepicker4" data-toggle="datetimepicker">
                              <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                            </div>
                          </div>
                        </div>
                      </div>
                      <script type="text/javascript">
                        $(function () {
                          $('#datetimepicker4').datetimepicker({
                            format: 'L'
                          });
                        });
                      </script>
                    </div>
                  </div><br>
                  <!-- 예약 시간 -->
                  <select class="form-select mb-3" aria-label="Default select example" name="tno">
                    <option selected>예약 시간 선택</option>
                    <option value="8">05:00</option>
                    <option value="8">05:30</option>
                    <option value="8">06:00</option>
                    <option value="8">06:30</option>
                    <option value="8">07:00</option>
                    <option value="8">07:30</option>
                  </select>
                </small>
                <!-- <p class="card-text">
                  예약 인원
                  <select class="form-select mb-3" aria-label="Default select example" name="rcount">
                    <option selected>인원 선택</option>
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
                </p>
                 테이블 번호
            <select class="form-select mb-3" aria-label="Default select example" name="tno">
              <option selected>테이블 번호</option>
              <option value="1">T1(2인 이하)</option>
              <option value="2">T2(2인 이하)</option>
              <option value="3">T3(4인 이하)</option>
              <option value="3">T4(4인 이하)</option>
              <option value="3">T5(4인 이하)</option>
              <option value="3">T6(4인 이하)</option>
              <option value="3">T7(6인 이하 단체석)</option>
              <option value="3">T8(10인 이하 단체석)</option>
            </select> -->
                <hr>
                <!-- 버튼  -->
                <div class="d-flex justify-content-center">
                  <div class="d-flex bd-highlight mb-3">
                    <div class="me-auto p-2 bd-highlight">
                      <button type="submit" class="btn btn-outline-dark m-2">예약
                        추가</button>
                      <button type="button" class="btn btn-outline-dark m-2">다시
                        선택</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </c:forEach>
      </div><!-- 여기가 예약 끝 -->

    </main>
  </div>
<jsp:include page="../includes/footer.jsp"></jsp:include>