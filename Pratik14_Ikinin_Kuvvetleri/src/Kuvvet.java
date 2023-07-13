import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz: ");
        a = input.nextInt();
        for (int i = 1;i<=a;i*=4){
            for (int j = 1; j<=a;j*=5){
                if (i>1){
                    break;
                }
                System.out.println("5in kuvveti=> " + j);
            }
            System.out.println("4ün kuvveti=> " + i);
        }
    }
}
