public class Persewaan {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public void tampilData() {
        int total = harga * lamaSewa;
        System.out.println("Persewaan Game Leoxa");
        System.out.println("ID Pemesanan\t: "+id);
        System.out.println("Nama Member\t: "+namaMember);
        System.out.println("Game\t\t: "+namaGame);
        System.out.println("Lama Sewa\t: "+lamaSewa+" hari");
        System.out.println("Harga per Hari\t: "+harga);
        System.out.println("Harga Total\t: "+total);
    }
}