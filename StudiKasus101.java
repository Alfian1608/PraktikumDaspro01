import java.util.Scanner;
public class StudiKasus101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahcup, uangbayar;
        int totalharga, diskon =0 , totalbayar;
        int kembalian, kurang;

        System.out.print("Masukan jumlah cup: ");
        jumlahcup = sc.nextInt();
        System.out.print("Masukan uang bayar: ");
        uangbayar = sc.nextInt();

        totalharga = jumlahcup * hargaPerCup;

        if (totalharga >= 100000) {
            diskon = totalharga * 10/100;
        }

        totalbayar = totalharga - diskon;

        System.out.println("Total harga : Rp" + totalharga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total bayar : Rp" + totalbayar);

        if (uangbayar >= totalbayar) {
            kembalian = uangbayar - totalharga;
            System.out.println("Kembalian : Rp" + kembalian);
        } else {
            kurang = totalbayar - uangbayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
}