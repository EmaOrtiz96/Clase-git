/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 - Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = scanner.nextLine();
        String palabra2 = scanner.nextLine();
        
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("las palabras no son iguales");
        }
    }
}
