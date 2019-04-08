package com.eiv;

import java.util.HashSet;
import java.util.Set;

public class App2 {

    public static void main(String[] args) {

        Set<String> nombres = new HashSet<String>();
        
        nombres.add("Juanito");
        nombres.add("Pancracio");
        nombres.add("Ruperto");
/*        nombres.add("Ruperto"); No permite duplicados ni da error al agregarlo*/
        
        for(String nombre : nombres) {
            System.out.println("Nombres: " + nombre);
        }
        

    }

}
