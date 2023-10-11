public class Pengembalian {
    private Peminjaman barang;
    private peminjaman jumlahPinjam;
    private peminjaman lamaPinjam;
    private int lamaPinjamKembali;

    public Pengembalian () {
    }

    public void setBarang (Peminjaman barang) {
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setJumlahPinjam (peminjaman jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public peminjaman getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setLamaPinjam (peminjaman lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }

    public peminjaman getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjamKembali (int lamaPinjamKembali) {
        this.lamaPinjamKembali = lamaPinjamKembali;
    }

    public int getLamaPinjamKembali() {
        return lamaPinjamKembali;
    }

    public int hitungDenda (Peminjaman lamaPinjam, int lamaPinjamKembali, peminjaman jumlahPinjam ) {
        int selisihHari=0;
        selisihHari = lamaPinjamKembali - getLamaPinjam();
        if (selisihHari > 0) {
            return selisihHari * 5000 * jumlahPinjam;
        } else {
            return 0;
        }
    }

    public String infoPengembalian (){
        String info = "";
        System.out.println("=========Peminjaman Sistem Inventaris Barang PT. Bunga Purnama=========");
        info += "Barang\t\t: " + barang + "\n";
        info += "Jumlah\t\t: " + jumlahPinjam + "\n";
        info += "Durasi\t\t: " + lamaPinjam + " hari";
        info += "Lama Pinjam\t: " + lamaPinjamKembali + " hari";
        info += "Denda\t\t: " + hitungDenda(barang, lamaPinjamKembali, jumlahPinjam) + " hari";
        return info;
    }
}