package com.ejemplo.model;

public class Tarea {

    private int id;
    private String titulo;
    private boolean completada;

    public Tarea(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.completada = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Setter
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}