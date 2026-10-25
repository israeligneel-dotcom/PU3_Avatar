package com.artescontrol.resources;

import com.artescontrol.resources.ArteControl;
import com.artescontrol.resources.ArteControlDAO;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ArteControlServlet", urlPatterns = {"/listarArtes"})
public class ArteControlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArteControlDAO dao = new ArteControlDAO();
        List<ArteControl> artes = dao.listarArtes();
        
        request.setAttribute("artes", artes);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        String nombre = request.getParameter("nombre");
        String elementoOrigen = request.getParameter("elementoOrigen");
        String descripcion = request.getParameter("descripcion");
        int nivelDificultad = Integer.parseInt(request.getParameter("nivelDificultad"));
        
        ArteControl arte = new ArteControl();
        arte.setNombre(nombre);
        arte.setElementoOrigen(elementoOrigen);
        arte.setDescripcion(descripcion);
        arte.setNivelDificultad(nivelDificultad);
        
        ArteControlDAO dao = new ArteControlDAO();
        dao.agregarArte(arte);
        
        response.sendRedirect("listarArtes");
    }
}
