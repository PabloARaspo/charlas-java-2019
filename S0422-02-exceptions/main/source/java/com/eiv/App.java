package com.eiv;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un número 1: ");
            String dato1 = scanner.next();
            System.out.println("Ingrese un número 2: ");
            String dato2 = scanner.next();
            
            Suma suma = new Suma(Integer.valueOf(dato1), Integer.valueOf(dato2));

            System.out.println("La suma da: " + suma.resultado());
        } catch (SumaException e) {
            if(e.getCodigo() == SumaException.dato1_mayor_dato2) {
                System.out.println("Dato1 mayor o igual a dato 2");
            } else if(e.getCodigo() == SumaException.dato1_mas_dato2_mayor10) {
                System.out.println("Dato1 más dato 2 mayor a 10.");
            }
        } catch (Exception e) {
            System.out.println("Se produjo el siguiente error: " + e.getMessage());
        }
    }
}
