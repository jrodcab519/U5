package Arrays;

import java.util.ArrayList;

public class ut5_03_03 {
    public static void main(String[] args) {
        ArrayList<Persona>personas = new ArrayList<>();
        Persona p1 = new Persona("Juan", "Perez", "953651478");
        Persona p2 = new Persona("Jose", "Lopez", "953651456");
        Persona p3 = new Persona("Antonio", "Rodriguez", "953567478");
        Persona p4 = new Persona("Ana", "Garcia", "953657278");



        anadirPersonaFinal(personas,p1);
        anadirPersonaFinal(personas,p2);
        anadirPersonaEnPosicion(personas,1,p3);
        anadirPersonaFinal(personas,p4);
        listarPersonas(personas);
        anadirPersonaFinal(personas, p2);
        System.out.println(numeroElementos(personas));
        eliminarPersonaEnPosicion(personas, 1);
        listarPersonas(personas);
        borrarTodasPersonas(personas);
        listarPersonas(personas);

    }

    private static void listarPersonas (ArrayList<Persona> personas) {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Elemento " + i + ": " + personas.get(i));
        }
    }

    private static void anadirPersonaFinal(ArrayList<Persona> personas, Persona persona){
        if(personas.contains(persona)){
            personas.indexOf(persona);
        }else {
            personas.add(persona);
        }
    }

    private static void anadirPersonaEnPosicion(ArrayList<Persona> personas,  int posicion, Persona persona){
        if(personas.contains(persona)){
            personas.indexOf(persona);
        }else {
            personas.add(posicion, persona);
        }
    }

    private static void eliminarPersonaEnPosicion(ArrayList<Persona> personas, int posicion){
            personas.remove(posicion);
    }

    private static void borrarTodasPersonas(ArrayList<Persona> personas){
        personas.clear();
    }

    private static int numeroElementos(ArrayList<Persona> personas){
        return personas.size();
    }
}
