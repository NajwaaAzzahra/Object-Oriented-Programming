public class Cabang {

    private String kota;
    private String alamat;

    public Cabang (){

    }

    public Cabang (String kota, String alamat) {
        this.kota=kota;
        this.alamat=alamat;
    }

    public void setKota (String kota) {
        this.kota = kota;
    }

    public String getKota () {
        return kota;
    }

    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat () {
        return alamat;
    }

    public String info (){
        String info = "";
        System.out.println("=========Cabang Purnama Luxury Store=========");
        info += "Cabang\t: " + kota + "\n";
        info += "Alamat\t: " + alamat + "\n";
        return info;
    }
}