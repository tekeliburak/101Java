

public class Main {
    public static void main(String[] args) {
        String kelime = "kayak";
        String emilek="";
        boolean x;
        char[] arry = new char[kelime.length()];
        int a = arry.length-1;
        for (int i =0;i< arry.length;i++){
            arry[i] = kelime.charAt(a);
            a=a-1;
        }
        for (int i = 0; i< arry.length;i++){
            emilek = emilek +arry[i];
        }

        System.out.println("Girilen kelime: " + kelime);
        System.out.println("Girilen kelimenin tersi: " + emilek);
        System.out.print("Palindromik mi: ");
        if(kelime.equals(emilek)) {
            x = true;
        }
        else {
            x = false;
        }

        System.out.print(x);



    }
}
