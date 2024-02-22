package GestionEstudiantes;

public class Estudiante {
    private int nie;
    private String nombre;
    private String apellidos;
    private int edad;
    public Estudiante(int nie, String nombre, String apellidos, int edad) {
        this.nie = nie;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public int getNie() {
        return nie;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Estudiante {" +
                "nie=" + nie +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}