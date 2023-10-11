public class Transaksi {

    private Pembeli nama;
    private Pembeli idMember;
    private Stok barang;
    private Stok harga;
    private int jumlah;
    private Cabang kota;
    private Cabang alamat;

    public Transaksi (){
    }

    public Transaksi (Pembeli nama, Pembeli idMember, Stok barang, Stok harga, int jumlah, Cabang kota, Cabang alamat) {
        this.nama=nama;
        this.idMember=idMember;
        this.barang=barang;
        this.harga=harga;
        this.jumlah=jumlah;
        this.kota = kota;
        this.alamat=alamat;
    }

    public void setNama (Pembeli nama) {
        this.nama = nama;
    }

    public Pembeli getNama () {
        return nama;
    }

    public void setIdMember (Pembeli idMember) {
        this.idMember = idMember;
    }

    public Pembeli getIdMember () {
        return idMember;
    }

    public void setBarang (Stok barang) {
        this.barang = barang;
    }

    public Stok getBarang () {
        return barang;
    }

    public void setHarga (Stok harga) {
        this.harga = harga;
    }

    public Stok getHarga () {
        return harga;
    }

    public void setJumlah (int jumlah) {
        this.jumlah = jumlah;
    }

    public int getjumlah () {
        return jumlah;
    }

    public int bayar() {
        int total = harga.getHarga() * jumlah;
        if (total>450000) {
            total= total-(int)(total*0.2);
            System.out.println("Selamat anda mendapatkan diskon 20%");
        } else {
            total = total;
        }
        return total;
    }
    
    public void setKota (Cabang kota) {
        this.kota = kota;
    }

    public Cabang getKota () {
        return kota;
    }

    public void setAlamat (Cabang alamat) {
        this.alamat = alamat;
    }

    public Cabang getAlamat () {
        return alamat;
    }

    public String infoTransaksi() {
        String info = "";
        info += "========Purnama Luxury Store=========\n";
        info += "Cabang\t: " + kota.getKota() + "\n";
        info += "Alamat\t: " + alamat.getAlamat() + "\n";
        info += "Nama\t: " + nama.getNama() + "\n";
        info += "IdMember: " + idMember.getIdMember() + "\n";
        info += "Barang\t: " + barang.getBarang() + "\n";
        info += "Harga\t: Rp" + harga.getHarga() + "\n";
        return info;
    }
}