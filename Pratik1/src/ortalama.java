import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        int mat = input.nextInt();

        System.out.print("Fizik notu: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notu: ");
        int turkce = input.nextInt();

        System.out.print("Müzik notu: ");
        int muzik = input.nextInt();

        System.out.print("Tarih notu: ");
        int tarih = input.nextInt();

        double toplam = mat + fizik + kimya + turkce + muzik + tarih;
        double ortalama = toplam/6;
        System.out.println("Ortalama: " + ortalama);

        String durum;
        durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
