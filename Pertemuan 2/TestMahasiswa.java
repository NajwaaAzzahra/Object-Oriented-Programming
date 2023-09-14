public class TestMahasiswa {
public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();
        MataKuliah mk = new MataKuliah();

        mhs.nim ="2245678";
        mhs.nama = "Cikita Fista";
        mhs.alamat = "Pakis, Malang";
        mhs.kelas = "TI-2C";
        mhs.prodi = "D-IV Teknik Informatika";
        mhs.tampilIdentitas();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim ="2345881";
        mhs1.nama = "Henry Stuart Hanover";
        mhs1.alamat = "Pakisaji, Malang";
        mhs1.kelas = "SIB-1F";
        mhs1.prodi = "D-IV Sistem Informasi Bisnis";
        mhs1.tampilIdentitas();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim ="2149221";
        mhs2.nama = "Alex Clarmon";
        mhs2.alamat = "Gondanglegi, Malang";
        mhs2.kelas = "TI-3G";
        mhs2.prodi = "D-IV Teknik Informatika";
        mhs2.tampilIdentitas();
    }
}