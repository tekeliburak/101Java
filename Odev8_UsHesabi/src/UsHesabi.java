import java.util.Scanner;
public class UsHesabi {
    static int us(int taban, int us){
        if (us==0){
            return 1;
        }
        else{
            us = us -1;
            return us(taban,us) * taban;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,sonuc;
        System.out.print("Taban Değeri: ");
        a = input.nextInt();
        System.out.print("Üs Değeri: ");
        b = input.nextInt();
        sonuc = us(a,b);
        System.out.print("Sonuç: " + sonuc);


    }
}
