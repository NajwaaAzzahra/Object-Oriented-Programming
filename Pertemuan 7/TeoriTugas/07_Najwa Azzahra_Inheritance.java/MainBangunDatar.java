public class MainBangunDatar {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(8.5f, 8f);
        System.out.println("Luas Persegi Panjang\t\t: "+pp.luas()+ " cm");
        System.out.println("Keliling Persegi Panjang\t: "+pp.keliling()+ " cm");
        System.out.println("-------------------------------------------------------");

        Lingkaran l = new Lingkaran(27.7f);
        System.out.println("Luas Lingkaran\t\t\t: "+l.luas()+ " cm");
        System.out.println("Keliling Lingkaran\t\t: "+l.keliling()+ " cm");
        System.out.println("-------------------------------------------------------");

        Segitiga s = new Segitiga(9f, 12f);
        System.out.println("Luas Segitiga\t\t\t: "+s.luas()+ " cm");
        System.out.println("Keliling Segitiga\t\t: "+s.keliling()+ " cm");
        System.out.println("-------------------------------------------------------");
    }
}