import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        // Inisialisasi variabel
        String namaSiswa;         // Akan diisi oleh input pengguna
        int jumlahSiswa = 0;      // Jumlah siswa mulai dari 0
        int nilaiAtasRata = 0;    // Jumlah siswa dengan nilai di atas rata-rata
        int nilaiBawahRata = 0;   // Jumlah siswa dengan nilai di bawah rata-rata
        double nilai = 0;         // Nilai siswa diinisialisasi dengan 0
        double totalNilai = 0;    // Total nilai dimulai dari 0
        double rataRata = 0;      // Rata-rata dimulai dari 0
        boolean mayoritasNilaiAtasMean = false;  // Inisialisasi boolean untuk menentukan mayoritas

        // Perulangan input data siswa
        while (true) {
            // Input nama siswa
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk berhenti): ");
            namaSiswa = sc09.nextLine();  // Mengambil input dari pengguna

            // Jika input adalah 'selesai', maka keluar dari perulangan
            if (namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }

            // Input nilai siswa
            System.out.print("Masukkan nilai untuk " + namaSiswa + ": ");
            try {
                nilai = sc09.nextDouble();  // Mengambil input nilai siswa
            } catch (Exception e) {
                System.out.println("Masukkan nilai yang valid.");
                sc09.nextLine();  // Membersihkan input yang tidak valid
                continue;  // Lanjutkan ke iterasi berikutnya
            }

            // Update jumlah siswa dan total nilai
            jumlahSiswa++;
            totalNilai += nilai;

            // Hitung rata-rata nilai sementara
            rataRata = totalNilai / jumlahSiswa;

            // Tentukan apakah nilai saat ini di atas atau di bawah rata-rata
            if (nilai > rataRata) {
                nilaiAtasRata++;
            } else {
                nilaiBawahRata++;
            }

            sc09.nextLine();  // Membersihkan baris kosong setelah nextDouble()
        }

        // Jika tidak ada siswa yang dimasukkan
        if (jumlahSiswa == 0) {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
            return;
        }

        // Menentukan mayoritas nilai di atas rata-rata
        mayoritasNilaiAtasMean = nilaiAtasRata > (jumlahSiswa / 2.0);

        // Menampilkan hasil akhir
        System.out.println("---------------------HASIL AKHIR NILAI SISWA-----------------------");
        System.out.println("Rata-rata nilai siswa dalam satu kelas: " + rataRata);

        if (mayoritasNilaiAtasMean) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else {
            System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
        }

        sc09.close();  // Tutup scanner setelah selesai digunakan
    }
}
