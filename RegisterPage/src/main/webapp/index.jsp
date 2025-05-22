<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StudentRegistration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
    
    <form action="register" method="post" class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">
        <div class="card p-4 w-100" style="max-width: 600px;">
            <h1 class="text-center mb-4">Registration Form</h1>
            <div class="form-group">
              <label>FirstName</label>
              <input type="text" placeholder="Enter first name" class="form-control" name="firstName">
        
            </div>
        </br>
            <div class="form-group">
                <label>LastName</label>
                <input type="text" placeholder="Enter Last name" class="form-control" name="lastName">
            </div>
        </br>
            <div class="form-group">
                <label>ParentName</label>
                <input type="text" placeholder="Enter ParentName" class="form-control" name="parentName">
            </div>
        </br>
            <div class="form-group">
                <label>ContactNumber</label>
                <input type="number" placeholder="Enter mobile number" class="form-control" name="contactNumber">
            </div>
        </br>
            <div class="form-group">
                <label>Date of Birth</label>
                <input type="date" name="birthDate" class="form-control">
            </div>
        </br>
            <div class="form-group">
                <label>Email</label>
                <input type="text" placeholder="Enter Email"  class="form-control" name="email">
            </div>
        </br>
            <div class="form-group">
                <label>Password</label>
                <input type="password" placeholder="Enter password" class="form-control" name="password">
            </div>
        </br>
            <div class="form-group">
                <label>ConfirmPassword</label>
                <input type="password" placeholder="Re Enter Password" class="form-control" name="confirmPassword">
            </div>
        </br>
            <div class="form-group text-center">
                <input type="submit" class="btn btn-primary" value="Submit">
                <input type="reset" class="btn btn-secondary" value="Reset">
            </div>

            <div class="text-center">
                <a href="fetch" class="btn btn-link">Fetch Records</a>
              </div>
        </div>

    </form>
</body>
</html>
