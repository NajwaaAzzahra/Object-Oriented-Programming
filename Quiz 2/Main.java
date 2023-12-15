public class Main {
    public static void main(String[] args) {
        //objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("NAJWA AZZAHRA", "2241720139", 95);
        Mahasiswa mhs2 = new Mahasiswa("RAFAEL STRUICK", "2241720076", 85);

        //objek MataKuliah
        MataKuliah mk1 = new MataKuliah("Manajemen Proyek", 2, 90);
        MataKuliah mk2 = new MataKuliah("Basis Data Lanjut", 3, 97);

        //perwalian
        Perwalian p = new Perwalian();
        p.tambahMhs(mhs1);
        p.tambahMhs(mhs2);

        p.tambahMatkul(mk1);
        p.tambahMatkul(mk2);

        //cetak info
        p.tampilData();
    }
}