import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = input.nextInt();
        System.out.println("\n \n \n \n");
        System.out.print("Dizi: {");
        for (int i = 0;i<list.length;i++){
            if (i<list.length-1){
                System.out.print(list[i] + " ");
            }
            else{
                System.out.println(list[i]+"}");
            }
        }
        System.out.println("Girilen Sayı: " + number);
        int a = -999999999;
        int b = 999999999;
        for(int i = 0;i<list.length;i++){


            if (list[i]<number){
                if (list[i]>a){
                    a = list[i];
                }
            }
            else if(list[i]>number){
                if (list[i]<b){
                    b = list[i];
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + a);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + b);
    }
}
