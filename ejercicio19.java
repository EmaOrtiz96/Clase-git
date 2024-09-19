/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 Cree una clase OperacionMatematica con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set.
UTN-FRM
Practica Tipos de Datos – Valor y Referencia
Funciones de Cadena (String)
Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
…………………..
}
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.
 */
   public class ejercicio19 {
       public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica(10, 11, "+");
        System.out.println("La operación + es " + operacion.aplicarOperacion());

        OperacionMatematica operacion1 = new OperacionMatematica(10, 11, "-");
        System.out.println("La operación - es " + operacion1.aplicarOperacion());

        OperacionMatematica operacion2 = new OperacionMatematica(10, 11, "*");
        System.out.println("La operación * es " + operacion2.aplicarOperacion());

        OperacionMatematica operacion3 = new OperacionMatematica(10, 11, "/");
        System.out.println("La operación / es " + operacion3.aplicarOperacion());
    }
}

class OperacionMatematica {
    private double valor1;
    private double valor2;
    private String operacion;
    

    // Constructor
    public OperacionMatematica(double valor1, double valor2, String operacion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    // Métodos para operaciones matemáticas
    public double sumar() {
        return valor1 + valor2;
    }

    public double restar() {
        return valor1 - valor2;
    }

    public double multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
            
        return valor1 / valor2;
    }

    // Método para aplicar la operación
    public double aplicarOperacion() {
        if (operacion.equals("+")) {
            return this.sumar();
        } else if (operacion.equals("-")) {
            return this.restar();
        } else if (operacion.equals("*")) {
            return this.multiplicar();
        } else if (operacion.equals("/")) {
            return this.dividir();
        } else {
            System.out.println("Operación no válida.");
            return 0;
        }
    }
}

class Calculo {
    
}
