import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        DaftarGaji dg = new DaftarGaji(5); // Membuat objek DaftarGaji dengan kapasitas 5 pegawai

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data pegawai ke-" + (i + 1));
            System.out.print("NIP: ");
            String nip = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Jumlah SKS (hanya untuk dosen): ");
            int jumlahSKS = sc.nextInt();
            System.out.print("Tarif SKS (hanya untuk dosen): ");
            int tarifSKS = sc.nextInt();
            System.out.println();

            if (jumlahSKS > 0) {
                // Jika jumlahSKS > 0, masukkan sebagai data Dosen
                Dosen dosen = new Dosen(nip, nama, alamat, jumlahSKS, tarifSKS);
                dg.addPegawai(dosen);
            } else {
                // Jika jumlahSKS <= 0, masukkan sebagai data Pegawai biasa
                Pegawai pegawai = new Pegawai(nip, nama, alamat);
                dg.addPegawai(pegawai);
            }
        }

        // Menampilkan semua gaji
        dg.printSemuaGaji();

        scanner.close();
    }
}
