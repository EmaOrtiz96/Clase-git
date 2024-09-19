/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.Scanner;

/**
 Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc”
 */
public class ejercicio23 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario una cadena
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        // Llamar al método recursivo y mostrar el resultado
        String cadenaInvertida = InvertirCadenaRecursiva.invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        
    }
}
class InvertirCadenaRecursiva {

    // Método recursivo para invertir una cadena
    public static String invertirCadena(String cadena) {
        // Caso base: si la cadena está vacía o tiene un solo carácter, ya está invertida
        if (cadena.isEmpty()) {
            return cadena;
        }
        // Caso recursivo: invierte el resto de la cadena y añade el primer carácter al final
        return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
    }

   
}


