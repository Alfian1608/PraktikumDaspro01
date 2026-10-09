import java.util.Scanner;
public class StudiKasus201 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen;
        int juara;
        int pendanaan;

        System.out.print("Nama mahasiswa");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya): ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen yang diupload (0-4) ");
        dokumen = sc.nextInt();
    }
}