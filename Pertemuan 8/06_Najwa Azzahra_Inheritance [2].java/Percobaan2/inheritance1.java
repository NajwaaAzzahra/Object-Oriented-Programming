public class inheritance1 {

    public static void main(String[] args) {
        
        StaffTetap ST = new StaffTetap ("Budi", "Malang", "Laku-laki",20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap(); 

        System.out.println();
        StaffHarian SH = new StaffHarian ("Indah", "Malang", "Perempuan",27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}