package Comparacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparacionMain {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("12345678Z","Juan", "Perez", "123456789");
        Persona p2 = new Persona("66667777A","Jose", "García", "874538789");
        Persona p3 = new Persona("12345678Z","Antonio","Lopez", "241552963");
        Persona p4 = new Persona("15489678B","Fermín","Lopez", "441852963");
        Persona p5 = new Persona("13489578C","Alfonso","García", "341882963");
        Persona p6 = new Persona("13987478E","Alfonso","García", "941852963");
        Persona p7 = new Persona("13448598F","Luis","Lopez", "546152963");
        Persona p8 = new Persona("13448598F","Jaime","Gomez", "546152963");
        Persona p9 = new Persona("13448598F","Ana","Cuevas", "546152963");
        Persona p10 = new Persona("13448598F","Carmen","Cozar", "546152963");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);


        boolean salir = false;
        while (!salir) {
            switch (dibujarMenu()) {
                case 1:
                    lista.sort(new ComparadorApellidosPersona());
                    for (Persona p: lista){
                        System.out.println(p);
                    }
                    break;
                case 2:
                    Collections.sort(lista, new ComparadorTelefonoPersona());
                    for (Persona p: lista){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    lista.sort(new ComparadorNombrePersona());
                    for (Persona p: lista){
                        System.out.println(p);
                    }
                    break;
                case 4:
                    lista.sort(new ComparadorDniPersona());
                    for (Persona p: lista){
                        System.out.println(p);
                    }
                    break;
                case 5:
                    lista.sort(new ComparadorApellidoNombrePersona());
                    for (Persona p: lista){
                        System.out.println(p);
                    }
                    break;
                case 0:
                    salir = true;
            }
        }








        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));





        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));

     
    }
    public static int dibujarMenu() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Ordenar por apellidos");
        System.out.println("2. Ordenar por teléfono");
        System.out.println("3. Ordenar por nombre");
        System.out.println("4. Ordenar por dni");
        System.out.println("5. Ordenar por Apellidos y si coincide por nombre");
        System.out.println("0. Salir");
        int opcion = s.nextInt();
        s.nextLine();
        return opcion;
    }
}
