package UnidadDos.Arrays;
import java.util.Scanner;
public class E6 {
    


    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema de números ***");
        Scanner consola = new Scanner(System.in);
        // Creacion de los vectores 
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31 };
        // Pedir (datos) numero del mes por teclado
        System.out.print("Por favor, ingrese el número del mes que desea consultar: ");
        int numero = consola.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El mes es : " + meses[0] + " y este tiene " + diasMeses[0] + " dias.");
                break;
            case 2:
                System.out.println("El mes es : " + meses[1] + " y este tiene " + diasMeses[1] + " dias.");
                break;
            case 3:
                System.out.println("El mes es : " + meses[2] + " y este tiene " + diasMeses[2] + " dias.");
                break;
            case 4: 
                System.out.println("El mes es : " + meses[3] + " y este tiene " + diasMeses[3] + " dias.");
                break;
            case 5:
                System.out.println("El mes es : " + meses[4] + " y este tiene " + diasMeses[4] + " dias.");
                break;
            case 6: 
                System.out.println("El mes es : " + meses[5] + " y este tiene " + diasMeses[5] + " dias.");
                break;
            case 7:
                System.out.println("El mes es : " + meses[6] + " y este tiene " + diasMeses[6] + " dias.");
                break;
            case 8:
                System.out.println("El mes es : " + meses[7] + " y este tiene " + diasMeses[7] + " dias.");
                break;
            case 9:
                System.out.println("El mes es : " + meses[8] + " y este tiene " + diasMeses[8] + " dias.");
                break;
            case 10: 
                System.out.println("El mes es : " + meses[9] + " y este tiene " + diasMeses[9] + " dias.");
                break;
            case 11: 
                 System.out.println("El mes es : " + meses[10] + " y este tiene " + diasMeses[10] + " dias.");
                 break;
            case 12: 
                 System.out.println("El mes es : " + meses[11] + " y este tiene " + diasMeses[11] + " dias.");
                 break;
            default: 
                System.out.println("Número de mes invalido.");
                break;
        }


        consola.close();
    }
}

