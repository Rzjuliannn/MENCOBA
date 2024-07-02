import java.util.Scanner;

public class HargaBayar21_2 {
  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int harga, jumlah , jmlHlmn ;
    double dis, total, bayar, jmlDis;
    String merkBuku ;
    
    System.out.print("Masukkan merk buku yang anda beli ");
    merkBuku = input.nextLine();

    System.out.print("Masukkan jumlah halaman buku yang anda beli ");
    jmlHlmn= input.nextInt();

    System.out.print("Masukkan harga barang yang dibeli ");
    harga= input.nextInt();

    System.out.print("Masukkan Jumlah jumlah barang yang dibeli ");
    jumlah= input.nextInt();

    System.out.print("Masukkan Diskon yang anda inginkan ");
    dis= input.nextDouble();

    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah  " + jmlDis);
    System.out.print("Jumlah yang harus dibayarkan adalah  " + bayar);
    
    }
}
