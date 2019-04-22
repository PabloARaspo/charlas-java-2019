package com.eiv;

import java.util.Arrays;
import java.util.List;

public class Persona {

    private Long id;
    private String apellido;
    private String nombre;
    private Integer edad;
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(Long id, String nombre, String apellido, Integer edad) {
        super();
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        
    }
    
    public static List<Persona> personas() {
        return Arrays.asList(
            new Persona(1L, "Diego", "Cairone", 23),
            new Persona(2L, "Franco", "Raspo", 43),
            new Persona(3L, "Pablo", "Raspo", 45),
            new Persona(4L, "Analía", "Raspo", 40),
            new Persona(5L, "Paula", "Herrera", 42),
            new Persona(6L, "Julio", "Martinez", 43),
            new Persona(7L, "Nicolas", "Fabucci", 38),
            new Persona(8L, "Natalia", "Lopez", 34),
            new Persona(9L, "Eduardo", "Nazor", 45),
            new Persona(10L, "Sergio", "Freschi", 23),
            new Persona(11L, "Matias", "Maini", 25),
            new Persona(12L, "Ismael", "Ait", 26)
        );
    }

}
