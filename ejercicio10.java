/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea que la frase se convierta en todo mayuscula ?");
        
        String respuesta = scanner.nextLine();
        
        if (respuesta == "si" || respuesta == "SI") {
            String palabra_mayuscula = respuesta.toUpperCase();
            System.out.println(palabra_mayuscula);
        }
    }
}
