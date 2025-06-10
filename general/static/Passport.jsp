<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Passport</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>


<div class="d-flex justify-content-center align-items-center  ">
    <div class="border border-primary rounded p-5" >
        <h1>Passport</h1>
        <form action="passport" method="POST">
            <div class="mt-3">
                <label  class="form-label ">Name :</label>
                <input type="text" class="form-control" name="nameName" required >
            </div>
            <div class="mb-3">
                <label  class="form-label ">Adhar Number</label>
                <input type="number" class="form-control" name="adharNo" required>
            </div>
            <div class="mb-3">
                <label  class="form-label ">Address</label>
                <input type="text" class="form-control" name="address" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">Pan No</label>
                <input type="number" class="form-control" name="panNo" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">Country</label>
                <input type="text" class="form-control" name="country" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">State</label>
                <input type="text" class="form-control" name="state" required>
            </div>
            <div class="mb-3">
                <label  class="form-label">City</label>
                <input type="text" class="form-control" name="city" required>
            </div>

            <div class="mb-3">
                <label  class="form-label">Pin Code</label>
                <input type="number" class="form-control" name="pinCode" required>
            </div>
            <label  class="form-label ">Passport Type:</label>
            <select name="passportType" >
                <option>select</option>
                <option>BCOM</option>
                <option>BBA</option>
                <option>BCA</option>

            </select>
            <div class="mb-3">
                <label  class="form-label">PaymentRefNo</label>
                <input type="number" class="form-control" name="paymentRefNo" required>
            </div>
            <div class="d-grid ">
                <button type="submit" class="btn btn-primary ">Submit</button>
            </div>
        </form>
    </div>

</body>
</html>