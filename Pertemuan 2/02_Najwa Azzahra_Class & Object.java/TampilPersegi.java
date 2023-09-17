public class TampilPersegi {

    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        p.infoPersegi();
        p.luasPersegi();
        p.kelilingPersegi();

        System.out.println();
        Persegi p1 = new Persegi(45);
        p1.infoPersegi();
        p1.luasPersegi();
        p1.kelilingPersegi();
    }
}