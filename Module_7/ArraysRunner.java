package Module_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysRunner {

    public static void main(String[] args) {

        ArrayToList arrays = new ArrayToList();
        arrays.digitArray = new int[]{13, 72, 16, 11, -7, 118, 21, 8, -6, 64};
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < arrays.digitArray.length; i++) {
            arrayList.add(arrays.digitArray[i]);
        }

        arrays.result();
        arrays.resultmin();
        arrays.resultmax();
        arrays.resultmaxpos();
        arrays.resultmaxneg();
        arrays.resultmultip();
        arrays.resultmod();
        arrays.secondLargNum();
        arrays.reverse();
        arrays.findEvenElements();


    }
}
