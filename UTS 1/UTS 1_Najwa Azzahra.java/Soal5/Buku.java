public class Buku {
    private String ISBN;
    private String judul;
    private Penulis penulis;
    private Penulis alamat;

    private int harga;
    
    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setJudul (String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis (Penulis penulis) {
        this.penulis = penulis;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setAlamat (Penulis alamat) {
        this.alamat = alamat;
    }

    public Penulis getAlamat() {
        return alamat;
    }

    public void setHarga (int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}