public class Main {

    public static void main(String[] args) {

        Penulis p1 = new Penulis();
        p1.setNama("Tere Liye");
        p1.setAlamat("Malang");
        
        Buku b1 = new Buku();
        b1.setISBN("9786238829675");
        b1.setJudul("Tanah Para Bandit");
        b1.setPenulis(p1);
        b1.setHarga(99000);

        System.out.println("============ Informasi Buku ============");
        System.out.println("ISBN\t: "+b1.getISBN());
        System.out.println("Judul\t: "+b1.getJudul());
        System.out.println("Penulis\t: "+b1.getPenulis().getNama());
        System.out.println("Alamat\t: "+b1.getPenulis().getAlamat());
        System.out.println("Harga\t: Rp"+b1.getHarga());
    }
}