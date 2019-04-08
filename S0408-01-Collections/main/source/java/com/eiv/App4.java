package com.eiv;

import java.util.ArrayList;
import java.util.List;

public class App4 {

    public static void main(String[] args) {

        List<Perro> perros = new ArrayList<Perro>();
        
        perros.add(new Perro("Cachito"));
        perros.add(new Perro("Batuque"));
        perros.add(new Perro("Pipon"));
        perros.add(new Perro("Ruperto"));
        perros.add(new Perro("Juanito"));
        
        Perro perro1 = new Perro("Tito");
        perros.add(perro1);
        
        for(Perro sperro : perros) {
            System.out.println("Nombres de Perro:_" + sperro.getNombre());
        }
        
        System.out.println("Esta Vacia: " + perros.isEmpty());
        System.out.println("Cantidad: " + perros.size());
        System.out.println("Tiene al Perror " + perro1.getNombre() + ": " + perros.contains(perro1));
        
        
        
        
    }

}
