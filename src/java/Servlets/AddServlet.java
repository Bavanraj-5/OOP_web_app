
package Servlets;
import Employee.Employee;
import AddDelete.AddEmployee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID =1L;
    
    public AddServlet(){
        super();
    }
   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ename=request.getParameter("name");
        int eno=Integer.parseInt(request.getParameter("eno"));
        int contact=Integer.parseInt(request.getParameter("contact"));
        String add=request.getParameter("address");
        
        Employee emp=new Employee();
        emp.setName(ename);
        emp.seteno(eno);
        emp.setContact(contact);
        emp.setAdd(add);
        
        AddEmployee employee = new AddEmployee();
        if(employee.addEmp(emp))
            response.sendRedirect("added.html");
    }

}
