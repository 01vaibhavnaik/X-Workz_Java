<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<div class="d-flex justify-content-center align-items-center ">
<form action="weather" method="POST">
<div class="mb-3">
    <label  class="form-label ">Location Name</label>
    <input type="text" class="form-control" name="lacationName" required >
</div>
<div class="mb-3">
    <label  class="form-label ">Capture By</label>
    <input type="text" class="form-control" name="captureName" required>
</div>
<div class="mb-3">
    <label  class="form-label ">Temprature</label>
    <input type="number" class="form-control" name="temprature" required>
</div>
<div class="mb-3">
    <label  class="form-label ">Date</label>
    <input type="text" class="form-control" name="dateName" required>
</div>
    <div class="d-grid ">
        <button type="submit" class="btn btn-primary ">Report</button>
    </div>
</form>
</div>
</body>
</html>