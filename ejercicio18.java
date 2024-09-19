/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;



/**
 - En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
……….
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.

 */
import java.util.Date;
import java.util.Calendar;

public class ejercicio18 {
    public static void main(String[] args) {
        // Usar la función getFechaDate para obtener un objeto Date
        Date fecha = FuncionesPrograma18.getFechaDate(16, 9, 2024);
        
        // Imprimir la fecha
        System.out.println("Fecha: " + fecha);
    }
}


class FuncionesPrograma18 {

    // Función estática que recibe día, mes y año, y devuelve un objeto Date
    public static Date getFechaDate(int dia, int mes, int anio) {
        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();
        
        // Establecer la fecha en el Calendar
        calendar.set(anio, mes - 1, dia); // Nota: el mes es 0-based (enero = 0, febrero = 1, ...)
        
        // Retornar la fecha como objeto Date
        return calendar.getTime();
    }
}



