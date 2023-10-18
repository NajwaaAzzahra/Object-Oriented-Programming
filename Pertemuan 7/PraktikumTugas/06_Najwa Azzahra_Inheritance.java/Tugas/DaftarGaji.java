public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int jumlahPegawai) {
        this.jumlahPegawai = 0;
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar pegawai sudah penuh");
        }
    }

    public void printSemuaGaji() {
        System.out.println("Daftar Gaji Pegawai:");
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}
