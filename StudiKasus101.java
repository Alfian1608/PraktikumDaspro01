import java.util.Scanner;
public class StudiKasus101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup,uangBayar;
        int totalHarga,diskon = 0,totalBayar;
        int kembalian,kurang;

        System.out.print("Masukan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalHarga;
            System.out.println("Kembalian : Rp" + kembalian);
        } else{
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
}