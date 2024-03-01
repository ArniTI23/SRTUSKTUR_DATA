
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SoalStrukturData {

    public static void main(String[] args) {
//soal array
    //No 1. Buat array 1D dengan 8 tipe
        byte[] data1 = {1, 2, 3, 4, 5};
        short[] data2 = {10, 20, 30, 40, 50};
        int[] data3 = {100, 200, 300, 400, 500};
        long[] data4 = {1000, 2000, 3000, 4000, 5000};
        float[] data5 = {1.3f, 2.5f};
        double[] data6 = {20, 25.5, 3.14};
        char[] data7 = {'A'};
        boolean[] data8 = {true};

    //No 2. Membuar dan mencetak Array 1D tipe primitif dengan 5 metode
        System.out.println("menggunakan class Arrays ;");
        int[] angka = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(angka));

        System.out.println("\nmenggunakan Loop For :");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\nmenggunakan for each :");
        for (int data : angka) {
            System.out.print(data + " ");
        }

        System.out.println("\nMenggunakan while :");
        int j = 0;
        while (j < angka.length) {
            System.out.print(angka[j] + " ");
            j++;
        }
        
        System.out.println("\nmenggunakan do-while ;");
        int p = 0;
        do {
            System.out.print(angka[p] + " ");
            p++;
        } while (p < angka.length);
        System.out.println();

    //No 3. Array 2D dan menginput nilai menggunakn keyboard
        Scanner in = new Scanner(System.in);
        int baris = 3;
        int kolom = 3;
        int[][] array2D = new int[baris][kolom];

        System.out.println("masukkan nilai :");
        for (int a = 0; a < baris; a++) {
            for (int b = 0; b < kolom; b++) {
                System.out.print("Bris" + (a + 1) + ",kolom" + (b + 1) + ": ");
                array2D[a][b] = in.nextInt();
            }
        }
        System.out.println("isi array 2D :");
        for (int y = 0; y < baris; y++) {
            for (int z = 0; z < kolom; z++) {
                System.out.print(array2D[y][z] + " ");
            }
            System.out.println();
        }
        System.out.println();
// Soal ArrayList
    // No 1. Membuat array tipe data wrapper 
        ArrayList<Integer> nilai = new ArrayList<>();
        
        nilai.add(10);
        nilai.add(20);
        nilai.add(30);
        nilai.add(40);
        nilai.add(50);
        
        System.out.println(nilai);
        
    // No 2. ArrayList bertipe data Integer dengan add(), get(), set(), remove(), size()
        ArrayList<Integer> nilai2 = new ArrayList<>();
        
        nilai2.add(100);
        nilai2.add(200);
        nilai2.add(300);
        nilai2.add(400);
        nilai2.add(500);
        
        System.out.println("isi ArrayList : " + nilai2);
        System.out.println("Indeks ke-4 : " + nilai2.get(4));
        nilai2.set(4, 550);
        System.out.println("menganti index ke-4 : " + nilai2);
        nilai2.remove(4);
        System.out.println("menghaous indeks ke-4 : " +nilai2);
        System.out.println("Ukuran ArrayList : " + nilai2.size());
    }
}
