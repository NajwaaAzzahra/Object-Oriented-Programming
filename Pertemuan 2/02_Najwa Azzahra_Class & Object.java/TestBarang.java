public class TestBarang {
    public static void main(String[] args) {
        Barang1 brg1 = new Barang1();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru Adalah "+brg1.tambahStok(20));
    }
}