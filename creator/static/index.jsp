<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="style.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
            crossorigin="anonymous"></script>
    <script src="admin.js"></script>
</head>

<body>
<nav class="navbar navbar-expand-lg bg-dark bg-opacity-25 position-sticky top-0 z-3 backdrop-blur">
    <div class="container-fluid ">
        <a class="navbar-brand text-light fst-italic" href="#">Creator</a>

        <ul class="nav justify-content-center">

            <li class="nav-item">
                <a class="nav-link text-light text-decoration-none" href="index.jsp">Home</a>
            </li>
            <li class="nav-item ">
                <a class="nav-link text-light text-decoration-none" href="about.jsp">About</a>
            </li>

        </ul>
        <div style="grid-template-columns: 1fr 1fr;" class="d-grid gap-3 ">
            <div class="col-4 p-1 ps-4">
                <a href="logIn.jsp" class="btn btn-secondary pop">LogIn</a>
            </div>
            <div class="col-4 p-1 pe-2">
                <a href="signUp.jsp" class="btn btn-secondary pop">SignUp</a>
            </div>
        </div>
    </div>
</nav>
<div class="position-relative">
    <div id="cardImg" class="card bg-dark bg-opacity-25 backdrop-blur mt-5 ms-5 position-absolute card-link-hover" style="width: 20rem;">
        <img src="camera.jpg" class="card-img-top " alt=""
             style="height: 20rem; width: 100%; object-fit: cover;">
        <div class="card-body mx-auto ">
            <h5 class="card-title "><a class="text-decoration-none text-light" href="portfolio.jsp">Creator</a></h5>
        </div>
    </div>
    <div id="cardImg1" class="card bg-dark bg-opacity-25 backdrop-blur margin1 position-absolute card-link-hover" style="width: 20rem;">
        <img src="eye.jpg" class="card-img-top " alt=""
             style="height: 20rem; width: 100%; object-fit: cover;">
        <div class="card-body mx-auto ">
            <h5 class="card-title "><a class="text-decoration-none text-light" href="booking.jsp">Booking</a></h5>
        </div>
    </div>

</div>

</body>

</html>