package com.artescontrol.resources;

public class ArteControl {
    private int id;
    private String nombre;
    private String elementoOrigen;
    private String descripcion;
    private int nivelDificultad;

    public ArteControl() {
    }

    public ArteControl(int id, String nombre, String elementoOrigen, String descripcion, int nivelDificultad) {
        this.id = id;
        this.nombre = nombre;
        this.elementoOrigen = elementoOrigen;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElementoOrigen() {
        return elementoOrigen;
    }

    public void setElementoOrigen(String elementoOrigen) {
        this.elementoOrigen = elementoOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
}