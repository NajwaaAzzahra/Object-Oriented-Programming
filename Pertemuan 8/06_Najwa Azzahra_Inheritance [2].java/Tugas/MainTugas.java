public class MainTugas {

    public static void main(String[] args) {

        Windows w = new Windows ("ASUS Vivobook 15X OLED", 5, 8, "Intel Core i5-12500H", "70WHrs, 3S1P, 3-cell Li-ion", "ASUS Intelligent Performance Technology");
        w.tampilWindows();

        System.out.println();
        Pc p = new Pc ("Lenovo PC Legion T7", 4, 32, "Intel Core i9-12900K", "8.3 x 17.7 x 19 inches");
        p.tampilPc();

        System.out.println();
        Mac m = new Mac("MacBook Air M2", 4, 8, "CPU 8 core", "Baterai lithium-polymer 52,6 watt-jam", "Secure Enclave");
        m.tampilMac();
    }
}