public class TestOverriding {

    public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen dos = new Dosen();
        Mahasiswa mhs= new Mahasiswa();

        //class manusia
        man.bernafas();
        man.makan();

        //class dosen
        dos.makan();
        dos.lembur();

        //class mahasiswa
        mhs.makan();
        mhs.tidur();
    }
}