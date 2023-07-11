import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz: ");
        double tutar = input.nextDouble();
        double kdv = (tutar<=1000 && tutar>=0) ? 0.18 : 0.08;
        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + (tutar + (tutar * kdv)));
        System.out.println("KDV Tutarı: " + (tutar * kdv));

    }
}
