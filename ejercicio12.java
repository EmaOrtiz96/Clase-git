/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 - Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
 */
public class ejercicio12 {
    public static void main(String[] args) {
        
   
     
        String cadena = "Ejemplo de cadena";

        // Verificar que la cadena tenga al menos 5 caracteres
        if (cadena.length() >= 5) {
            // Extraer la cuarta y quinta letra
            
            String cuartaYQuintaLetra = cadena.substring(3, 5);
            
            // Imprimir el resultado
            System.out.println("La cuarta y quinta letra son: " + cuartaYQuintaLetra);
        } else {
            System.out.println("La cadena no tiene suficientes caracteres.");
        }
    }
}

    

