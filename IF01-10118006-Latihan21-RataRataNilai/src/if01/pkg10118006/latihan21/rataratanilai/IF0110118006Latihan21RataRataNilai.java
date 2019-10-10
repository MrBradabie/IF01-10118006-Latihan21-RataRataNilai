package if01.pkg10118006.latihan21.rataratanilai;
import java.util.Scanner;
/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * DESKRIPSI PROGRAM : Program yang dapat menghasilkan rata-rata nilai dari suatu input-an  
 */

public class IF0110118006Latihan21RataRataNilai {
    public static void main(String[] args) {
        int i, totalMahasiswa;
        double Total;
        double nilai;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        totalMahasiswa = masuk.nextInt();
        i = 1;
        Total = 0;
        while (i <= totalMahasiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = masuk.nextDouble();
            Total += nilai;
            i++;
        }
        System.out.println("\nMaka,Rata-rata Nilainya adalah " + Total / totalMahasiswa);
    }
}
