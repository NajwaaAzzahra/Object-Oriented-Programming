package Tugas4Koperasi;
public class Koperasi {
    private String nama;
    private String nik;
    private int limit;
    private int pinjam;

    Koperasi(String nik, String nama, int limit) {
        this.nama = nama;
        this.nik = nik;
        this.limit = limit;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setNik (String nik) {
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }

    public String getNik(){
        return nik;
    }

    public int getJumlahPinjaman(){
        return pinjam;
    }

     public int getLimitPinjaman(){
        return limit;
    }

    public void pinjam (int uang) {
        if (uang>=limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            pinjam += uang;
        }
    }

    public void angsur (int uang) {
        if (uang < (0.1 * pinjam)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else{
            pinjam -= uang;
        }
    }
}