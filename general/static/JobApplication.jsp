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

    <form action="jobapplication" method="POST">
        <div class="mb-3">
            <label  class="form-label ">Name :</label>
            <input type="text" class="form-control" name="nameName" value="${job.name}" required ><span class="text-danger">${message}</span>
        </div>
        <div class="mb-3">
            <label  class="form-label ">Email</label>
            <input type="email" class="form-control" name="emailName" value="${job.email}"required>
        </div>
        <label  class="form-label ">Education:</label>
        <select name="educationName" value="${job.education}" >
            <option>select</option>
            <option>BCOM</option>
            <option>BBA</option>
            <option>BCA</option>
            <option>BSC</option>
            <option>BTECH</option>
            <option>MBA</option>
            <option>MCA</option>
            <option>MTECH</option>
            <option>MSC</option>
        </select>
        <div class="mb-3">
            <label  class="form-label ">Skills</label>
            <input type="text" class="form-control" name="skillName" value="${job.skill}" required>
        </div>
        <div class="mb-3">
            <label  class="form-label">Salary</label>
            <input type="number" class="form-control" name="salary" value="${job.salary}" required>
        </div>
        <label  class="form-label">Experience:</label>
        <select name="experienceName" value="${job.experience}">
            <option>select</option>
            <option>0</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>

        </select>
        <div class="d-grid ">
            <button type="submit" class="btn btn-primary ">Submit</button>
        </div>
    </form>
</div>

</body>
</html>