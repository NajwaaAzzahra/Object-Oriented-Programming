public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGaji() {
        // Implementasi metode gaji umum untuk Pegawai
        return 0; 
    }
}
