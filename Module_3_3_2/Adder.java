package Module_3_3_2;

import java.util.Scanner;

/**
 * Created by Andrew on 07.11.2016.
 */
public class Adder extends Arithmetic {

    boolean check(Integer a, Integer b) {
        if (a >= b) {
            return true;
        } else {
            return false;
        }
    }
}


