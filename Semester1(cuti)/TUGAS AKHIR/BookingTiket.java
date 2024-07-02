import java.util.Scanner;

public class BookingTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

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
                    lihatJadwalFilm();
                    break;
                case 2:
                    bookingTiket();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem booking tiket bioskop. Selamat tinggal!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 3);
        
        input.close();
    }

    public static void lihatJadwalFilm() {
        // Tampilkan jadwal film
        System.out.println("Jadwal film:");
        System.out.println("1. Film A - 14.00 WIB");
        System.out.println("2. Film B - 16.30 WIB");
        System.out.println("3. Film C - 19.00 WIB");
    }

    public static void bookingTiket() {
        // Logika untuk melakukan booking tiket
        System.out.println("Anda telah memilih untuk melakukan booking tiket.");
        // Tambahkan kode untuk proses booking di sini
    }
}

