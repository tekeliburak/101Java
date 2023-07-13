import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Girilen 3 Sayıyı küçükten büyüğe doğru sıralayan program. Lütfen aynı sayıları tekrar girmeyiniz.");
        System.out.print("1.sayı: ");
        a = input.nextInt();

        System.out.print("2.sayı: ");
        b = input.nextInt();

        System.out.print("3.sayı: ");
        c = input.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.print("Sıralama: " + a + " < " + b + " < " + c);
            }
            else{
                System.out.print("Sıralama: " + a + " < " + c + " < " + b);
            }
        }
        else if (b<a && b<c) {
            if (a<c){
                System.out.print("Sıralama: " + b + " < " + a + " < " + c);
            }
            else{
                System.out.print("Sıralama: " + b + " < " + c + " < " + a);
            }
        } else if (a==b || a==c || b==c) {
            System.out.print("Lütfen aynı sayı girmeyiniz.");
        }
        else{
            if (a<b){
                System.out.print("Sıralama: " + c + " < " + a + " < " + b);
            }
            else{
                System.out.print("Sıralama: " + c + " < " + b + " < " + a);
            }
        }
    }
}
