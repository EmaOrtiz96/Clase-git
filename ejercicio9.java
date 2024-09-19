/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
public class ejercicio9 {
    
    
    public static void main(String[] args) {
        // Cadena de texto dada
        String text = "La lluvia en Mendoza es escasa";
        
        // StringBuilder para almacenar el resultado
        StringBuilder asciiCodes = new StringBuilder();
        
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i); // Obtener el carácter en la posición i
            int asciiCode = (int) character; // Convertir el carácter a su código ASCII
            asciiCodes.append(asciiCode).append(" "); // Añadir el código ASCII seguido de un espacio
        }
        
        // Imprimir el resultado
        System.out.println(asciiCodes.toString().trim());
    }
}




