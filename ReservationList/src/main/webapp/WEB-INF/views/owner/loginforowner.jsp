<%@include file="../includes/header.jsp"%>

<!-- sign Up Form -->
<div class="container justify-content-center">
	<form>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3">
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
		<div>
			<select class="form-select" aria-label="Disabled select example">
				<option selected>업종 선택</option>
				<option value="1">식당</option>
			</select>
			<div class="row g-3">
				<div class="mb-3">
					<label for="formGroupExampleInput" class="form-label"></label> <input
						type="text" class="form-control" id="formGroupExampleInput"
						placeholder="식당 이름">
				</div>
			</div>
		</div>
		<br>
		<div class="d-flex justify-content-center">
			<button type="submit" class="btn btn-dark">Sign Up</button>
		</div>
	</form>
</div>


<!-- footer 제작 -->
<footer
	class="bd-footer p-3 p-md-1 mt-5 bg-light text-center text-sm-start">
	<div class="card mb">
		<div class="row g">
			<div class="col-md">
				<i class="fa fa-quote-right fa-5x fa-pull-right fa-border"
					aria-hidden="true"></i> <i
					class="fa fa-quote-left fa-5x fa-pull-left fa-border"
					aria-hidden="true"></i>
				<div class="card-body justify-content-center">
					<a href="" class="card-title">Context</a>
					<p class="card-text">
						made by EUNJI OH<br>
					</p>
					<p class="card-text">
						<small class="text-muted">To connection all around the
							world with RESERVATION</small>
					</p>
				</div>
			</div>
		</div>
	</div>
</footer>
</body>

</html>