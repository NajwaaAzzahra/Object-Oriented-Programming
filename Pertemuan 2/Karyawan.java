public class Karyawan {
    public String nama;
    public String id;
    public String gender;
    public String jabatan;
    public int gajiPokok;
    public int gajiTunjangan;
    public int gajiLembur;

    public void tampilKaryawan(){
        System.out.println("===================Data Karyawan PT. Permata Abadi===================");
        System.out.println("Id\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println();
    }    

    public int lihatGaji(){
        int gajiTotal = gajiPokok + gajiTunjangan + gajiLembur;
        System.out.println("=================Data Gaji Karyawan PT. Permata Abadi=================");
        System.out.println("Id\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + gender);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Gaji Pokok\t: " + gajiPokok);
        System.out.println("Gaji Tunjangan\t: " + gajiTunjangan);
        System.out.println("Gaji Lembur\t: " + gajiLembur);
        System.out.println("Gaji Total\t: " + gajiTotal);
        return gajiTotal;
    }
}