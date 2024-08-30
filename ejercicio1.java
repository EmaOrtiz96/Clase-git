/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;


import java.util.Scanner;

/**CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.
 *
 * @author emanuel
 */
public class ejercicio1 {
    public static void main(String[] args) {
        try {
        
            System.err.println("Ingrese un numero double");
            Scanner scanner = new Scanner (System.in);
            double valorDecimal;
            valorDecimal = scanner.nextDouble();
        
            short valorDecimalShort = (short)valorDecimal;
            System.err.println("short "+valorDecimalShort);
        
            int valorDecimalInt = (int)valorDecimal;
            System.err.println("Int "+valorDecimalInt);
        
        
            long valorDecimalLong = (long) valorDecimal;
            System.out.println("Valor convertido a long: " + valorDecimalLong);

            
            String valorDecimalString = Double.toString(valorDecimal);
            System.out.println("Valor convertido a String: " + valorDecimalString);

            
            float valorDecimalFloat = (float) valorDecimal;
            System.out.println("Valor convertido a float: " + valorDecimalFloat);
        
         } catch (Exception e) {
            System.err.println("Error: Ingrese un número decimal válido.");
        } 
        
    }
}
