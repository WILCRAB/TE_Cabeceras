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


@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        response.setContentType("application/json");
        PrintWriter out = response.getWriter ();

        try{
            out.print("{\"empleados\":[");
            out.print("{\"nombre\": \"Williams\", \"apellidos\": \"Quiñajo\"},"); 
            out.print("{\"nombre\": \"Juan\", \"apellidos\": \"Fernandez \"),"); 
            out.print("{\"nombre\": \"Maria\", \"apellidos\": \"Espinoza\"}"); 
            out.print("]}");

        }finally{
            out.close();
        }
    }

}
