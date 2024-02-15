package Actividad5_1;

import java.util.Scanner;

public class ut5_01_01c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = s.nextLine();
        String[] palabras = cadena.split(" ");
        int cantidadPalabras = palabras.length;
        System.out.println("El número de palabras en la cadena es: " + cantidadPalabras);

    }
}
