import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program Nilai Terbesar dan Terkecil
 * berbasis OOP
 *
 */

public class NilaiTerbesarDanTerkecil {
    public int jumlahMahasiswa,
            max,
            min;
    public int[] nilaiMahasiswa;

    public void inputNilai() {
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        jumlahMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
    }

    public void hitungNilai(int[] nilaiMahasiswa) {
        max = nilaiMahasiswa[0];
        min = nilaiMahasiswa[0];

        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            if (max < nilaiMahasiswa[i]) {
                max = nilaiMahasiswa[i];
            } else if (min > nilaiMahasiswa[i]) {
                min = nilaiMahasiswa[i];
            }
        }
        System.out.print("\n");
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
    }

    public void hasilNilai() {
        System.out.print("\n");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " : " + nilaiMahasiswa[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        String namaPetugas = scanner.next();

        NilaiTerbesarDanTerkecil nilai = new NilaiTerbesarDanTerkecil();
        nilai.inputNilai();
        nilai.hitungNilai(nilai.nilaiMahasiswa);
        nilai.hasilNilai();

        System.out.print("\n");
        System.out.print("Petugas " + " : " + namaPetugas);
    }
}
