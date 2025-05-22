<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RegisterPage</title>
    <link rel="icon" href="https://www.x-workz.in/Logo.png">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
  </head>

  <body  class="d-flex flex-column min-vh-100">
<header class="bg-dark text-white">
    <div class="d-flex justify-content-between align-items-center p-3">
      <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">
      <div>
        <button type="button" class="btn btn-info"><a href="index" style="color: white;">Home</a></button>
      </div>
    </div>
</header>
    <hr color="black">

    <form action="update" method="post" onclick="form()"
      class="shadow-lg p-3 mb-5 bg-body-tertiary rounded , bg-info d-flex justify-content-center align-items-center min-vh-100"
      enctype="multipart/form-data">


      <div class="card p-4 w-100" style="max-width: 600px;">
        <span id="Message"></span>

        <!-- <div class="d-flex justify-content-center align-items-center text-success fst-italic">
                <span>
                    <p>${msg}</p>
                </span>
            </div>
            <div class="d-flex justify-content-center align-items-center text-danger fst-italic">
                <span>
                    <p>${error}</p>
                </span>
            </div> -->

        <h1 class="text-center mb-4">Welcome to Profile</h1>
         <div class="text-center">
        <img src="image?fileName=${detail.fileName}">
      </div>
        <div>
          <input type="text" value=${detail.id} class="form-control" name="id" readonly hidden>
        </div>
        <div class="form-group">
          <label>FirstName</label>
          <input type="text" value=${detail.firstName} class="form-control" name="firstName" id="fName"
            onchange="fNameValidation()" required>
          <span id="Firstname" class="text-danger"></span>

        </div>
        </br>
        <div class="form-group">
          <label>LastName</label>
          <input type="text" value=${detail.lastName} class="form-control" name="lastName" id="lName"
            onchange="lNameValidation()" required>
          <span id="Lastname" class="text-danger"></span>

        </div>
        </br>
        <div class="form-group">
          <label>Email</label>
          <input type="email" value=${detail.emailId} class="form-control" name="emailId" id="emailIdd"
            onchange="checkEmail()" readonly required>
          <span id="emailExists" class="text-danger"></span>

        </div>

        </br>
        <div class="form-group">
          <label>ContactNumber</label>
          <input type="number" value=${detail.contactNumber} class="form-control" name="contactNumber" id="contactNo"
            onchange="phonee()" required>
          <span id="phone" class="text-danger"></span>

        </div>
        </br>

        <div class="form-group">
          <label>city</label>
          <input type="text" value=${detail.city} class="form-control" name="city" id="cityName" onchange="cityNamee()"
            required>
          <span id="CityName" class="text-danger"></span>

        </div>
        <br>

        <div>
          <label>Gender</label><br />
          male<input name="gender" id="male" value="male"  type="radio"  />
          female<input name="gender" id="female" value="female" type="radio" />
          <span id="Gendererror" class="text-danger"></span>

        </div>

        <br>
        <div class="form-group">
          <label>Password</label>
          <input type="password" value=${detail.password} class="form-control" name="password" id="pasword"
            onchange="passwordd()" required>
          <span id="errorPassword" class="text-danger"></span>
        </div>
        </br>

        <div>
          <label>Upload file</label>
          <input type="file" name="file" /><br />
        </div>
        <div class="form-group text-center">
          <input type="submit" id="button" class="btn btn-primary" value="Edit" style="color: white;">
          <button type="button" class="btn btn-info mr-2" name="${detail.firstName}"><a
              href="back?emailId=${detail.emailId}" style="color: white;">Back</a></button>
        </div>
    </form>
    <script>
      function fNameValidation() {
        var names = document.getElementById("fName").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length > 5 && names.length <= 30) {
          document.getElementById("Firstname").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("Firstname").innerHTML = "<span style='color:red;'>enter valid first name</span>";
          button.setAttribute("Disabled", "");
          return;
        }
      }

      function lNameValidation() {
        var names = document.getElementById("lName").value;
        console.log(names)
        var button = document.getElementById("button");
        if (names.trim() !== '' && names.length > 0 && names.length <= 30) {
          document.getElementById("Lastname").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("Lastname").innerHTML = "<span style='color:red;'>enter valid last name</span>";
          button.setAttribute("Disabled", "");
          return;
        }
      }

      function cityNamee() {
        var names = document.getElementById("cityName").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length > 5 && names.length <= 20) {
          document.getElementById("CityName").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("CityName").innerHTML = "<span style='color:red;'>enter valid city</span>";
          button.setAttribute("Disabled", "");
          return;
        }
      }

      function passwordd() {

        var names = document.getElementById("pasword").value;
        console.log(names)
        var button = document.getElementById("button");

        if (names.trim() !== '' && names.length >= 8 && names.length <= 20) {
          document.getElementById("errorPassword").innerHTML = "";
          button.removeAttribute("Disabled");
        } else {
          document.getElementById("errorPassword").innerHTML = "<span style='color:red;'>Enter valid password</span>";
          button.setAttribute("Disabled", "");
          return;
        }

      }

      const checkEmail = async () => {

        let emailId = document.getElementById("emailIdd").value;
        console.log(emailId);
        var button = document.getElementById("button");
        const response = await axios("http://localhost:8080/Modules/emailExist?emailId=" + emailId)

        if (emailId.length < 5) {
          document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
          button.setAttribute("disabled", "");
        } else {
          document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
          button.removeAttribute("disabled");
        }
        console.log(response.data)

      }

      const phonee = async () => {

        let contactNumber = document.getElementById("contactNo").value
        console.log(contactNumber)
        var button = document.getElementById("button");
        const response = await axios("http://localhost:8080/Modules/contactNumberExist?contactNumber=" + contactNumber)

        if (contactNumber.length < 10 || contactNumber.length > 10) {
          document.getElementById("phone").innerHTML = "<span style='color:red;'>invalid phone number</span>";
          button.setAttribute("disabled", "");
        } else {
          document.getElementById("phone").innerHTML = "<span style='color:green;'>valid</span>";
          button.removeAttribute("disabled");
        }

        console.log(response.data)

      }
      
      function form(event) {

        var fName = document.getElementById("fName").value;
        var lName = document.getElementById("lName").value;
        var city = document.getElementById("cityName").value;
        var email = document.getElementById("emailId").value;
        var phoneNo = document.getElementById("contactNumber").value;
        var password = document.getElementById("password").value;
        var maleChecked = document.getElementById("male").checked;
        var femaleChecked = document.getElementById("female").checked;
        var button = document.getElementById("button");


        if (
          fName.trim() != "" && fName.length > 5 && fName.length < 20 &&
          lName.trim() !== "" && lName.length > 0 && lName.length < 20 &&
          city.trim() !== "" && city.length > 5 && city.length < 20 &&
          email.trim() !== "" &&
          phoneNo.trim() !== "" && phoneNo.length == 10 &&
          password.trim() !== "" && password.length >= 8
        ) {

          if (maleChecked || femaleChecked) {
            document.getElementById("Message").innerHTML = "";
            button.removeAttribute("disabled");
          } else {
            document.getElementById("Message").innerHTML = "<span style='color:red;'>Please fill the form correctly</span>";
            button.setAttribute("disabled", "");
          }
        } else {
          document.getElementById("Message").innerHTML = "<span style='color:red;'>Please fill the form correctly</span>";
          button.setAttribute("disabled", "");
        }
      }


    </script>
    <footer class="bg-dark py-3 mt-auto">
    <div class="container">
      <div class="row text-center text-md-left">
        <div class="col-md-4 offset-md-4 mb-2 mb-md-0 d-flex justify-content-center text-white">
          <span>Copyright &copy; xworks</span>
        </div>
      </div>
    </div>
  </footer>
  </body>

  </html>