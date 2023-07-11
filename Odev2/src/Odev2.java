import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplam = 0, kg;
        System.out.print("Armut kaç kilo?: ");
        kg = input.nextDouble();
        toplam += (kg*2.14);

        System.out.print("Elma kaç kilo?: ");
        kg = input.nextDouble();
        toplam += (kg*3.67);

        System.out.print("Domates kaç kilo?: ");
        kg = input.nextDouble();
        toplam += (kg*1.11);

        System.out.print("Muz kaç kilo?: ");
        kg = input.nextDouble();
        toplam += (kg*0.95);

        System.out.print("Patlıcan kaç kilo?: ");
        kg = input.nextDouble();
        toplam += (kg*5.0);

        System.out.print("Toplam Tutar: " + toplam + " Tl");
    }
}
