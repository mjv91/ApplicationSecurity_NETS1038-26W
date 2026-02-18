package midterm.mv.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import midterm.mv.model.Employee;

/*
 * This servlet acts as the CONTROLLER in MVC.
 * 
 * Its job:
 * 1. Receive form data from the client
 * 2. Store it into the Model (Employee object)
 * 3. Forward/Display confirmation
 * 
 */

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // This method runs when the form is submitted using POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Fetching form values sent from the browser
        String fullName = request.getParameter("fullName");
        String contactNumber = request.getParameter("contactNumber");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String salaryStr = request.getParameter("salary");

        /*
         * Since salary is a decimal value,
         * we convert it from String to double.
         */
        double salary = Double.parseDouble(salaryStr);

        // Creating Model object
        Employee employee = new Employee();

        // Setting values into the model object
        employee.setFullName(fullName);
        employee.setContactNumber(contactNumber);
        employee.setEmail(email);
        employee.setDate(date);
        employee.setSalary(salary);

        /*
         * For this part,
         * we are simply printing confirmation.
         */

        response.setContentType("text/html");
        response.getWriter().println("<h2>Form Submitted Successfully!</h2>");
        response.getWriter().println("<p>Full Name: " + employee.getFullName() + "</p>");
        response.getWriter().println("<p>Contact: " + employee.getContactNumber() + "</p>");
        response.getWriter().println("<p>Email: " + employee.getEmail() + "</p>");
        response.getWriter().println("<p>Date: " + employee.getDate() + "</p>");
        response.getWriter().println("<p>Salary: $" + employee.getSalary() + "</p>");
    }
}
