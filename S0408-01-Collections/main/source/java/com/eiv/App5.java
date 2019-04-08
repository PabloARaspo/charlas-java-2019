package com.eiv;

import java.util.HashMap;
import java.util.Map;

public class App5 {

    public static void main(String[] args) {

        Map<Integer, Perro> mapa = new HashMap<Integer, Perro>();
        
        mapa.put(1, new Perro("Perro_1"));
        mapa.put(2, new Perro("Perro_2"));
        mapa.put(3, new Perro("Perro_3"));
        mapa.put(4, new Perro("Perro_4"));
        mapa.put(5, new Perro("Perro_5"));

        Perro perro1 = mapa.get(3);
        System.out.println("Perro: " + perro1);
        
        

    }

}
