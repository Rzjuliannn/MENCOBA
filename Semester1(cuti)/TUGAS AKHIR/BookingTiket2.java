import java.util.Scanner;

public class BookingTiket2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        String[][] jadwalFilm = {
            {"Film Berbie", "Film Suparman", "Film anuuu"},
            {"Senin", "Selasa", "Rabu"}
        };

        do {
            System.out.println("Selamat datang di Sistem Booking Tiket Bioskop");
            System.out.println("Pilih menu:");
            System.out.println("1. Lihat Jadwal Film");
            System.out.println("2. Booking Tiket");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    lihatJadwalFilm(jadwalFilm);
                    break;
                case 2:
                    bookingTiket(jadwalFilm);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem booking tiket bioskop. Selamat tinggal!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 3);
        
        input.close(); // Tutup Scanner di sini setelah semua penggunaan selesai
    }

    public static void lihatJadwalFilm(String[][] jadwalFilm) {
        System.out.println("Jadwal film:");
        for (int i = 0; i < jadwalFilm[0].length; i++) {
            System.out.println((i + 1) + ". " + jadwalFilm[0][i] + " - " + jadwalFilm[1][i]);
        }
    }

    public static void bookingTiket(String[][] jadwalFilm) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih hari (1/2/3): ");
        int hari = input.nextInt();

        if (hari >= 1 && hari <= jadwalFilm[0].length) {
            System.out.println("Pilih film (1/2/3): ");
            int film = input.nextInt();

            if (film >= 1 && film <= jadwalFilm.length) {
                System.out.println("Anda telah memilih untuk melakukan booking tiket pada " + jadwalFilm[1][hari - 1] + " untuk " + jadwalFilm[0][film - 1]);
                // Tambahkan logika untuk proses booking tiket di sini
            } else {
                System.out.println("Pilihan film tidak valid.");
            }
        } else {
            System.out.println("Pilihan hari tidak valid.");
        }

        // input.close(); // Tidak perlu menutup Scanner di sini
    }
}


