package Actividad5_1;

import java.util.Scanner;

public class Ut5_01_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String texto;

        System.out.println("Introduce los caracteres deseados: (FIN para salir)");

        while(true){
            texto = s.nextLine().trim();

            if(texto.equalsIgnoreCase("FIN")){
                break;
            }
            System.out.println("apartado a: " + texto.toLowerCase());

            System.out.print("apartado b: ");
            for (int i = texto.length() - 1; i >= 0; i--) {
                System.out.print(texto.charAt(i));
            }
            System.out.println();

            System.out.print("apartado c: ");
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (i % 2 == 0) {
                    System.out.print(Character.toLowerCase(c));
                } else {
                    System.out.print(Character.toUpperCase(c));
                }
            }
            System.out.println();

            System.out.println("apartado d: " + texto.replaceAll("[aA]", "@"));

            int sumaA = 0;
            int sumaE = 0;
            int sumaI = 0;
            int sumaO = 0;
            int sumaU = 0;

            for (int i = 0; i < texto.length(); i++) {
            char c = texto.toLowerCase().charAt(i);
                if(c == 'a') sumaA++;
                if(c == 'e') sumaE++;
                if(c == 'i') sumaI++;
                if(c == 'o') sumaO++;
                if(c == 'u') sumaU++;
            }
            System.out.println("apartado e: " + sumaA + " a, " + sumaE + " e, "+ sumaI + " i, "+ sumaO + " o, "+ sumaU + " u, " );



        }

    }
}
