import java.util.Arrays;
public class Array1DPrimitif {

    public static void main(String[] args) {
        System.out.println("Array 1D tipe primitif");
        int[] angka = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(angka));

        System.out.println(" ");

        System.out.println("Array 1D non primitif");
        String[] buah = {"Mangga", "apel", "jeruk", "anggur"};;
        System.out.println(Arrays.toString(buah));

        System.out.println(" ");

        System.out.println("Array 2D tipe primitif");
        int[][] bilangan = {
            {10, 20, 30},
            {40, 50, 60}
        };
        for (int a = 0; a < bilangan.length; a++) {
            for (int b = 0; b < bilangan[a].length; b++) {
                System.out.print(bilangan[a][b] + " ");
            }
            System.out.println();
        }

    }
}
