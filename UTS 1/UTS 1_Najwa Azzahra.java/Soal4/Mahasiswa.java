public class Mahasiswa {
    String nim, nama, alamat; 
    char jenisKelamin;

    public Mahasiswa () {
    }
    
    public Mahasiswa (String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa("2241720139", "Najwa Azzahra", "Singosari, Malang", 'P');
        System.out.println("Nim\t\t: "+m1.nim);
        System.out.println("Nama\t\t: "+m1.nama);
        System.out.println("Alamat\t\t: "+m1.alamat);
        System.out.println("Jenis Kelamin\t: "+m1.jenisKelamin);
    }
}