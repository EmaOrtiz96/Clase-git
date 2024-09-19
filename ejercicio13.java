/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena");
        String cadena2 = scanner.nextLine();
        
        int verificacion = cadena1.indexOf(cadena2);
        if (verificacion == -1) {
            System.out.println("No se encuentra");
        } else {
            System.out.println("Si se encuentra");
        }
        
        /*
        boolean seEncuentra = cadena1.contains(cadena2);
        if(seEncuentra) {
            System.out.println("Si se encuentra");
        } else {
            System.out.println("No se encuentra");
        }
        */
    }
}
