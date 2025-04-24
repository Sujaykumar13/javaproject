package com.xworks.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/form",loadOnStartup = 1)
public class Form extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("this is init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentName = req.getParameter("studentName");//this is used to fetch the data from front end
        String parentName = req.getParameter("parentName");//for each parameter we need to write one variable
        //we need to writew always in string and for int or any number type we need to use parseInt to convert string to int

        System.out.println("name is"+studentName);
        System.out.println("parentName"+parentName);

        //we not able to send response page of .jsp file directly to frontennd like spring so we use in 2 ways in one way is writing the page
        //this one way of writing page using getwriting
        //in this method we not able return .jsp file
        PrintWriter writer = resp.getWriter();
        resp.setContentType("html");//here we need to menntion which type of format u r wrtiing for text type mention text and for html mention html
        //writer.write("submitted successfully");
        writer.write("<html>\n" +
                "<body>\n" +
                "<h2>Hello World!</h2>\n" +
                "<a href=\"first\">click</a>\n" +
                "<form action=\"form\" method=\"get\">\n" +
                "<h2>College Admission Application</h2>\n" +
                "        <div>\n" +
                "            <label>Student Name:</label><br>\n" +
                "            <input type=\"text\" size=\"20\"placeholder=\"enter student name\" name=\"studentName\"/>\n" +
                "\n" +
                "        </div>\n" +
                "        <div>\n" +
                "            <label>Parent Name:</label><br>\n" +
                "            <input type=\"text\" size=\"20\"placeholder=\"enter parent name\" name=\"parentName\" />\n" +
                "\n" +
                "        </div>\n" +
                "         <div>\n" +
                "             <input type=\"submit\" value=\"submit\"/>\n" +
                "             <input type=\"reset\" value=\"reset\"/>\n" +
                "         </div>\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("post method is workig");
        String studentName = req.getParameter("studentName");
        String parentName = req.getParameter("parentName");

        System.out.println("name is"+studentName);
        System.out.println("parentName"+parentName);

        //in order to send a response in .jsp file we need follow this method

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");//it is for mention .jsp file path

        req.setAttribute("dto","successfully submitted");//this for expression language

        dispatcher.forward(req,resp);//in this req and resp are the properties from parameterised variale
    }
}

//after this to store data in database after String studentName = req.getParameter("studentName"); this step for every property
//we need to add to dto manually by using setters and to get we need to use geters
//after this crud operation is similar to spring
//in spring controller class there but in servlet from here we need to send to service
//we need to cretae a object manually to call service and repo instead of autowired in spring
//service object in servletclass
//and repo object in service and we not need to create object for servlet class
//we said response in servlet and view in spring
