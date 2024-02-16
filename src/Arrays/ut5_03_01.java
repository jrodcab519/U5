package Arrays;

import java.util.Arrays;

public class ut5_03_01 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        System.out.println(existeIndice(array,4));

        System.out.println(Arrays.toString(borrarPorIndice(array, 3)));

        System.out.println(Arrays.toString(insertarEnIndice(array, 3, 9)));

    }

    private static boolean existeIndice(int [] muestra, int indice){
        if(muestra != null && indice >= 0 && indice < muestra.length){
            return true;
        }
        return false;
    }
    public static int[] borrarPorIndice(int[] original, int indice) {
        int[] resultado = null;
        if (existeIndice(original, indice)) {
            resultado = new int[original.length - 1];
            int j = 0;
            for (int i = 0; i < original.length; i++) {
                if (i != indice) {
                    resultado[j] = original[i];
                    j++;
                }
            }
        }
            return resultado;
    }

    public static int[] insertarEnIndice(int[] original, int indice, int valor) {
        int [] resultado = null;
        if (existeIndice(original, indice)) {
            resultado = new int[original.length + 1];
            int j = 0;
            for (int i = 0; i < original.length; i++) {
                if (i != indice) {
                    resultado[j] = original[i];
                    j++;
                } else {
                    resultado[j] = valor;
                    j++;
                    resultado[j] = original[i];
                    j++;
                }
            }
        }
        return resultado;
    }

    public static boolean existeIndice2(int[] muestra, int indice){
        boolean resultado = true;
        try {
            int i = muestra[indice];
        }catch (ArrayIndexOutOfBoundsException e){
            resultado = false;
        }
        return resultado;
    }
}
