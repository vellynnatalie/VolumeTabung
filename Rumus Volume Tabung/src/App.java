import java.util.Scanner;
import BangunRuang.Tabung;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        Tabung tabung = new Tabung();
        System.out.println("=====================================================================================================");
        System.out.println("Program Menghitung Volume Tabung");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan jari-jari bagian alas atau tutup tabung (cm) = ");
        tabung.r = keyboard.nextInt();
        System.out.print("Masukkan tinggi tabung (cm) = ");
        tabung.t = keyboard.nextInt();
        System.out.println("=====================================================================================================");
        tabung.tampilkanVolumeTabung();
    }
    
}
