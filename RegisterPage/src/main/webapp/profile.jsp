<%@ page isELIgnored="false"%>
<html>
<body>
<form action="update" method="post" class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">
        <div class="card p-4 w-100" style="max-width: 600px;">
            <div class="form-group">
            <label>Id</label>
            <input type="text" value=${dto.id} name="id" class="form-control" readonly>
            </div>
        </br>
            <div class="form-group">
              <label>FirstName</label>
              <input type="text"  value=${dto.firstName} class="form-control" name="firstName">

            </div>
        </br>
            <div class="form-group">
                <label>LastName</label>
                <input type="text" value=${dto.lastName} class="form-control" name="lastName">
            </div>
        </br>
            <div class="form-group">
                <label>ParentName</label>
                <input type="text" value=${dto.parentName} class="form-control" name="parentName">
            </div>
        </br>
            <div class="form-group">
                <label>ContactNumber</label>
                <input type="number" value=${dto.contactNumber} class="form-control" name="contactNumber">
            </div>
        </br>
            <div class="form-group">
                <label>Date of Birth</label>
                <input type="date" value=${dto.birthDate} class="form-control" name="birthDate">
            </div>
        </br>
            <div class="form-group">
                <label>Email</label>
                <input type="text" value=${dto.email} class="form-control" name="email">
            </div>
        </br>
            <div class="form-group">
                <label>Password</label>
                <input type="password" value=${dto.password} class="form-control" name="password">
            </div>
        </br>
            <div class="form-group">
                <label>ConfirmPassword</label>
                <input type="password" value=${dto.confirmPassword} class="form-control" name="confirmPassword">
            </div>
        </br>
            <div class="form-group text-center">
                <input type="submit" value="Submit" class="btn btn-primary">
                <input type="reset" value="Reset" class="btn btn-primary">
            </div>
        </div>

    </form>

</body>
</html>