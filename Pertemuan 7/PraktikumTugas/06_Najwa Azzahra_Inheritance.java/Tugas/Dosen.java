public class Dosen extends Pegawai {
    private int jumlahSKS;
    private int tarifSKS;

    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarifSKS) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.tarifSKS = tarifSKS;
    }

    public void setSKS (int jumlahSKS) {
        this.jumlahSKS=jumlahSKS;
    }

    @Override
    public int getGaji() {
        // Override metode getGaji() untuk Dosen
        return jumlahSKS * tarifSKS;
    }
}
