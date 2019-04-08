package com.eiv;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        
        nombres.add("EIV Software");
        nombres.add("Pablo");
        
        for(String nombre : nombres) {
            System.out.println("Nombres: " + nombre);
        }
        
        List<Perro> perros = new ArrayList<>();
        
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        
        perro1.setNombre("Cachito");
        perro2.setNombre("Pipon");
        perro3.setNombre("Tuqui");
        
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro1);
        
        for(Perro perro : perros) {
            Perro perrito = (Perro) perro;
            System.out.println("Perros: " + perrito);
        }
        
    }

}
