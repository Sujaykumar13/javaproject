<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>common-modules</title>
  <link rel="icon" href="https://www.x-workz.in/Logo.png">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>

<body class="d-flex flex-column min-vh-100">
 <header class="bg-dark text-white">
  <div class="d-flex justify-content-between align-items-center p-3">
    <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">
    <div>

      <button type="button" class="btn btn-info mr-2"><a href="register" style="color: white;">Register</a></button>
      <button type="button" class="btn btn-info"><a href="login" style="color: white;">Log in</a></button>
    </div>
  </div>
 </header>

  <hr color="black">



  <footer class="bg-dark py-3 mt-auto">
    <div class="container">
      <div class="row text-center text-md-left">
        <div class="col-md-4 offset-md-4 mb-2 mb-md-0 d-flex justify-content-center text-white">
          <span>Copyright &copy; xworks</span>
        </div>
        <div class="col-md-4 d-flex justify-content-md-end justify-content-center">
          <span id="datetime" class="text-white-50"></span>
        </div>
      </div>
    </div>
  </footer>

  <script>
    function updateDateTime() {
      const now = new Date();
      const options = {
        weekday: 'short',
        year: 'numeric',
        month: 'short',
        day: 'numeric',
        hour: '2-digit',
        minute: '2-digit',
        second: '2-digit'
      };
      document.getElementById('datetime').textContent = now.toLocaleString('en-US', options);
    }

    updateDateTime();
    setInterval(updateDateTime, 1000);
  </script>

</body>
</html>