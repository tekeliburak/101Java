import java.util.Scanner;
public class Taxi {
    public static void main(String[] args) {
        double km, km_unit = 2.20, start = 10.0, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafe(km): ");
        km = input.nextDouble();
        total = (km*km_unit)+start;
        total = (total<=20) ? 20: total;
        System.out.println("Toplam Ücret: " + total);

    }
}
