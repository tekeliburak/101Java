import java.util.Scanner;
public class GirilenSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b=0,toplam = 0,ortalama;
        System.out.print("Pozitif tam sayı giriniz: ");
        a = input.nextInt();
        if (a>0){
            for (int i = 0;i<=a;i++){
                if ((i % 3 == 0) && (i % 4 == 0)){
                    b +=1;
                    toplam += i;
                }

            }
            if (b==0){
                System.out.print("3 ve 4e bölünen bir sayı yoktur.");

            }
            else{
                ortalama = toplam / b;
                System.out.print("Ortalama: " + ortalama);
            }
        }
        else{
            System.out.print("Hatalı Sayı Girdiniz.");
        }

    }
}
