<%@ page isELIgnored="false" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>common-modules</title>
        <link rel="icon" href="https://www.x-workz.in/Logo.png">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
    </head>

    <body class="d-flex justify-content-center align-items-center min-vh-100" style="background-color: #e0f7fa;">
        <div class="position-absolute w-100 p-3 d-flex justify-content-between align-items-center" style="top: 0;">
            <img src="https://www.x-workz.in/Logo.png" alt="X-Workz Logo" width="80">
            <div>
                <button type="button" class="btn btn-primary mr-2"><a href="login" style="color: white; ">Log
                        in</a></button>
                <button type="button" class="btn btn-info"><a href="index" style="color:white;">Home</a></button>
            </div>
        </div>
            <div class="card text-center shadow p-4" style="width: 25rem; border: 1px solid #000; background-color: #ffffff;">
                <form action="sendOtp" method="post">
                    <label class="form-label">enter EmailId</label>
                    <input type="email" class="form-control" placeholder="enter your email" id="email" name="emailId"
                        onchange="checkEmail()" value="${dto}" required>
                    <span id="emailExists"></span>

                    <div>
                        <button type="submit" class="btn btn-secondary" id="sending otp">send OTP</button>
                        <span>
                            <p>${otpmsg}</p>
                        </span>
                    </div>

                </form>


                <form action="verificationOTP" method="post">

                    <input type="email" class="form-control" placeholder="enter your email" id="email" name="emailId"
                        onchange="checkEmail()" value="${dto}" hidden>
                    <label>Enter OTP</label>

                    <input type="text" class="form-control" name="otp">
                    <span>
                        <p>${verifymsg}</p>
                    </span>
                    <button type="submit" class="btn btn-success" id="verifyOtp">Verify Otp</button>
                </form>
            </div>
        

        <script>
            const checkEmail = async () => {

                let emailId = document.getElementById("email").value
                var button = document.getElementById("button");
                const response = await axios(" http://localhost:8080/modules/emailExist?emailId=" + emailId)

                if (emailId.length < 5) {
                    document.getElementById("emailExists").innerHTML = "<span style='color:red;'>invalid email</span>";
                    button.setAttribute("disabled", "");
                } else if (response.data == "email already exists") {
                    document.getElementById("emailExists").innerHTML = "<span style='color:red;'>email already exists</span>";
                    button.setAttribute("disabled", "");
                } else {
                    document.getElementById("emailExists").innerHTML = "<span style='color:green;'>email accepted</span>";
                    button.removeAttribute("disabled");
                }
                console.log(response.data)

            }
        </script>
        
    </body>

    </html>