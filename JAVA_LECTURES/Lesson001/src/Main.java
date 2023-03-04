/* comments
few lines
 */


import java.util.Scanner;

// one-line comment
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Bye world!");

        String my_var = "Hello bunny!";
        String null_var = null;
        System.out.println(null_var);
        System.out.println(my_var);

        short age = 10;
        int salary = 123456;
        System.out.print(age);
        System.out.println(salary);

        float f = 2.45f; // обязателен суффикс f
        double d = 2.45;
        System.out.println(f);
        System.out.println(d);

        char ch = 561; //номер символа (неявное преобразование
        System.out.println(ch);
        char ch_01 = 'ȱ'; // символ в кавычках
        System.out.println(ch_01);

        var i = "123";
        System.out.println(i);
        System.out.println(getType(i));
        var j = Integer.parseInt(i);
        System.out.println(j);
        System.out.println(getType(j));
        var k = Integer.toString(j);
        System.out.println(k);
        System.out.println(getType(k));
        var l = Float.toString(f);
        System.out.println(l);
        System.out.println(getType(l));
        j = j-- - --j;
        System.out.println(j);
        System.out.println("======================");

        int[][] arr = new int[3][5];
        int a = 0;
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                arr[m][n] = a++;
                System.out.print(arr[m][n]);
                System.out.print(' ');
            }
        }
        System.out.println();
        System.out.println("======================");

        Scanner test = new Scanner(System.in);
        System.out.println("name: ");
        String new_name = test.nextLine();
        System.out.printf("Hello, %s\n", new_name);
        test.close();


    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}

