package com.emergentes;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//////////////////////////////////////////
// ESTUDIANTE: Williams Quiñajo Fernandez
// CI: 7086899     RU: 200020951
/////////////////////////////////////////

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("Application/PDF");
        OutputStream out = response.getOutputStream();

        try {
            Document document = new Document();
            String dest = "HolaMundo.pdf";
             PdfWriter.getInstance(document,out);
            document.open();
            
            document.add(new Paragraph("PDF GENERADO DE DESDE UN SERVLET"));
            document.add(new Paragraph("ESTUDIANTE: Williams Quiñajo Fernandez"));
            document.add(new Paragraph("CI: 7086899     RU: 200020951"));
             
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(RespPDF.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }
}
