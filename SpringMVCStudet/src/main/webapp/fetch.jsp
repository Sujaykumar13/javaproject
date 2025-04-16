<%@ page isELIgnored="false" %>
<html>
<body>
<h1>Data is fetch based on id</h1>
<form action="update" method="get">
        <h2>College Admission Application</h2>
        <div>
                    <label>Id:</label><br>
                    <input type="text" size="20" value=${dto.id} name="id" readonly/>

                </div>
        <div>
            <label>Student Name:</label><br>
            <input type="text" size="20"value=${dto.studentName} name="studentName"/>

        </div>
        <div>
            <label>Parent Name:</label><br>
            <input type="text" size="20"value=${dto.parentName} name="parentName" />

        </div>
        <div>
            <label>Age:</label><br>
            <input type="number" size="20" value=${dto.age} name="age"/>

        </div>
        <div>
            <label>Contact number:</label><br>
            <input type="number" value=${dto.phoneNumber} name="phoneNumber"/>
        </div>
        <div>
            <label>Email:</label><br>
            <input type="email" value=${dto.email} name="email">
        </div>

         <div>
             <label>Date of birth:</label><br>
             <input type="date"/ value=${dto.birthDate} name="birthDate">
         </div>
         <div>
            <label>Gender:</label><br>
            male<input name="Gender" type="radio" value="male"/>
            female <input name="Gender" value=${dto.gender} type="radio" value="female"/>
        </div>
        <div>
            <label>Address:</label><br>
            <input type="type" value=${dto.address} name="address"/>
        </div>
        <div>
                    <label>Combination:</label><br>
                    <select name="combination">
                        <option value="pleaseSelect">Please select</option>
                        <option value="physics">Physics</option>
                        <option value="chemistry">Chemistry</option>
                        <option value="mathematics">Mathematics<a</option>
                        <option value="biology">Biology</option>
                        <option value="CS">ComputerScience</option>
                        <option value="stats">Statics</option>
                    </select>
                </div>
                 <div>
                     <label>Upload Photo:</label><br>
                     <input type="file"/>
                 </div>
                 <div>
                    <input type="checkbox" name="check" value="accept terms and condition"/><label>accept terms and condition</label>

                 </div>


         <div>
             <input type="submit" value="submit"/>
             <input type="reset" value="reset"/>
         </div>
</body>
</html>