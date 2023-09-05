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



@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
        response.setContentType("application/csv");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.csv");
        PrintWriter out = response.getWriter();
        
        try{
            out.println("id;tnombre;apellidos;edad");
            out.println("1;Williams;Quiñajo;23");
            out.println("2;Roger;Fernandez;14");
            out.println("3;bryan;Tapia;25");
            out.println("4;Wilson;Torrez;19");
        }finally{
            out.close();
        }
    }
    
}
