import java.util.Scanner;
public class KursiBioskop {
    
    public static void main(String[] args) {
    Scanner  input = new Scanner(System.in);
        
    int kursi_dipesan , sisa_kursi , jml_kursi ;

        System.out.println("Jumlah Kursi yang tersedia : 200 ");

        jml_kursi= 200;

        System.out.print("Kursi yang sudah dipesan : ");
        kursi_dipesan= input.nextInt();

        sisa_kursi = jml_kursi - kursi_dipesan ;

        System.out.print("Sisa kursi yang tersedia : "+ sisa_kursi);



    }
}