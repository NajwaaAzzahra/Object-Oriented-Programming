public class Mahasiswa {
    //atribut class Mahasiswa
    public String nama;
    public String nim;
    public int nilai;

    //konstruktor
    public Mahasiswa (String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    //hitung IPK berdasarkan nilai
    public double hitungIpk() {
        if (nilai > 85) {
            return 4.0;
        } else if (nilai > 80 && nilai <=85) {
            return 3.7;
        } else if (nilai > 75 && nilai <=80) {
            return 3.3;
        } else if (nilai > 70 && nilai <=75) {
            return 3.0;
        } else if (nilai > 60 && nilai <=70) {
            return 2.7;
        } else if (nilai > 50 && nilai <=60) {
            return 2.3;
        } else if (nilai > 40 && nilai <=50) {
            return 2.0;
        } else if (nilai > 30 && nilai <=40) {
            return 1.7;
        } else if (nilai > 20 && nilai <=35) {
            return 1.0;
        } else {
            return 0;
        }
    }

    // Overload metode hitung_ipk dengan parameter sks
    public double hitungIpk(int sks) {
        return (hitungIpk() * sks)/sks;
    }
}