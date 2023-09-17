public class KaryawanMain {

    public static void main(String[] args) {

        Karyawan k1 = new Karyawan();
        k1.nama = "Revilinda Fitri";
        k1.id = "193456";
        k1.gender = "Perempuan";
        k1.jabatan = "Human Resource";
        k1.gajiPokok = 3400000;
        k1.gajiTunjangan = 2100000;
        k1.gajiLembur = 510000;
        k1.tampilKaryawan();
        k1.lihatGaji();
    }
}