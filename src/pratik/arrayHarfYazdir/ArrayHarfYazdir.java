package pratik.arrayHarfYazdir;

public class ArrayHarfYazdir {

    public static void main(String[] args) {

        //7 satır (row) ve 4 sütun (col) çok boyutlu dizi oluşturuyoruz
        String[][] letter = new String[7][4];

        //'B' harfini oluşturacak '*' ve boşlukları diziye atıyoruz
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        //Diziyi yazdırıyoruz
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
