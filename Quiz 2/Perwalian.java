import java.util.ArrayList;
public class Perwalian {
    //array untuk menampung data matakuliah dan mahasiswa
    ArrayList<Mahasiswa> mhsList;
    ArrayList<MataKuliah> matkulList;

    //konstruktor
    public Perwalian() {
        mhsList = new ArrayList<>();
        matkulList = new ArrayList<>();
    }

    //tambah mahasiswa dalam array
    public void tambahMhs(Mahasiswa mhs) {
        mhsList.add(mhs);
    }

    //tambah matkul dalam array
    public void tambahMatkul(MataKuliah matkul) {
        matkulList.add(matkul);
    }

    //menampilkan data mahasiswa dan matakuliah
    public void tampilData() {
        for (Mahasiswa mhs : mhsList) {
            System.out.println("DATA NILAI MAHASISWA: " + mhs.nama + " (" + mhs.nim + ")");
            for (MataKuliah matkul : matkulList) {
                System.out.println("Mata Kuliah\t: " + matkul.nama_matakuliah );
                System.out.println("SKS\t\t: "+matkul.sks); 
                System.out.println("Nilai\t\t: "+mhs.nilai); 
                System.out.println("IPK\t\t: "+mhs.hitungIpk());
                System.out.println("IPK dengan SKS\t: "+mhs.hitungIpk(matkul.sks));
                System.out.println("Bobot \t\t: " + matkul.hitungBobot());
                System.out.println("Bobot Mahasiswa\t: " + matkul.hitungBobot(2.3)+"\n");
            }
            System.out.println("\n");
        }
    }
}