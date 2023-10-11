public class Stok {

    private String barang;
    private int stok;
    private int harga;

    public Stok (){
    }

    public Stok (String barang, int stok, int harga) {
        this.barang = barang;
        this.stok = stok;
        this.harga = harga;
    }

    public Stok (String barang,  int harga) {
        this.barang = barang;
        this.harga = harga;
    }

    public void setBarang (String barang) {
        this.barang = barang;
    }

    public String getBarang () {
        return barang;
    }

    public void setStok (int stok) {
        this.stok = stok;
    }

    public int getStok () {
        return stok;
    }

    public void setHarga (int harga) {
        this.harga = harga;
    }

    public int getHarga () {
        return harga;
    }

    
    public String info (){
        String info = "";
        System.out.println("=========Stok Purnama Luxury Store=========");
        info += "Barang\t: " + barang + "\n";
        info += "Stok\t: " + stok + "\n";
        info += "Harga\t: Rp" + harga + "\n";
        return info;
    }

}