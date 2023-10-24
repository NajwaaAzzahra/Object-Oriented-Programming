public class Windows extends Laptop{

    public String fitur;

    public Windows () {

    }

    public Windows (String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }
    
    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t: "+ fitur);
    }
}