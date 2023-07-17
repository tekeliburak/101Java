public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 30,true);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 30,false);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
