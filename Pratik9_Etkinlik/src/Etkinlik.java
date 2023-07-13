import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.print("Sıcaklık Değeri: ");
        temperature = input.nextDouble();
        if (temperature<=5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }
        if (temperature>=5 && temperature<=15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        if (temperature>=15 && temperature<=25){
            System.out.println("Pikniğe Gidebilirsiniz.");
        }
        if (temperature>=25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }


    }
}
