import java.util.Scanner;
public class Desen {
    static int kural(int sayi,int terim){
        int bolum,ortanca,sonuc;
        terim = terim - 1;
        if (sayi%5==0){
            bolum = sayi/5;
            bolum = bolum*2+1;
            ortanca = bolum/2;
        }
        else{
            bolum = sayi/5;
            bolum = bolum*2+3;
            ortanca = bolum/2;
        }
        if(terim>ortanca && terim>0){
            sonuc = kural(sayi,terim) + 5;
            System.out.print(sonuc + " ");
        } else if (terim<=ortanca && terim>0) {
            sonuc = kural(sayi,terim) - 5;
            System.out.print(sonuc + " ");
        }
        else{
            sonuc = sayi;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aa,bolum;
        System.out.print("N Sayısı: ");
        aa = input.nextInt();
        if(aa>=0){
            System.out.print("Çıktısı: " + aa + " ");
            bolum = aa/5;
            if (aa%5==0){
                bolum = bolum*2+1;
                kural(aa,bolum);
            }
            else{
                bolum = bolum * 2 +3;
                kural(aa,bolum);
            }
        }
        else{
            System.out.print("Hatalı Sayı Girdiniz. 0 veya pozitif tam sayı giriniz.");
        }
    }
}