import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int prediction;
        int temp = 0;
        int[] wrong = new int[5];
        number = (int)(Math.random()*100);
        //System.out.println(number);
        System.out.println("Sayı tahmin etme oyununa hoş geldiniz. Sistem tarafından seçilen sayıyı bulmak için 5 hakkınız mevcuttur.");
        for (int i = 0;i<5;i++){
            System.out.println((i+1) + ".hak:");
            System.out.print("Sayıyı Giriniz: ");
            prediction = input.nextInt();
            System.out.println("Tahmininiz: " + prediction);
            if (prediction<0 || prediction>99){
                temp += 1;
                if (temp<=1){
                    System.out.println("Lütfen 0-100 arası tahmin giriniz. 2.kez böyle bir hata yaparsanız 1 can kaybedeceksiniz.");
                    i = i-1;
                }
                else{
                    wrong[i] = prediction;
                    if (i!=4){
                        System.out.println("Bir can hakkı kaybedildi.");
                    }
                    else{
                        System.out.println("Bir can hakkı kaybedildi. Oyun bitti.");
                        System.out.println("Sistemin sayısı: " + number);
                    }

                }
            }
            else if (prediction<number){
                wrong[i] = prediction;
                if (i==4){
                    System.out.println("Tahmininz, sistemin sayısından küçüktür. Oyun bitti.");
                    System.out.println("Sistemin sayısı: " + number);
                }
                else{
                    System.out.println("Tahmininz, sistemin sayısından küçüktür. Tahmininizi arttırınız.");
                }
                continue;
            }
            else if (prediction>number){
                wrong[i] = prediction;
                if (i==4){
                    System.out.println("Tahmininiz, sistemin sayısından büyüktür. Oyun Bitti.");
                    System.out.println("Sistemin sayısı: " + number);
                }
                else{
                    System.out.println("Tahmininiz, sistemin sayısından büyüktür. Tahmininzi düşürünüz.");
                }

                continue;
            }
            else if (prediction == number){
                wrong[i]=prediction;
                System.out.println("Sistemin seçtiği sayı: " + number);
                System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
                break;
            }
        }
        System.out.print("Tahminleriniz: ");
        for (int i =0;i<5;i++){
            if (wrong[i]!=0){
                System.out.print(wrong[i] + " ");
            }

        }
    }
}
