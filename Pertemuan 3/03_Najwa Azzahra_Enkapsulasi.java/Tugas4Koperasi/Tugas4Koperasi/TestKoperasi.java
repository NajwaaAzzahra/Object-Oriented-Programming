package Tugas4Koperasi;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    
    Koperasi donny = new Koperasi("111333444", "Donny", 11000000);
    System.out.println("Nama Anggota\t\t\t: " + donny.getNama());
    System.out.println("Limit Pinjaman\t\t\t: Rp" + donny.getLimitPinjaman());

    //pinjam ditolak
    System.out.print("\nPengajuan Pinjaman\t\t: Rp");
    int pinjam = sc2.nextInt();
    donny.pinjam(pinjam);
    System.out.print("Jumlah pinjaman saat ini\t: Rp" + donny.getJumlahPinjaman());
    
    //pinjam acc
    System.out.print("\n\nPengajuan Pinjaman\t\t: Rp");
    pinjam = sc2.nextInt();
    donny.pinjam(pinjam);
    System.out.println("Jumlah pinjaman saat ini\t: Rp" + donny.getJumlahPinjaman());

    //bayar angsuran 1 ditolak
    System.out.println();
    System.out.print("Membayar Angsuran\t\t: Rp");
    int angsur = sc2.nextInt();
    donny.angsur(angsur);
    System.out.print("Jumlah pinjaman saat ini\t: Rp" + donny.getJumlahPinjaman());

    //bayar angsuran 2 acc
    System.out.println();
    System.out.print("\nMembayar Angsuran\t\t: Rp");
    angsur = sc2.nextInt();
    donny.angsur(angsur);
    System.out.print("Jumlah pinjaman saat ini\t: Rp" + donny.getJumlahPinjaman());
}
}