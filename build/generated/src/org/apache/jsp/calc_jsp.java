package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class calc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function calculate(){\n");
      out.write("                var x = document.getElementById(\"bsal\").value;\n");
      out.write("                var y = document.getElementById(\"otr\").value;\n");
      out.write("                var z = document.getElementById(\"oth\").value;\n");
      out.write("                var p = parseFloat(x)+(parseFloat(y) * parseFloat(z));\n");
      out.write("                document.getElementById(\"result\").value = p;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"pink\">\n");
      out.write("        <div align=\"center\">\n");
      out.write("        <h1> Employee Details</h1>\n");
      out.write("                <table width=\"50%\" border=\"5%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Eno</th>\n");
      out.write("                        <th>Mobile</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        try{
                            Class.forName("com.mysql.jdbc.Driver");  
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventers","root","");
            
                            Statement stmt=con.createStatement();  
                            ResultSet rs=stmt.executeQuery("select * from employee");  
                            while(rs.next()){
                     
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("Eno") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("Mobile") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("Address") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
 }con.close();  
                        }catch(Exception e)
                            { System.out.println(e);}  
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <form method=\"post\" action=\"sendCal.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <tr><td>Employee Number</td><td><input type=\"text\" id=\"Enum\"></td></tr>\n");
      out.write("                        <tr><td>Basic Salary</td><td><input type=\"text\" id=\"bsal\"></td></tr>\n");
      out.write("                        <tr><td>OT Rate</td><td><input type=\"text\" id=\"otr\"></td></tr>\n");
      out.write("                        <tr><td>OT Hours</td><td><input type=\"text\" id=\"oth\"></td></tr>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"button\" value=\"Calculate Salary\" onclick=\"calculate()\"></td>\n");
      out.write("                        <td><input type=\"text\" id=\"result\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"Save Salary Details\">\n");
      out.write("            </form>\n");
      out.write("        </div>            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
