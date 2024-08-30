/*
 Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.err.println("Ingrese un numero de 3 digitos");
        numero = scanner.nextInt();
        
        if (numero>=100 && numero<=999) {
            int ultimoDigito = numero % 10;
            int medioDigito = (numero / 10) % 10;
            int primerDigito = numero / 100; 
            
            int suma = ultimoDigito + medioDigito + primerDigito;
            
            System.err.println(suma);
            
            
        } else {
            System.err.println("El numero ingresado no es valido");
        }
        
        
    }
}
