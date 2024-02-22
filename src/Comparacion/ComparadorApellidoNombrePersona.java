package Comparacion;


import java.util.Comparator;

public class ComparadorApellidoNombrePersona implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int resultado = o1.getApellidos().compareTo(o2.getApellidos());
        if(resultado == 0){
            return o1.getNombre().compareTo(o2.getNombre());
        }return resultado;
    }
}