import java.util.Scanner;

public class Ut5_01_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String texto = s.nextLine();

        StringBuffer salida = new StringBuffer(texto.length());

        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);

            if (c == '9'){
                salida.append('0');
            }else if (c >= '0' && c <= '8') {
                salida.append((char)(c + 1));
            } else {
                salida.append(c);
            }
        }

        System.out.println(salida);
        System.out.println(salida.length());
        System.out.println(salida.capacity());


    }


}

