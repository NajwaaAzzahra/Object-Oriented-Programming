public class MainTugas {

    public static void main(String[] args) {
        Stok s = new Stok();
        s.setBarang("Luminous Bag");
        s.setHarga(670000);

        Pembeli p = new Pembeli();
        p.setNama("Jeanne Sisca");
        p.setIdMember("24517171");

        Cabang c = new Cabang();
        c.setKota("Surabaya");
        c.setAlamat("Mall Tunjungan Plaza");

        Transaksi t = new Transaksi();
        t.setKota(c);
        t.setAlamat(c);
        t.setNama(p);
        t.setIdMember(p);
        t.setBarang(s);
        t.setHarga(s);
        t.setJumlah(1);

        System.out.println(t.infoTransaksi());
        System.out.println("Biaya Total\t: Rp" + t.bayar());
        
    }
}