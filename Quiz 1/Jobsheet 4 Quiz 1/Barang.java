public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int jumlahStok;

    public Barang() {
    }

    public void setKodeBarang (String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setNamaBarang (String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setJumlahStok (int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }
    
    public int getJumlahStok() {
        return jumlahStok;
    }

    public String info (){
        String info = "";
        System.out.println("=========Sistem Inventaris Barang PT. Bunga Purnama=========");
        info += "Kode\t: " + kodeBarang + "\n";
        info += "Barang\t: " + namaBarang + "\n";
        info += "Stok\t: " + jumlahStok + "\n";
        return info;
    }
}