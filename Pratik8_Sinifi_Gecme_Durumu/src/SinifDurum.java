import java.util.Scanner;
public class SinifDurum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matematik, fizik, turkce, kimya, muzik, average, total = 0;
        int a = 0;

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextDouble();
        if((matematik>=0 && matematik<=100)){
            total += matematik;
        }
        else{
            a += 1;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if((fizik>=0 && fizik<=100)){
            total += fizik;
        }
        else{
            a += 1;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        if((turkce>=0 && turkce<=100)){
            total += turkce;
        }
        else{
            a +=1;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if((kimya>=0 && kimya<=100)){
            total += kimya;
        }
        else{
            a +=1;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();
        if((muzik>=0 && muzik<=100)){
            total += muzik;
        }
        else{
            a += 1;
        }

        if (a == 5){
            System.out.print("Lütfen not girişlerini doğru yapalım.");
        }
        else {
            average = total / (5-a);
            if (average>=55){
                System.out.print("Tebrikler sınıfı " + average + " puanla geçtiniz.");
            }
            else {
                System.out.print("Üzgünüm. Sınıfta " + average + " puanla kaldınız.");
            }
        }
    }
}
