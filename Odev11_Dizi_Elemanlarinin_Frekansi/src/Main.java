import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] list = {10,20,20,10,10,20,5,20};
      int count = 1;
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
      for (int i = 0;i<list.length;i++){
          for (int j = 0; j<list.length;j++){
              if (i!=j && list[i]==list[j]&&list[i]!=0){
                  list[j]=0;
                  count+=1;
              }
          }
          if (list[i]!=0){
              System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
          }
          count = 1;
      }
    }
}
