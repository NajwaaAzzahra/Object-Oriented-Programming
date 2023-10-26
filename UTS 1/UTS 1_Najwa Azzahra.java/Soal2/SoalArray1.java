public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        int totalPenjumlahanElemen = 0; 

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                totalPenjumlahanElemen += arrayInt[i][j];
            }
        }

        System.out.println("Jumlah Total Elemen Array : " + totalPenjumlahanElemen);
    }
}
