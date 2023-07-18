import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,8,10,10,10,10,8,6,6};
        int[] duplicate = new int[list.length];
        for (int i = 0;i<list.length;i++){
            for (int j = 0;j<list.length;j++){
                if (i!=j && list[i]==list[j]&&list[i]%2==0){
                    duplicate[i]=list[i];
                }

            }
        }
        for (int i = 0;i<duplicate.length;i++){
            for (int j = 0; j<duplicate.length;j++){
                if (i!=j&&duplicate[i]==duplicate[j]){
                    duplicate[j]=0;
                }
            }
        }
        for (int i:duplicate){
            if (i!=0){
                System.out.println(i);
            }
        }
    }
}