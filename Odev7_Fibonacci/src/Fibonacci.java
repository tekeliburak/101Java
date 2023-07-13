import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,first = 1,second = 1,yeni;
        System.out.print("Bir sayı Giriniz: ");
        a = input.nextInt();

        if (a>=3){
            System.out.print(first + " " + second + " ");
            for (int i=3;i<=a;i++){
                if (i!=a) {
                    yeni = first + second;
                    System.out.print(yeni + " ");
                    first = second;
                    second = yeni;
                }
                else{
                    yeni = first + second;
                    System.out.print(yeni);
                }

            }

        }
        else if(a ==1 ){
            System.out.print(first);
        } else if (a == 2) {
            System.out.print(first + " " + second);
        }
        else{
            System.out.print("Hatalı Giriş Yaptınız.");
        }
    }
}