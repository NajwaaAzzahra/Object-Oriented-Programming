public class Persegi {
    public int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void infoPersegi() {
        System.out.println("Informasi Data Persegi Panjang");
        System.out.println("Panjang Sisi\t\t: " + sisi + " cm");
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi\t\t: " + luas + " cm2");
        return luas;
    }

    public int kelilingPersegi() {
        int keliling = 4 * sisi;
        System.out.println("Keliling Persegi\t: " + keliling  + " cm");
        return keliling;
    }
}