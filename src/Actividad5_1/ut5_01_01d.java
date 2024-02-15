package Actividad5_1;

import java.util.Scanner;

public class ut5_01_01d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un texto:");
        String texto = s.nextLine().toLowerCase();
        int[] frecuenciaVocales = new int[5];

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a') {
                frecuenciaVocales[0]++;
            } else if (c == 'e') {
                frecuenciaVocales[1]++;
            } else if (c == 'i') {
                frecuenciaVocales[2]++;
            } else if (c == 'o') {
                frecuenciaVocales[3]++;
            } else if (c == 'u') {
                frecuenciaVocales[4]++;
            }
        }
        System.out.println("a " + frecuenciaVocales[0] + " " + generarHistograma(frecuenciaVocales[0]));
        System.out.println("e " + frecuenciaVocales[1] + " " + generarHistograma(frecuenciaVocales[1]));
        System.out.println("i " + frecuenciaVocales[2] + " " + generarHistograma(frecuenciaVocales[2]));
        System.out.println("o " + frecuenciaVocales[3] + " " + generarHistograma(frecuenciaVocales[3]));
        System.out.println("u " + frecuenciaVocales[4] + " " + generarHistograma(frecuenciaVocales[4]));
    }
    public static String generarHistograma(int frecuencia) {
        StringBuffer histograma = new StringBuffer();
        for (int i = 0; i < frecuencia; i++) {
            histograma.append("*");
        }
        return histograma.toString();
    }
}
