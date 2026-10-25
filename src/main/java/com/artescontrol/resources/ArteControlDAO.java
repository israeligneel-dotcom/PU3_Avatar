package com.artescontrol.resources;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArteControlDAO {

    public List<ArteControl> listarArtes() {
        List<ArteControl> lista = new ArrayList<>();
        String sql = "SELECT * FROM artes_control ORDER BY id ASC";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                ArteControl arte = new ArteControl();
                arte.setId(rs.getInt("id"));
                arte.setNombre(rs.getString("nombre"));
                arte.setElementoOrigen(rs.getString("elemento_origen"));
                arte.setDescripcion(rs.getString("descripcion"));
                arte.setNivelDificultad(rs.getInt("nivel_dificultad"));
                lista.add(arte);
            }
        } catch (Exception e) {
            System.out.println("Error al listar artes de control: " + e.getMessage());
        }
        return lista;
    }

    public void agregarArte(ArteControl arte) {
        String sql = "INSERT INTO artes_control (nombre, elemento_origen, descripcion, nivel_dificultad) VALUES (?, ?, ?, ?)";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, arte.getNombre());
            ps.setString(2, arte.getElementoOrigen());
            ps.setString(3, arte.getDescripcion());
            ps.setInt(4, arte.getNivelDificultad());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al guardar arte de control: " + e.getMessage());
        }
    }
}