//import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        // NUM 1
        int c = 7;
        long z[] = new long[17]; // Создаю массив z и целочисленную переменную c
        for (var i = 16; i >= 0; i--) { // Заполняю массив числами от 7 до 23 с конца
            z[i] = c;
            c++;
        }
        //System.out.println(Arrays.toString(z));
        // NUM 2
        double x[] = new double[13];
        double a; // Создаю массив х и дробную переменную а (в которую буду записывать случайно сгенерированное число)
        for (var i = 0; i < 13; i++) {
            a = Math.random(); // Через библиотеку Math генерирую случайное вещественное число от 0 до 1
            x[i] = (a * 20) - 10; // с помощью математики получаю число от -10 до 10
        }
        //System.out.println(Arrays.toString(x));
        // NUM 3
        double z1[][] = new double[9][13];
        var e = Math.E; // записываю число е в переменную, чтобы не писать постоянно Math.E
        int tmp[] = new int[4];
        tmp[0] = 15;
        tmp[1] = 19;
        tmp[2] = 21;
        tmp[3] = 23; // Создаю и заполняю массив для одного из условий
        boolean fl = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) { // начинаю пробегать по матрице
                for (var k = 0; k < 4; k++) { // проверяю элемент на наличие его в массиве tmp
                    if (z[i] == tmp[k]) { // если элемент есть в массиве, то "поднимаю флаг"
                        fl = true;
                    }
                }

                if (z[i] == 11) { // Само заполнение матрицы
                    z1[i][j] = (Math.pow(e, (Math.pow(e, x[j])))) / 0.5;
                } else if (fl) {
                    z1[i][j] = Math.cbrt(Math.pow((2 / 3) * Math.pow(x[j], ((x[j] + 1) / x[j])), Math.tan(x[j])));
                } else {
                    z1[i][j] = Math.tan(Math.cbrt(Math.pow(Math.log(Math.abs(x[j])), (Math.pow(e, x[j]) / (Math.pow(e, x[j]) - 1)))));
                }
                fl = false; // Не забыть "опустить флаг"
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("| %8.2f ", z1[i][j]); //Пробегаю по матрице и красиво вывожу ее(с помощью форматированного вывода)
            }
            System.out.println("|");
        }
    }
}