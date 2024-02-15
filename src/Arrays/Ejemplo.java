package Arrays;

public class Ejemplo {
    public static void main(String[] args) {

        int[][] ejemplo = {
                            {1, 2, 3},
                            {10, 20, 30},
                            {50, 60, 70},
                            {-1, -2, -4},
                            {100, 200, 400}
        };

        System.out.println(ejemplo.length);

        for (int i = 0; i < ejemplo.length; i++){
            for(int j = 0; j < ejemplo[i].length; j++) {

                int i1 = ejemplo[i][j];
                System.out.print(ejemplo[i][j]);
            }
            System.out.println("");
        }
    }
}
