<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Application</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>


<div class="d-flex justify-content-center align-items-center vh-100  ">
    <div class="border border-primary rounded p-5" >
        <h1>Creator Application Form</h1>
        <form action="creator" method="POST">
            <div class="mb-3">
                <label  class="form-label ">Name :</label>
                <input type="text" class="form-control" name="nameName" required >
            </div>
            <div class="mb-3">
                <label  class="form-label ">Email :</label>
                <input type="email" class="form-control" name="emailName" required>
            </div>
            <div class="mb-3">
                <label  class="form-label ">Mobile No : :</label>
                <input type="text" class="form-control" name="mobileName" required >
            </div>
            <div class="mb-3">
                <label  class="form-label ">Address :</label>
                <input type="text" class="form-control" name="addressName" required >
            </div>
            <label  class="form-label ">Type Of Content :</label>
            <select name="typeName" >
                <option>Type</option>
                <option>Wedding</option>
                <option>Birthday</option>
                <option>Marriage</option>
                <option>ModelShoot</option>

            </select>
            <div class="mb-3">
                <label  class="form-label ">Date :</label>
                <input type="text" class="form-control" name="dateName" required>
            </div>
            <div class="mb-3">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                    <label class="form-check-label" for="inlineRadio1">Day Shooting</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                    <label class="form-check-label" for="inlineRadio2">Night Shooting</label>
                </div>

            </div>

            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Submit</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>