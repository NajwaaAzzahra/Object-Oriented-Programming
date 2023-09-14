public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargaJual = (int) (hargaDasar - ((hargaDasar*diskon)/100));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("===================================");
        System.out.println("      Purnama Departmen Store");
        System.out.println("===================================");
        System.out.println("ID Penjualan\t: "+kode);
        System.out.println("Barang\t\t: "+namaBarang);
        System.out.println("Harga\t\t: "+hargaDasar);
        System.out.println("Diskon\t\t: "+diskon+" %");
        System.out.println("Harga Total\t: Rp"+hitungHargaJual());
    }

    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode="56789";
        b1.namaBarang="Midi Dress Caluna";
        b1.hargaDasar=279990;
        b1.diskon=27;
        b1.hitungHargaJual();
        b1.tampilData();
    }
}