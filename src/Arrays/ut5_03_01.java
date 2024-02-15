package Arrays;

import java.util.Arrays;

public class ut5_03_01 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        System.out.println(existeIndice(array,4));

        System.out.println(Arrays.toString(borrarPorIndice(array, 2)));

        System.out.println(Arrays.toString(insertarEnIndice(array, 3, 9)));

    }

    private static boolean existeIndice(int [] muestra, int indice){

        return indice >= 0 && indice < muestra.length;
    }
    public static int[] borrarPorIndice(int[] original, int indice) {
        if (existeIndice(original, indice)) {
            int[] resultado = new int[original.length - 1];
            int contadorResultado = 0;
            for (int i = 0; i < original.length; i++) {
                if (i != indice) {
                    resultado[contadorResultado] = original[i];
                    contadorResultado++;
                }
            }
            return resultado;
        } else {
            return original;
        }
    }

    public static int[] insertarEnIndice(int[] original, int indice, int valor) {
        if (existeIndice(original, indice)) {
            int[] resultado = new int[original.length + 1];
            for (int i = 0, j = 0; i < resultado.length; i++) {
                if (i == indice) {
                    resultado[i] = valor;
                } else {
                    resultado[i] = original[j];
                    j++;
                }
            }
            return resultado;
        } else {
            return original;
        }
    }
}
