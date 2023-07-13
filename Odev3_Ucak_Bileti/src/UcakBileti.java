import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe,tutar=0;
        int yas;
        byte yolculukTipi;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1=> Tek yön, 2=> Gidiş-Dönüş): ");
        yolculukTipi = input.nextByte();
        if((mesafe>0)&&(yas>0)&&(yolculukTipi==1 || yolculukTipi == 2)) {
            tutar = mesafe * (0.10);
            if (yas < 12) {
                tutar = tutar * 0.5;
                if (yolculukTipi == 2) {
                    tutar = tutar * 0.8;
                    tutar = tutar * 2;
                }
            } else if (yas >= 12 && yas <= 24) {
                tutar = tutar * 0.9;
                if (yolculukTipi == 2) {
                    tutar = tutar * 0.8;
                    tutar = tutar * 2;
                }
            } else if (yas >= 65) {
                tutar = tutar * 0.7;
                if (yolculukTipi == 2) {
                    tutar = tutar * 0.8;
                    tutar = tutar * 2;
                }
            } else {
                if (yolculukTipi == 2) {
                    tutar = tutar * 0.8;
                    tutar = tutar * 2;
                }
                System.out.print("Toplam Tutar: " + tutar + " TL");

            }
        }
        else{
                System.out.print("Hatalı Veri Girdiniz!");
            }


    }
}
