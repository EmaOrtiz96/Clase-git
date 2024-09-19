/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
* ¿Qué debo modificar para poder asignar null a la variable?
 */
public class ejercicio15 {
    /*
    Si ingresas int numero = null: va a tirar un error porque int es un tipo primitivo,
    y null es un puntero a un espacio de memoria vacio.
    
    Entonces, para arregarlo deberia cambiarle a la variable el tipo de dato a Integer que es por referencia:
    Integer numero = null
    */
    public static void main(String[] args) {
        Integer numero = null;
    }
}
