public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public void setKode (String kode) {
        this.kode = kode;
    }

    public String getKode () {
        return kode;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        Kursi kursi = this.arrayKursi[nomor - 1];
        if (kursi.getPenumpang() == null) {
            kursi.setPenumpang(penumpang);
        } else {
            Penumpang penumpangSebelumnya = kursi.getPenumpang();
            System.out.println("Kursi nomor " + nomor + " sudah terisi oleh " + penumpangSebelumnya.getNama());
        }
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
}