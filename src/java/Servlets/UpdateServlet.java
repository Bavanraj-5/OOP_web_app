/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import AddDelete.UpdateEmployee;
import Employee.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public UpdateServlet(){
        super();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String Empname=request.getParameter("name");
        int Eno=Integer.parseInt(request.getParameter("eno"));
        int num=Integer.parseInt(request.getParameter("contact"));
	String address=request.getParameter("address");

		
	Employee emp=new Employee();
        emp.setName(Empname);
        emp.seteno(Eno);
        emp.setContact(num);
        emp.setAdd(address);
		
	UpdateEmployee upEmp=new UpdateEmployee();
	if(upEmp.updateEmp(emp))
            response.sendRedirect("updated.html");	
	}

}
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   