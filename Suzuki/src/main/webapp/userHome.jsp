<%@ page isELIgnored="false" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>suzuki</title>
      <link rel="icon" href="https://wallpapers.com/images/hd/suzuki-logo3-d-rendering-wr9u1i83mycuikpy-2.jpg">
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
      <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>

    <body class="d-flex flex-column min-vh-100">

      <style>
        header {
          position: fixed;
          top: 0;
          width: 100%;
          z-index: 1030;
          /* Ensure it stays above other content */
        }

        body {
          padding-top: 70px;
          /* Adjust to prevent content being hidden behind the header */
        }

        a {
          display: inline;
          padding: 0;
          margin: 0;
        }
      </style>

      <header class="bg-dark text-white">
        <div class="d-flex justify-content-between align-items-center px-3 py-2">
          <img src="https://wallpapers.com/images/hd/suzuki-logo3-d-rendering-wr9u1i83mycuikpy-2.jpg" alt="Suzuki Logo"
            width="50">

          <div class="d-flex align-items-center">
            <img src="userImage?userImageFileName=${userDto.userImageFileName}" class="rounded-circle mx-2" alt="userImage" width="60"
        data-bs-toggle="modal" data-bs-target="#imageModal"/>
            <a href="profile?userEmailId=${userEmail}" class="btn btn-info btn-sm mr-2">Profile</a></br>
            <a href="userLogout?userEmailId=${userEmail}" class="btn btn-info btn-sm">Logout</a>
          </div>

        

        </div>
      </header>

     







      <footer class="bg-dark py-3 mt-auto">
        <div class="container">
          <div class="row text-center text-md-left">
            <div class="col-md-4 offset-md-4 mb-2 mb-md-0 d-flex justify-content-center text-white">
              <span>Copyright &copy; 2025, All Rights Reserved</span>
            </div>
          </div>
        </div>
      </footer>


    </body>

    </html>



    <!-- <div class="container my-4">
      <div class="d-flex justify-content-start">
        <div class="col-sm-12 col-md-6 col-lg-4 p-0">
          <div class="card shadow-lg border-primary">
            <div class="card-header bg-primary text-white text-center">
              <h4 class="mb-0">No of Showrooms</h4>
            </div>
            <div class="card-body text-center">
              <h5>Total Branches</h5>
              <span class="badge badge-pill badge-dark display-4">${branch}</span>
              <hr>
              <div class="mb-3">
                <div class="card border-success">
                  <div class="card-body text-center">
                    <h6 class="text-success">Active</h6>
                    <span class="badge badge-success display-4">${active}</span>
                  </div>
                </div>
              </div>
              <div class="mb-3">
                <div class="card border-secondary">
                  <div class="card-body text-center">
                    <h6 class="text-secondary">Inactive</h6>
                    <span class="badge badge-secondary display-4">${inactive}</span>
                  </div>
                </div>
              </div>
              <div>
                <div class="card border-warning">
                  <div class="card-body text-center">
                    <h6 class="text-warning">Under Maintenance</h6>
                    <span class="badge badge-warning display-4 text-white">${maintain}</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div> -->