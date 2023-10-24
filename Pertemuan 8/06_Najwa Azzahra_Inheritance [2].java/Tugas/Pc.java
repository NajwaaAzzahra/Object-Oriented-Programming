public class Pc extends Komputer{

    public String ukuranMonitor;

    public Pc () {

    }

    public Pc (String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }

    public void tampilPc () {
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t: " + ukuranMonitor);
    }
}