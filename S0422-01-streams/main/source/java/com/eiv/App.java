package com.eiv;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Persona> personas = Persona.personas();
        
        personas.forEach(persona -> System.out.println(persona));
        
        List<String> apellidos = personas.stream()
                .map(persona -> persona.getApellido())
                .collect(Collectors.toList());
        apellidos.sort((a1, a2) -> a1.compareTo(a2));
        apellidos.forEach(apellido -> System.out.println(apellido));
               
        boolean bool = apellidos.stream().allMatch(p -> p.contains("Raspo"));
        System.out.println(bool);
        
        boolean bool2 = apellidos.stream().anyMatch(p -> p.contains("Raspo"));
        System.out.println(bool2);
        
        boolean bool3 = apellidos.stream().noneMatch(p -> p.contains("Ruperto"));
        System.out.println(bool3);
        
        Integer edades = personas.stream()
                .map(edad -> edad.getEdad())
                .reduce(0, (p1, p2) -> p1 + p2);
        System.out.println("Suma de edades: " + edades);

    }

}
