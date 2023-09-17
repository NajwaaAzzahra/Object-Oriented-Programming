public class Mahasiswa {
    public String nama;
    public String nim;
    public String alamat;
    public String kelas;
    public String prodi;

    public void tampilIdentitas() {
        System.out.println("Biodata Mahasiswa");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nim\t\t: " + nim);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Prodi\t\t: " + prodi);
    }
    
    public void ubahNama (String namaBaru) {
        nama = namaBaru;
    }

    public void ubahNim (String nimBaru) {
        nim = nimBaru;
    }
    public void ubahaAlamat (String alamatBaru) {
        alamat = alamatBaru;
    }
}