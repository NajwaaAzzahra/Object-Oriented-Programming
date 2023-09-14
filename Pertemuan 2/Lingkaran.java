public class Lingkaran {
    public double phi;
    public int r;

    public double hitungLuas() {
        double luas = phi * r * r;
        System.out.println("Jari-Jari Lingkaran\t: "+ r);
        System.out.println("Luas Lingkaran\t\t: "+luas);
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran\t: "+keliling );
        return keliling;
    }
    public static void main(String[] args) {
        Lingkaran l1=new Lingkaran();
        l1.phi=22.7;
        l1.r=15;
        l1.hitungLuas();
        l1.hitungKeliling();
    }
}
