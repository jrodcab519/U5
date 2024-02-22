package GestionEstudiantes;
import java.util.List;
import java.util.TreeMap;

public class GestionEstudiantes {
    private TreeMap<String, Grupo> grupos;

    public GestionEstudiantes() {
        grupos = new TreeMap<>();
    }

    public void crearGrupo(String nombreGrupo) {
        if (!grupos.containsKey(nombreGrupo)) {
            grupos.put(nombreGrupo, new Grupo(nombreGrupo));
            System.out.println("El grupo fue creado");
        } else {
            System.out.println("El grupo ya existe.");
        }
    }

    public void listarGrupos() {
        System.out.println("Grupos:");
        for (String nombreGrupo : grupos.keySet()) {
            System.out.println(nombreGrupo);
        }
    }

    public void eliminarGrupo(String nombreGrupo) {
        if (!grupos.containsKey(nombreGrupo)) {
            System.out.println("El grupo no existe");
        } else {
           grupos.remove(nombreGrupo);
            System.out.println("El grupo fue eliminado");
        }
    }

    public List<Estudiante> seleccionarGrupo(String grupo){

        if(grupos.containsKey(grupo)){
            Grupo g= grupos.get(grupo);
            return g.getEstudiantes();
        }
        return null;
    }




}