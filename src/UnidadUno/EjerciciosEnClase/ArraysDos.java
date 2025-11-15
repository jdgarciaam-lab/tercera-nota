package UnidadUno.EjerciciosEnClase;

import java.util.Scanner;


public class ArraysDos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int dato= consola.nextInt();
       
        int [] numeros = {dato};
        System.out.println( "la cantidad de elementos de datos que hay en un array es"+numeros.length);
        consola.close();
        
    }
   
    
}
