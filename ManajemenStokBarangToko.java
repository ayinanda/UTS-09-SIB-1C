import java.util.Scanner;

public class ManajemenStokBarangToko {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        String namaBarang;
        double stokBarang, hargaPerUnit, totalNilaiStok;
        double permintaanBarang;
        
        while (true) {
            System.out.println("Masukkan nama barang (ketik 'selesai' untuk berhenti): ");
            namaBarang = sc09.nextLine();
            
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.println("Masukkan jumlah stok barang: ");
            stokBarang = sc09.nextDouble();

            System.out.println("Masukkan harga per unit barang: ");
            hargaPerUnit = sc09.nextDouble();
            sc09.nextLine();
            
            totalNilaiStok = stokBarang * hargaPerUnit;
            System.out.println("Total nilai stok untuk " + namaBarang + ": " + totalNilaiStok);
            
            System.out.println("Masukkan jumlah permintaan barang: ");
            permintaanBarang = sc09.nextDouble();
            sc09.nextLine();
            
            if (permintaanBarang <= stokBarang) {
                stokBarang -= permintaanBarang;
                System.out.println("Permintaan dapat dipenuhi. Stok tersisa untuk " + namaBarang + ": " + stokBarang);
            } else {
                System.out.println("Stok tidak mencukupi. Stok saat ini hanya " + stokBarang);
            }

            System.out.println("----------------------------");
        }

        sc09.close();
        System.out.println("Program selesai.");
    }
}
