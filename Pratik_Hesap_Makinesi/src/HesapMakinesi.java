import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2,sonuc;
        byte a;
        System.out.println("Hesap Makinesi Programına Hoş Geldiniz.");
        System.out.print("1.sayı: ");
        sayi1 = input.nextDouble();
        System.out.print("2.sayı: ");
        sayi2 = input.nextDouble();
        System.out.println("Toplama = 1");
        System.out.println("Çıkarma = 2");
        System.out.println("Çarpma = 3");
        System.out.println("Bölme = 4");
        System.out.println("Yapmak istediğiniz işlem: ");
        a = input.nextByte();
        switch (a){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.print("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.print("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.print("Sonuç: " + sonuc);
                break;
            case 4:
                if (sayi2 != 0){
                    sonuc = sayi1 / sayi2;
                    System.out.print("Sonuç: " + sonuc);
                    break;
                }
                else{
                    System.out.println("Bölen sayı 0 olamaz.");
                    break;
                }
            default:
                System.out.print("Hatalı Giriş Yaptınız.");
        }
    }
}
