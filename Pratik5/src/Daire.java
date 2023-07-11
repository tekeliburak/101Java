import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14, r, a, alan;
        System.out.print("Yarı Çap: ");
        r = input.nextDouble();
        System.out.print("Daire Diliminin Açısı (0<a<360): ");
        a = input.nextDouble();
        alan = (pi*r*r)*(a/360);
        System.out.print("Daire Diliminin Alanı: " + alan);


    }
}
