public class MataKuliah {
    //atribut class Matakuliah
    public String nama_matakuliah;
    public int sks;
    public int nilai_mahasiswa;

    //konstruktor
    public MataKuliah(String nama_matakuliah, int sks, int nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks=sks;
        this.nilai_mahasiswa=nilai_mahasiswa;
    }

    //metode hitung_bobot untuk menghitung bobot mata kuliah berdasarkan nilai mahasiswa.
    public double hitungBobot() {
        return nilai_mahasiswa * sks;
    }

    // Overload metode hitung_bobot yang menerima parameter bobot_mahasiswa
    public double hitungBobot(double bobot_mahasiswa) {
        return nilai_mahasiswa * sks * bobot_mahasiswa;
    }
}