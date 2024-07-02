import java.util.Scanner;

public class Segitiga21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
    
    //NOTE    
    //sc dibuat untuk objek scanner (aslinya bebas dalam menentukan nama, tidak harus sc ) 
    // tapi harus di ingat saat memasukkan sebelum 'nextInt'
    
    int alas, tinggi;
    float luas;

    System.out.print("Masukkan alas : ");
    alas = sc.nextInt();    
    
    //NOTE
    //sc ditulis karena sc merupakan objek scanner, misal objek scanner namanya 'udin' maka sc akan berganti menjadi udin.

    System.out.print("Masukkan tinggi : ");
    tinggi = sc.nextInt();

    luas = alas * tinggi / 2;

    System.out.println("Luas Segitiga: " + luas);
    }

}
