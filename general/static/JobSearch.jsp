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


<div class="d-flex justify-content-center align-items-center vh-100 ">
    <div class="border border-primary rounded p-5" >

        <h1>Job Application Form</h1>

        <form action="jobapplication" method="GET">
            <div class="mb-3">
                <label  class="form-label ">Search :</label>
                <input type="text" class="form-control" name="searchName"  required >
            </div>

            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Submit</button>
            </div>
        </form>
    </div>

</body>
</html>