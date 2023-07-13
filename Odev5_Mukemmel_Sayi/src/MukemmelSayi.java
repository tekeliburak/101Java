import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,toplam=0;
        System.out.print("Bir Sayı Giriniz: ");
        a = input.nextInt();
        if (a>0){
            for(int i=1;i<a;i++){
                if(a%i==0){
                    toplam = toplam + i;
                }
            }
            if(a==1){
                System.out.print("1 Mükemmel sayı değildir.");
            }
            else{
                if (toplam==a){
                    System.out.print(toplam + " Mükemmel sayıdır.");
                }
                else{
                    System.out.print(a + " Mükemmel sayı değildir.");
                }
            }

        }
        else{
            System.out.print("Pozitif Tam Sayı Giriniz.");
        }


    }
}
