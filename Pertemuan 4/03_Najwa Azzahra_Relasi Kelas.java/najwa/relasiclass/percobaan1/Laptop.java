import najwa.relasiclass.percobaan1.Processor;

public class Laptop {

    private String merk;
    private Processor proc;

    public Laptop (String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

      public Laptop(){
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public String getMerk () {
        return merk;
    }


     public void setProc (Processor proc) {
        this.proc = proc;
    }

    public String getProc () {
        return proc;
    }


    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
        }
}