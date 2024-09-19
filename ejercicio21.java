/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
  import java.util.Scanner;
/**
 Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
public class ejercicio21 {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario un número entero mayor a cero
        System.out.print("Ingrese un número entero mayor a cero: ");
        int numero = scanner.nextInt();
        
        // Validar que el número sea mayor a cero
        if (numero <= 0) {
            System.out.println("El número debe ser mayor a cero.");
        } else {
            // Llamar al método recursivo y mostrar el resultado
            int resultado = SumaRecursiva.sumaHastaUno(numero);
            System.out.println("La suma de todos los números desde " + numero + " hasta 1 es: " + resultado);
        }
        
        
    }

class SumaRecursiva {
    // Método recursivo para sumar todos los números desde n hasta 1
    public static int sumaHastaUno(int n) {
        // Caso base: si n es 1, simplemente devuelve 1
        if (n <= 1) {
            return 1;
        }
        // Caso recursivo: n más la suma de los números hasta n-1
        return n + sumaHastaUno(n - 1);
    }

    
}

}
