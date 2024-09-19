/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.

 */
public class ejercicio17 {
    public static void main(String[] args) {
        Date fecha = new Date();
        
        String fecha1 = FuncionesPrograma.getFechaString(fecha);
        System.out.println("la fecha en String es: " + fecha1);
    }
}

class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        String fechaString = fecha.toString();
        return fechaString;
    }
}