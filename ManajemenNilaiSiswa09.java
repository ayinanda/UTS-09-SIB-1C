import java.util.Scanner;

public class ManajemenNilaiSiswa09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

    String namaSiswa; 
    int jumlahSiswa = 0, nilaiAtasRata = 0, nilaiBawahRata = 0;
    double nilai = 0, totalNilai = 0 , rataRata = 0 , rataRataAkhir = 0;
    boolean mayoritasNilaiAtasMean = false;

    while (true) {
        System.out.print(" Masukkan nama siswa :" + namaSiswa);
        namaSiswa = sc09.nextLine();
        sc09.nextLine();

        if (namaSiswa.equalsIgnoreCase("selesai")) {
            break;
        } 
        System.out.println(" Masukkan nilai " + namaSiswa + " : ");
        nilai = sc09.nextInt();
        sc09.nextLine();
        
        if (nilai>75) {
            System.out.println("nilai di atas rata rata ");
            nilai = sc09.nextInt();
        } else {
            System.out.println("nilai di bawah rata rata ");
            nilai = sc09.nextInt();
        }

        jumlahSiswa++ ;
        totalNilai += nilai ;

        rataRata = totalNilai/jumlahSiswa;

        if (nilai > rataRata) {
            nilaiAtasRata++;
        } else {
            nilaiBawahRata++;
        } 
        mayoritasNilaiAtasMean = (nilaiAtasRata > jumlahSiswa) ;
        mayoritasNilaiAtasMean= sc09.nextBoolean();
    } 
    System.out.println("---------------------HASIL AKHIR NILAI SISWA-----------------------");
    System.out.println(" rata-rata nilai siswa dalam satu kelas: " + rataRata);

    if (mayoritasNilaiAtasMean) {
        System.out.println("Mayoritas siswa memiliki nilai di atas rata rata");
        mayoritasNilaiAtasMean = sc09.nextBoolean();
        sc09.nextLine();
    } else {
        System.out.println("Mayoritas siswa memiliki nilai di bawah rata rata");
    }
    }
}

