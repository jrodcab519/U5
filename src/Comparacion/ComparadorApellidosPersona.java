package Comparacion;


import java.util.Comparator;

public class ComparadorApellidosPersona implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getApellidos().compareTo(o2.getApellidos());
    }
}