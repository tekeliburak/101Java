import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil,kalan;
        String burc;
        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = input.nextInt();
        kalan = yil % 12;
        if (kalan == 0){
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Köpek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Öküz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavşan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yılan";
        } else if (kalan == 10) {
            burc = "At";
        }
        else{
            burc = "Koyun";
        }
        System.out.print("Çin Zodyağı Burcunuz: " + burc);
    }
}
