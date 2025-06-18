<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="admin.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <title>Log In</title>
</head>

<body>
<nav class="navbar navbar-expand-lg bg-dark bg-opacity-50 position-sticky top-0 z-3 backdrop-blur">
    <div class="container-fluid">
        <ul class="nav mx-auto">
            <li class="nav-item">
                <a class="nav-link text-light text-decoration-none" href="index.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow p-4 border rounded border-secondary bg-transparent "
         style="width: 100%; max-width: 400px;">
        <h3 class="text-center fst-italic text-light mb-4">Log In</h3>

        <form action="" method="POST">

            <div class="mb-3">
                <label for="emailId" class="form-label text-light">Email address</label>
                <input type="email" class="form-control" id="emailId" name="email" required
                       placeholder="Enter your email">
            </div>

            <div class="mb-3">
                <label for="passwordId" class="form-label text-light">Password</label>
                <input type="password" class="form-control" id="passwordId" name="password" required
                       placeholder="Enter password">
            </div>


            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="rememberId" name="remember">
                <label class="form-check-label text-light" for="rememberId">Remember me</label>
            </div>


            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Log In</button>
            </div>
        </form>


        <div class="text-center text-light mt-3">
            <small>Don't have an account? <a href="signUp.jsp">Sign Up </a></small>
        </div>
    </div>
</div>

</body>

</html>