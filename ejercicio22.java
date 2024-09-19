/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
 import java.util.Scanner;
/**
  Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Verificar que el número sea positivo
        if (numero < 0) {
            System.out.println("El número debe ser entero positivo.");
        } else {
            // Llamar al método recursivo y mostrar el resultado
            int resultado = SumaDigitosRecursiva.sumarDigitos(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
        }
    }        
   

class SumaDigitosRecursiva {

    // Método recursivo para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        // Caso base: si el número es 0, la suma de sus dígitos es 0
        if (numero == 0) {
            return 0;
        }
        // Caso recursivo: sumar el dígito más el resultado de la llamada recursiva
        return (numero % 10) + sumarDigitos(numero / 10);
    }

    
        
    }
}


