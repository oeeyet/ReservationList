<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

  <!-- Jquery JS -->
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

  <!-- Fontawesome JS -->
  <script src="https://kit.fontawesome.com/7d6b56a039.js" crossorigin="anonymous"></script>
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid d-flex justify-content-center">
      <a class="navbar-brand" href="#"><i class="fa fa-address-book-o" aria-hidden="true"></i> 오늘의 예약</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item"><a class="nav-link" href="#">방문</a></li>
          <li class="nav-item"><a class="nav-link" href="#">예약</a></li>
          <li class="nav-item"><a class="nav-link p-2 bd-highlight" href="#">로그인</a></li>
        </ul>
      </div>
    </div>
  </nav>
  <br> <!-- header 마지막 -->

  <!-- sign Up Form -->
  <div class="container justify-content-center">
    <form action="" method="post">
      <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Name</label>
        <div class="col-sm-10">
          <input type="email" class="form-control" id="inputEmail3" name="name">
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
          <input type="email" class="form-control" id="inputEmail3" name="email"> 
        </div>
      </div>
      <div class="row mb-3">
        <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
          <input type="password" class="form-control" id="inputPassword3" name="pw">
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
            <label for="formGroupExampleInput" class="form-label"></label>
            <input type="text" class="form-control" id="formGroupExampleInput" placeholder="식당 이름" name="titleName">
          </div>
        </div>
      </div>
      <br>
      <div class="d-flex justify-content-center">
        <button type="submit" class="btn btn-dark">Sign Up</button></div>
    </form>
  </div>


  <!-- footer 제작 -->
  <footer class="bd-footer p-3 p-md-1 mt-5 bg-light text-center text-sm-start">
    <div class="card mb">
      <div class="row g">
        <div class="col-md">
          <i class="fa fa-quote-right fa-5x fa-pull-right fa-border" aria-hidden="true"></i>
          <i class="fa fa-quote-left fa-5x fa-pull-left fa-border" aria-hidden="true"></i>
          <div class="card-body justify-content-center">
            <a href="" class="card-title">Context</a>
            <p class="card-text">made by EUNJI OH<br>
            </p>
            <p class="card-text"><small class="text-muted">To connection all around the world with RESERVATION</small>
            </p>
          </div>
        </div>
      </div>
    </div>
  </footer>
</body>

</html>