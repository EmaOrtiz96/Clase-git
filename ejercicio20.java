/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 - Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
}
UTN-FRM
Practica Tipos de Datos – Valor y Referencia
Funciones de Cadena (String)
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
}
Cree una clase OperacionesFraccion que contenga un método main donde se
solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se
crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran
los 4 métodos implementados anteriormente asignando el resultado a una
nueva variable de tipo Fracción y mostrando por pantalla el resultado de las
operaciones realizadas.
 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores para las fracciones
        System.out.print("Ingrese el numerador de la primera fracción: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int den1 = scanner.nextInt();

        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int den2 = scanner.nextInt();

        // Crear las fracciones
        Fraccion f1 = new Fraccion(num1, den1);
        Fraccion f2 = new Fraccion(num2, den2);

        // Realizar las operaciones y mostrar los resultados
        System.out.println("Suma: " + f1.sumar(f2));
        System.out.println("Resta: " + f1.restar(f2));
        System.out.println("Multiplicación: " + f1.multiplicar(f2));
        System.out.println("División: " + f1.dividir(f2));

        
    }
    
}

class Fraccion{
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Métodos para operar con fracciones
    public Fraccion sumar(Fraccion otra) {
        int num = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion restar(Fraccion otra) {
        int num = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion multiplicar(Fraccion otra) {
        int num = this.numerador * otra.numerador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion dividir(Fraccion otra) {
        int num = this.numerador * otra.denominador;
        int den = this.denominador * otra.numerador;
        return new Fraccion(num, den);
    }
    
        
} 

class OperacionesFraccion {
    
    
}




    
                  
      
    

    
    

