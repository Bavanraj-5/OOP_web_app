/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import Employee.Salary;
import AddDelete.Calculate;

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
@WebServlet(name = "SalaryServlet", urlPatterns = {"/SalaryServlet"})
public class SalaryServlet extends HttpServlet {

     private static final long serialVersionUID =1L;
    
    public SalaryServlet(){
        super();
    }
   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int eno=Integer.parseInt(request.getParameter("Enum"));
        float salary=Float.parseFloat(request.getParameter("bsal"));
        float otr=Float.parseFloat(request.getParameter("otr"));
        float othrs=Float.parseFloat(request.getParameter("oth"));
        float tot=Float.parseFloat(request.getParameter("result"));

        

        
        Salary sal=new Salary();
        sal.seteno(eno);
        sal.setSal(salary);
        sal.setOtr(otr);
        sal.setOthrs(othrs);
        sal.setTot(tot);
        
        Calculate cal = new Calculate();
        if(cal.calculateSal(sal))
            response.sendRedirect("added.html");
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
   