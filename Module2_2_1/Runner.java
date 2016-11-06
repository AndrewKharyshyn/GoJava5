package Module_2_2_1;

/**
 * Created by Andrew on 23.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayData arrayData = new ArrayData();
        arrayData.digitArray = new int[] {13,72,16, 11, -7, 118,21,8,-6, 64};

        arrayData.result();

        arrayData.resultmin();

        arrayData.resultmax();

        arrayData.resultmaxpos();

        arrayData.resultmaxneg();

        arrayData.resultmultip();

        arrayData.resultmod();

        arrayData.secondLargNum();
    }
}