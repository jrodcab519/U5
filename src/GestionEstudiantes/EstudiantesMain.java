package GestionEstudiantes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EstudiantesMain {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        GestionEstudiantes gestion = new GestionEstudiantes();

        boolean salir = false;
        while (!salir) {
            switch (dibujarMenuGrupo()) {
                case 1:
                    System.out.println("Introduce nombre grupo:");
                gestion.crearGrupo(s.nextLine());
                    break;
                case 2:
                gestion.listarGrupos();
                    break;
                case 3:
                    System.out.println("Introduce nombre grupo:");
                gestion.eliminarGrupo(s.nextLine());
                    break;
                case 4:
                    List<Estudiante> estudiantes = gestion.seleccionarGrupo(s.nextLine());
                    while (!salir) {
                        switch (dibujarMenuEstudiantes()) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;

                            case 0:
                                salir = true;
                        }
                    }
                    break;
                case 0:
                    salir = true;
            }
        }


    }

    public static int dibujarMenuGrupo() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Crear un grupo de estudiantes");
        System.out.println("2. Listar grupos de estudiantes");
        System.out.println("3. Eliminar un grupo de estudiantes");
        System.out.println("4. Seleccionar un grupo de estudiantes");
        System.out.println("0. Salir");
        int opcion = 5;
        try {
            opcion = s.nextInt();
        }catch(InputMismatchException i) {
            System.out.println("Formato erroneo, Introduce un número entero");
        }
        s.nextLine();
        return opcion;
    }
    public static int dibujarMenuEstudiantes() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Listar estudiantes");
        System.out.println("2. Añadir un estudiante al final del grupo");
        System.out.println("3. Insertar un estudiante en la posición indicada");
        System.out.println("4. Ordenar el listado por NIE");
        System.out.println("5. Eliminar el estudiante de la posición indicada");
        System.out.println("6. Eliminar todos los estudiantes de la clase");
        System.out.println("0. Salir");
        int opcion = s.nextInt();
        s.nextLine();
        return opcion;
    }
}


