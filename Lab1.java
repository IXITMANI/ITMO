//import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        // NUM 1
        int c = 7;
        long z[] = new long[17];
        for (var i = 16; i >= 0; i--) {
            z[i] = c;
            c++;
        }
       //System.out.println(Arrays.toString(z));
        // NUM 2
        double x[] = new double[13];
        double a;
        for (var i = 0; i < 13; i++) {
            a = Math.random();
            x[i] = (a * 20) - 10;
        }
         //System.out.println(Arrays.toString(x));
        // NUM 3
        double z1[][] = new double[9][13];
        var e = Math.E;
        int tmp[] = new int[4];
        tmp[0] = 15;
        tmp[1] = 19;
        tmp[2] = 21;
        tmp[3] = 23;
        boolean fl = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) {
                for (var k = 0; k < 4; k++) {
                    if (z[i] == tmp[k]) {
                        fl = true;
                    }
                }

                if (z[i] == 11) {
                    z1[i][j] = (Math.pow(e, (Math.pow(e, x[j])))) / 0.5;
                } else if (fl) {
                    z1[i][j] = Math.cbrt(Math.pow((2 / 3) * Math.pow(x[j], ((x[j] + 1) / x[j])), Math.tan(x[j])));
                } else {
                    z1[i][j] = Math.tan(Math.cbrt(Math.pow(Math.log(Math.abs(x[j])), (Math.pow(e, x[j]) / (Math.pow(e, x[j]) - 1)))));
                }
                fl = false;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("| %8.2f ", z1[i][j]);
            }
            System.out.println("|");
        }
    }
}