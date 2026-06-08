<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StudentRegistration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
    
    <!-- <form action="register" method="post" class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100">
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

    </form> -->

    <div class="container mt-5 text-center">
    <input type="button" class="btn btn-primary" value="Department" id="departmentBtn">
    <input type="button" class="btn btn-secondary" value="Employee" id="employeeBtn">
    <input type="button" class="btn btn-success" value="Fetch" id="fetchBtn">
</div>

<!-- Department Modal -->
<div class="modal fade" id="departmentModal" tabindex="-1" aria-labelledby="departmentModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <form id="departmentForm" action="dept">
        <div class="modal-header">
          <h5 class="modal-title" id="departmentModalLabel">Add Department</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div class="mb-3">
            <label for="deptName" class="form-label">Department Name</label>
            <input type="text" class="form-control" id="department" name="departmentName" required>
          </div>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </form>
    </div>
  </div>
</div>

<!-- Employee Modal -->
<div class="modal fade" id="employeeModal" tabindex="-1" aria-labelledby="employeeModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <form id="employeeForm" action="emp">
        <div class="modal-header">
          <h5 class="modal-title" id="employeeModalLabel">Add Employee</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div class="mb-3">
            <label for="empName" class="form-label">Employee Name</label>
            <input type="text" class="form-control" id="empName" name="employeeName" required>
          </div>
          <div class="mb-3">
            <label for="deptId" class="form-label">Department ID</label>
            <input type="text" class="form-control" id="deptId" name="department_id_list" required>
          </div>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-secondary">Submit</button>
        </div>
      </form>
    </div>
  </div>
</div>

<!-- Fetch Modal -->
<div class="modal fade" id="fetchModal" tabindex="-1" aria-labelledby="fetchModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <form id="fetchForm" action="fetchemp">
        <div class="modal-header">
          <h5 class="modal-title" id="fetchModalLabel">Fetch Data</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div class="mb-3">
            <label for="fetchId" class="form-label">ID</label>
            <input type="text" class="form-control" id="fetchId" name="departmentId" required>
          </div>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-success">Fetch</button>
        </div>
      </form>
    </div>
  </div>
</div>

<!-- Bootstrap JS + jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
  $(document).ready(function(){
    $('#departmentBtn').click(function(){
      var deptModal = new bootstrap.Modal(document.getElementById('departmentModal'));
      deptModal.show();
    });

    $('#employeeBtn').click(function(){
      var empModal = new bootstrap.Modal(document.getElementById('employeeModal'));
      empModal.show();
    });

    $('#fetchBtn').click(function(){
      var fetchModal = new bootstrap.Modal(document.getElementById('fetchModal'));
      fetchModal.show();
    });

   
  });
</script>
</body>
</html>
