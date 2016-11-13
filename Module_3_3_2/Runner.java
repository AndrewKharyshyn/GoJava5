package Module_3_3_2;

import java.util.Scanner;

/**
 * Created by Andrew on 13.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Arithmetic sum = new Arithmetic();
        Adder check = new Adder();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input number a");
        Integer a = sc.nextInt();
        System.out.println("Please, input number b");
        Integer b = sc.nextInt();

        System.out.println("\n");
        System.out.println(check.check(a,b));
        System.out.println(sum.add(a,b));
    }
}
