public class Laptop extends Komputer {

    public String jnsBaterai;

    public Laptop () {

    }

    public Laptop (String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai=jnsBaterai;
    }

    public void tampilLaptop () {
        super.tampilData();
        System.out.println("Jenis Baterai\t\t: " + jnsBaterai);
    }
}