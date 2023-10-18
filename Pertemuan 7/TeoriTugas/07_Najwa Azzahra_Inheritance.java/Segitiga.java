public class Segitiga extends BangunDatar{

    //Diasumsikan segitiga siku-siku
    private float alas;
    private float tinggi;

    public Segitiga (float alas, float tinggi) {
        this.tinggi=tinggi;
        this.alas=alas;
    }

    @Override
    public float luas () {
        return alas * tinggi / 2f;
    }

    
    public float sisiMiring () {
        float hipotenusa = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return hipotenusa;
    }

    @Override
    public float keliling () {
        return alas + tinggi + sisiMiring();
    }

}