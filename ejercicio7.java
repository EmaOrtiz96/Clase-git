/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;



/**
 Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
 * @author emanuel
 */
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena:");
        String texto = scanner.nextLine();
        
        // Determinar el tamaño de la cadena
        int longitud = texto.length();
        System.out.println("El tamaño de la cadena es: " + longitud);
        
        // Contar las vocales en la cadena
        int contador_vocales = 0;
        boolean[] resultado = new boolean[1]; // Array para almacenar el resultado
        
        for (int i = 0; i < longitud; i++) {
            char caracter = texto.charAt(i);
            // Llamar al método esVocal y pasar el array para obtener el resultado
            esVocal(caracter, resultado);
            if (resultado[0]) {
                contador_vocales++;
            }
        }
        
        // Imprimir el número total de vocales
        System.out.println("Número total de vocales: " + contador_vocales);
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un carácter es una vocal (sin retornar valor)
    public static void esVocal(char c, boolean[] resultado) {
        // Convertir el carácter a minúscula para simplificar la comparación
        c = Character.toLowerCase(c);
        
        // Inicializar el resultado como false
        resultado[0] = false;
        
        // Verificar si el carácter es una vocal y actualizar el resultado
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            resultado[0] = true;
        }
    }
}

