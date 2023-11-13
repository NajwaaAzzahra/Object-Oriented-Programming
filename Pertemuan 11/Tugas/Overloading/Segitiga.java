public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(sisiA * sisiA + sisiB * sisiB);
        return c;
    }

    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga();

        System.out.println("===========Menghitung Sudut dan Keliling Segitiga===========");

        System.out.println("Total sudut segitiga 1\t: " + s1.totalSudut(68));
        System.out.println("Total sudut segitiga 2\t: " + s2.totalSudut(45, 27));

        System.out.println("Keliling segitiga 1\t: "+s1.keliling(7, 9));
        System.out.println("Keliling segitiga 2\t: "+s1.keliling(6, 12, 10));

    }
}
