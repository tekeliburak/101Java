import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleman,r,bolunen=1,bolen1=1,bolen2=1;
        double sonuc;
        System.out.print("Kümenin eleman sayısı: ");
        eleman = input.nextInt();
        System.out.print("Kaçlı Kombinasyon: ");
        r = input.nextInt();
        if ((eleman>0 && r>0) && (eleman>r)){
            for (int i = 1;i<=eleman;i++){
                bolunen = bolunen * i;
            }
            for (int i = 1; i<=r;i++){
                bolen1 = bolen1*i;
            }
            for (int i =1;i<=(eleman-r);i++){
                bolen2 = bolen2*i;
            }

            sonuc = bolunen/(bolen1*bolen2);
            System.out.print("Sonuç: " + sonuc);


        }
        else{
            System.out.print("Hatalı Giriş Yaptınız.");
        }

    }
}
