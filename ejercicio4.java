/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 Desarrolle un programa que ayude a una cajera a determinar el número de
billetes y monedas que se necesitan de cada una de las siguientes
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es
1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2
billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos. 
 */
public class ejercicio4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el valor en formato decimal (por ejemplo, 1390.55):");
        double cantidad = scanner.nextDouble();
        
        
        int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
        
       
        System.out.println("Billetes:");
        for (int billete : billetes) {
            int cantidadBilletes = (int) (cantidad / billete);
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billete(s) de " + billete);
                cantidad -= cantidadBilletes * billete;
            }
        }
        
        
        double[] monedas = {0.50, 0.25, 0.10, 0.05};
        
        
        System.out.println("Monedas:");
        for (double moneda : monedas) {
            int cantidadMonedas = (int) (cantidad / moneda);
            if (cantidadMonedas > 0) {
                System.out.println(cantidadMonedas + " moneda(s) de " + moneda);
                cantidad -= cantidadMonedas * moneda;
            }
        }
        }
        }
    

