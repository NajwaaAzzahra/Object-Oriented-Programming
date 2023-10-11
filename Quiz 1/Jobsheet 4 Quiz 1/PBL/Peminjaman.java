public class Peminjaman {
    private Barang barang;
    private int jumlahPinjam;
    private int lamaPinjam;


    public Peminjaman() {
    }

    public void setBarang (Barang barang) {
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setJumlahPinjam (int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setLamaPinjam (int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public String infoPinjam (){
        String info = "";
        System.out.println("=========Peminjaman Sistem Inventaris Barang PT. Bunga Purnama=========");
        info += "Barang\t: " + barang + "\n";
        info += "Jumlah\t: " + jumlahPinjam + "\n";
        info += "Durasi\t: " + lamaPinjam + " hari";
        return info;
    }
}