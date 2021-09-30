package example2;

public class Program {
    public static void main(String[] args) {


       /*
         1  2  3  4
         8  7  6  5
         9  10 11 12
         16 15 14 13
        */
        int counter = 1;
        int[][] x = new int[4][4];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i % 2 == 0) {
                    x[i][j] = counter;
                } else {
                    x[i][3 - j] = counter;
                }
                counter++;
            }
        }
        doPrint(x);
    }

    static void doPrint(int[][] y) {
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.printf("%3d",y[i][j]);
            }
            System.out.println();
        }
    }
}
