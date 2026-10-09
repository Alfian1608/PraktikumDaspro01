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

        if (jenis.equalsIgnoreCase( "BELMAWA")
            || jenis.equalsIgnoreCase( "BAKORMA")
            || jenis.equalsIgnoreCase( "MANDIRI")) {
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            juara = sc.nextInt();
            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status: berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Dana penghargaan tidak diberikan");
                    System.out.println("Dokumen kurang: " + (4 - dokumen));
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan");
                System.out.println("Alasan: Hanya juara 1, 2, atau 3 yang memperoleh dana.");
            }
        } else if (jenis.equalsIgnoreCase( "PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            pendanaan = sc.nextInt();
            if (pendanaan == 1) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Dana penghargaan tidak diberikan.");
                    System.out.println("Dokumen kurang: " + (4 - dokumen));
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan.");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan.");
            System.out.println("Alasan: Jenis kegiatan tidak termasuk ketentuan");
        }
        sc.close();
    }
}