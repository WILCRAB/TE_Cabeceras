package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//////////////////////////////////////////
// ESTUDIANTE: Williams Quiñajo Fernandez
// CI: 7086899     RU: 200020951
/////////////////////////////////////////



@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/HTML");
        PrintWriter out = response.getWriter();
        
        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta HTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HTML GENERADO DE DESDE UN SERVLET</h1>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

}
