
public class Lingkaran extends BangunDatar{

    private float r;

    public Lingkaran(float r){
        this.r = r;
    }

    @Override
    public float luas(){
        return 3.14f * r * r;
    }

    @Override
    public float keliling(){
        return 3.14f * r * 2;
    }
}