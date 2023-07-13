import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,satir,bosluk=0,yenisatir;
        System.out.print("Basamak Sayısı (2'den büyük tam sayı giriniz): ");
        a = input.nextInt();
        if(a>=2) {

            satir = (2 * a) - 1;
            yenisatir = satir;
            for (int i = 0; i < a; i++) {
                if (i == 0) {
                    for (int y = 0; y < satir; y++) {
                        System.out.print("*");
                    }
                } else {
                    yenisatir = yenisatir - 2;
                    for (int y = 0; y < i; y++) {
                        System.out.print(" ");
                    }
                    for (int y = 0; y < yenisatir; y++) {
                        System.out.print("*");
                    }
                    for (int y = 0; y < i; y++) {
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");

            }
        }
        else{
            System.out.print("Hatalı Değer Girdiniz.");
        }

    }
}
