import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,toplam=0,b=0;
        while (true) {
            System.out.print("Sayı giriniz: ");
            a = input.nextInt();
                if ((a % 4 == 0)&&(a%2==0)) {
                    toplam += a;
                    b +=1;
                }

            else if (a%2==1){
                    System.out.println("Döngü Bitti.");
                break;
            }
        }
        if (b>0){
            System.out.print("Toplam: " + toplam);
        }
        else{
            System.out.print("Sisteme Sayı Girişi Olmadı.");
        }


    }
}
