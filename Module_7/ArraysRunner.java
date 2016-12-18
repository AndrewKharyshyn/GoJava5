package Module_7;

import java.util.ArrayList;

public class ArraysRunner {

    public static void main(String[] args) {

        ArrayToList arrays = new ArrayToList();
        arrays.digitArray = new int[]{13, 72, 16, 11, -7, 118, 21, 8, -6, 64};
        ArrayList <Integer>arrayList = new ArrayList<>();

        for (int i = 0; i < arrays.digitArray.length; i++) {
            arrayList.add(arrays.digitArray[i]);
        }

        arrays.result(arrayList);
        arrays.resultmin(arrayList);
        arrays.resultmax(arrayList);
        arrays.resultmaxpos(arrayList);
        arrays.resultmaxneg(arrayList);
        arrays.resultmultip(arrayList);
        arrays.resultmod(arrayList);
        arrays.secondLargNum(arrayList);
        arrays.reverse(arrayList);
        //arrays.findEvenElements(arrayList);


    }
}
