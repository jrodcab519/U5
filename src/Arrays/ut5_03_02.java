package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ut5_03_02 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("""
                    Seleccione que quiere hacer: (0 para salir)\s
                     1: Añadir una palabra al principio de la lista\s
                     2: Añadir una palabra al final de la lista\s
                     3: Eliminar una palabra de la lista\s
                     4: Ver el número de elementos de la lista\s
                     5: Listar las palabras almacenadas\s
                     6: Eliminar todas las palabras de la lista""");
            opcion = s.nextInt();


            switch (opcion) {
                case 0:
                    System.out.println("Salir del programa");
                    break;
                case 1:
                    anadirPalabraPrincipio(palabras);
                    break;
                case 2:
                    anadirPalabraFinal(palabras);
                    break;
                case 3:
                    eliminarPalabra(palabras);
                    break;
                case 4:
                    System.out.println("Número de elementos en la lista: " + numeroElementos(palabras));
                    System.out.println(numeroElementos(palabras));
                    break;
                case 5:
                    System.out.println("Palabras almacenadas:");
                    listarPalabras(palabras);
                    break;
                case 6:
                    eliminarTodasPalabras(palabras);
                    System.out.println("Todas las palabras han sido eliminadas de la lista.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }while (opcion != 0);



    }
        private static void listarPalabras (ArrayList<String> palabras) {
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println("Elemento " + i + ": " + palabras.get(i));
            }
        }

        private static void anadirPalabraFinal(ArrayList<String> palabras){
            System.out.println("Introducir palabra para añadir");
            String palabra = s.nextLine();

            if(palabras.contains(palabra)){
                palabras.indexOf(palabra);
            }else {
                palabras.add(palabra);
            }
        }

        private static void anadirPalabraPrincipio(ArrayList<String> palabras){
            System.out.println("Introducir palabra para añadir");
            String palabra = s.nextLine();

            if(palabras.contains(palabra)){
                palabras.indexOf(palabra);
            }else {
                palabras.add(0,palabra);
            }
        }

        private static void eliminarPalabra(ArrayList<String> palabras){
            System.out.println("Introducir palabra para eliminar");
            String palabra = s.nextLine();

             if(palabras.contains(palabra)){
                palabras.remove(palabra);
                System.out.println("La palabra fue eliminada");
            }else {
                System.out.println("La palabra no existe en la lista");
            }
        }

        private static int numeroElementos(ArrayList<String> palabras){
            return palabras.size();
        }

        private static void eliminarTodasPalabras(ArrayList<String> palabras){
            palabras.clear();
        }

}

