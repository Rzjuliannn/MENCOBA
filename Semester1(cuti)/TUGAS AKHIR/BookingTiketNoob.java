import java.util.Scanner;

public class BookingTiketNoob {
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
                    bookingTiket(input); // Menyampaikan objek Scanner sebagai argumen
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem booking tiket bioskop. Selamat tinggal!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 3);
        
        input.close(); // Tutup Scanner setelah program selesai
    }

    public static void lihatJadwalFilm() {
        System.out.println("Jadwal film:");
        System.out.println("1. Film A - Senin");
        System.out.println("2. Film B - Selasa");
        System.out.println("3. Film C - Rabu");
    }

    public static void bookingTiket(Scanner input) { // Terima objek Scanner sebagai argumen
        System.out.println("Pilih hari (1/2/3): ");
        int hari = input.nextInt();

        if (hari >= 1 && hari <= 3) {
            System.out.println("Pilih film (1/2/3): ");
            int film = input.nextInt();

            if (film >= 1 && film <= 3) {
                System.out.println("Anda telah memilih untuk melakukan booking tiket.");
                System.out.println("Hari: " + getHari(hari));
                System.out.println("Film: " + getFilm(film));
                konfirmasiBooking(input); // Tambahkan pemanggilan untuk konfirmasi booking
            } else {
                System.out.println("Pilihan film tidak valid.");
            }
        } else {
            System.out.println("Pilihan hari tidak valid.");
        }
    }

    public static String getHari(int hari) {
        switch (hari) {
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            default:
                return "Tidak Valid";
        }
    }

    public static String getFilm(int film) {
        switch (film) {
            case 1:
                return "Film A";
            case 2:
                return "Film B";
            case 3:
                return "Film C";
            default:
                return "Tidak Valid";
        }
    }

    public static void konfirmasiBooking(Scanner input) {
        System.out.println("Apakah Anda ingin melanjutkan booking? (y/n): ");
        String konfirmasi = input.next().toLowerCase();
        if (konfirmasi.equals("y")) {
            // Tempatkan logika untuk melanjutkan booking di sini
            System.out.println("Booking berhasil dilanjutkan!");
        } else if (konfirmasi.equals("n")) {
            System.out.println("Booking dibatalkan. Terima kasih!");
        } else {
            System.out.println("Pilihan tidak valid. Booking dibatalkan.");
        }
    }
}
