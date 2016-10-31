package Module2_2_1;

/**
 * Created by Andrew on 24.10.2016.
 */
public class ArrayData {
    int[] digitArray = new int[10];
    int sum = 0;
    int min = 0;
    int max = 0;
    int maxpos = 0;
    int maxneg = 0;
    double multip = 1;
    double modulus;
    int secondLargNum = digitArray[0];

    public void result() {
        for (int i = 0; i < digitArray.length; i++) {
            sum += digitArray[i];
        }
    }

    public void resultmin() {
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] < min) {
                min = digitArray[i];
            }
        }
    }


    public void resultmax() {
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] > max) {
                max = digitArray[i];
            }
        }
    }

    public void resultmaxpos() {
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] > maxpos & digitArray[i]>0) {
                maxpos = digitArray[i];
            }
        }
    }

    public void resultmaxneg() {
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] < maxneg & digitArray[i]<0) {
                maxneg = digitArray[i];
            }
        }
    }

    public void resultmultip() {
        for (int i = 0; i < digitArray.length; i++) {
                            multip *= digitArray[i];
        }
    }

    public void resultmod() {
                   modulus = digitArray[0]%(digitArray.length);

    }
    public void secondLargNum() {
        for (int i = 0; i < digitArray.length; i++) {
              if (digitArray[i]>secondLargNum & digitArray[i]<max){
                  secondLargNum = digitArray[i];
              }
            }
    }
}