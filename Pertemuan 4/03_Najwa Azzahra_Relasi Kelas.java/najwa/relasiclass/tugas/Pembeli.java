public class Pembeli {

    private String nama;
    private String idMember;

    public Pembeli (){

    }
    
    public Pembeli(String nama, String idMember) {
        this.nama = nama;
        this.idMember = idMember;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public String getNama () {
        return nama;
    }

    public void setIdMember (String idMember) {
        this.idMember = idMember;
    }

    public String getIdMember () {
        return idMember;
    }

    public String info() {
        String info = "";
        System.out.println("=========Member Purnama Luxury Store=========");
        info += "Nama\t\t: " + nama + "\n";
        info += "IdMember\t: " + idMember + "\n";
        return info;
    }
}