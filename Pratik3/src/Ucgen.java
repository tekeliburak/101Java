import java.sql.SQLOutput;
import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1.kenarı: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2.kenarı: ");
        b = input.nextInt();
        System.out.print("Üçgenin 3.kenarı: ");
        c = input.nextInt();

        double u2 = (a+b+c);
        double u = u2/2;
        double alan;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan: " + alan);


    }
}
