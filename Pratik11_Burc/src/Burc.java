import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay, gun;
        System.out.print("Doğum ayınızı rakamlar kullanarak giriniz (Ocak=>1,....,Aralık=>12): ");
        ay = input.nextInt();
        System.out.print("Ayın hangi gününde doğdunuz (1,..,31): ");
        gun = input.nextInt();
        if (ay == 1){
            if (gun>=1 && gun<=21){
                System.out.print("Oğlak Burcu");
            } else if (gun>=22 && gun<=31) {
                System.out.print("Kova Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay == 2) {
            if (gun>=1 && gun<=19){
                System.out.print("Kova Burcu");
            } else if (gun>=20 && gun<=29) {
                System.out.print("Balık Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay == 3) {
            if (gun>=1 && gun<=20){
                System.out.print("Balık Burcu");
            } else if (gun>=21 && gun<=31) {
                System.out.print("Koç Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay == 4) {
            if (gun>=1 && gun<=20){
                System.out.print("Koç Burcu");
            } else if (gun>=21 && gun<=30) {
                System.out.print("Boğa Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay ==5) {
            if (gun>=1 && gun<=21){
                System.out.print("Boğa Burcu");
            } else if (gun>=22 && gun<=31) {
                System.out.print("İkizler Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==6) {
            if (gun>=1 && gun<=22){
                System.out.print("İkizler Burcu");
            } else if (gun>=23 && gun<=30) {
                System.out.print("Yengeç Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==7) {
            if (gun>=1 && gun<=22){
                System.out.print("Yengeç Burcu");
            } else if (gun>=23 && gun<=31) {
                System.out.print("Aslan Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==8) {
            if (gun>=1 && gun<=22){
                System.out.print("Aslan Burcu");
            } else if (gun>=23 && gun<=31) {
                System.out.print("Başak Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==9) {
            if (gun>=1 && gun<=22){
                System.out.print("Başak Burcu");
            } else if (gun>=23 && gun<=30) {
                System.out.print("Terazi Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==10) {
            if (gun>=1 && gun<=22){
                System.out.print("Terazi Burcu");
            } else if (gun>=23 && gun<=31) {
                System.out.print("Akrep Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==11) {
            if (gun>=1 && gun<=21){
                System.out.print("Akrep Burcu");
            } else if (gun>=22 && gun<=30) {
                System.out.print("Yay Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        } else if (ay==12) {
            if (gun>=1 && gun<=21){
                System.out.print("Yay Burcu");
            } else if (gun>=22 && gun<=31) {
                System.out.print("Oğlak Burcu");
            }
            else{
                System.out.print("Geçersiz rakam girdiniz.");
            }
        }
        else{
            System.out.print("Geçersiz rakam girdiniz.");
        }
    }
}
