package com.eiv;

import java.util.Scanner;

public class AppDiv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        String dato = scanner.next();
        System.out.println("Ingrese un divisor: ");
        String divisor = scanner.next();
        scanner.close();
        try {
            Integer numero = Integer.valueOf(dato);
            Integer numero2 = Integer.valueOf(divisor);
            Integer numero3 = numero / numero2;

            System.out.println("El número ingresado es: " + numero);
            System.out.println("La división da: " + numero3);
        } catch (NumberFormatException e) {
            System.out.println("No es un número!!");
        } catch (ArithmeticException e) {
            System.out.println("División por cero!");
        } finally {
            System.out.println("Fin del proceso.");
        }
    }

}
