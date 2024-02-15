package Actividad5_1;

public class Ut5_01_01b {
    public static void main(String[] args){

        a();
        b();
        c();
        d();
        e();
        f();
        g();
        h();
        i();


    }
    private static void a() {
        StringBuffer cadena1 = new StringBuffer("This is java!");
        System.out.println("apartado a: " + cadena1.length());
    }

    private static void b(){
        StringBuffer cadena2 = new StringBuffer("Java");
        System.out.println("apartado b: ");
        for (int i = 0; i < cadena2.length(); i++) {
            System.out.println(cadena2.charAt(i));
        }
    }

    private static void c(){
        StringBuffer cadena3 = new StringBuffer("Java desde 0");
        System.out.println("apartado c: " + cadena3.reverse());
    }

    private  static void d(){
        String cadena4 = new String("James Gosling Created Java");
        System.out.println("apartado d: " + cadena4.replaceAll(" ",""));
    }

    private static void e(){
        StringBuffer cadena5 = new StringBuffer("Java Java Java");
        int vocales = 0;
        int consonantes = 0;
        for (int i = 0; i < cadena5.length(); i++) {
            char c = Character.toLowerCase(cadena5.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            } else if (c >= 'a' && c <= 'z') {
                consonantes++;
            }
        }
        System.out.println("apartado e: ");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
    private static void f(){
        StringBuffer cadena6 = new StringBuffer("ProgramaciónEntornos");
        String parte1 = cadena6.substring(0, 12);
        String parte2 = cadena6.substring(12);
        System.out.println("apartado f: " );
        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
        String textoConcatenado = parte1 + parte2;
        System.out.println("Texto concatenado: " + textoConcatenado);
    }
    private static void g(){
        String cadena7 = new String("java");
        String mayusculas = cadena7.toUpperCase();
        System.out.println("apartado g: ");
        System.out.println("En mayúsculas: " + mayusculas);
        String minusculas = mayusculas.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);

    }
    private static void h(){
        String cadena1 = "Java";
        String cadena2 = "JavaScript";
        System.out.println("apartado h: ");
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

    }
    private static void i(){
        String texto = "Jeve jeve jeve";
        String resultado = texto.replaceAll("e", "a");
        System.out.println("apartado i: ");
        System.out.println("Texto reemplazado: " + resultado);
    }

}

