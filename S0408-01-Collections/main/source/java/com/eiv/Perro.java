package com.eiv;

public class Perro {

    String nombre;

    public Perro() {
    }
    
    public Perro(String pNombre) {
        this.nombre = pNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
