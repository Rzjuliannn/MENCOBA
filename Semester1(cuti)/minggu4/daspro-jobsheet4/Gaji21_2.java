import java.util.Scanner;

public class Gaji21_2 {
  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
    
    System.out.print("Masukkan Gaji Anda ");
    gaji= input.nextInt();

    System.out.print("Masukkan Potongan Gaji Anda ");
    potGaji= input.nextInt();

    System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk= input.nextInt();
    
    System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
    JmlTdkMasuk= input.nextInt();

    TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
    System.out.print("Gaji yang anda terima adalah  " + TotGaji);
    }
}
