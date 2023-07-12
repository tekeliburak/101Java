import java.util.Scanner;
public class KullaniciAdi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, password,newpassword;
        byte a;
        System.out.print("Kullanıcı Adı: ");
        user = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        if(user.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Başarılı...");
        }
        else if(user.equals("patika") &&  !(password.equals("java123"))){
            System.out.println("Şifre Hatalı.");
            System.out.print("Sıfırlamak için 1 e basın. ");
            a = input.nextByte();
            switch (a){
                case 1:
                    System.out.print("Yeni Şifre: ");
                    input.nextLine();
                    newpassword = input.nextLine();
                    if (newpassword.equals("java123") || newpassword.equals(password)){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                    break;
                default:
                    System.out.print("Şifreniz değiştirilmedi.");
            }
        }
        else{
            System.out.print("Hatalı Giriş Yaptınız.");
        }

    }
}
