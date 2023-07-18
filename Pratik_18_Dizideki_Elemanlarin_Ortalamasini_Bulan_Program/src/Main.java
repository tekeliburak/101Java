import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0,harmonicAvarage;
      for (int i = 0;i<numbers.length;i++){
          double a;
          a = 1.0/numbers[i];
          sum = sum + a;
      }
        harmonicAvarage = numbers.length/sum;
        System.out.println("Girilen dizi: " + Arrays.toString(numbers));
        System.out.print("Harmonik Ortalama: " + harmonicAvarage);
    }
}
