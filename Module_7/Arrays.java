package Module_7;

public class Arrays {

    int[] digitArray = new int[10];
    int sum;
    int min;
    int maxpos;
    Integer maxneg;
    double multip = 1;
    double modulus;
    int secondLargNum;
    int largest;


    public void result() {
        for (int i = 0; i < digitArray.length; i++) {
            sum += digitArray[i];
        }
        System.out.println("Сумма всех элементов массива составляет: " + sum);
    }

    public void resultmin() {
        min = digitArray[0];
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] < min) {
                min = digitArray[i];
            }
        }
        System.out.println("Минимальное значение массива составляет: " + min);
    }

    public void resultmax() {
        int max = digitArray[0];
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] > max) {
                max = digitArray[i];
            }
        }
        System.out.println("Максимальное значение массива составляет: " + max);
    }

    public void resultmaxpos() {
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] > maxpos) {
                maxpos = digitArray[i];
            }
        }
        if (maxpos > 0) {
            System.out.println("Максимальное положительное значение массива составляет: " + maxpos);
        }
        if (maxpos <= 0) {
            System.out.println("В массиве положительные значения отсутствуют.");
        }
    }

    public void resultmaxneg() {
        maxneg = null;

        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] < 0 && (maxneg == null || digitArray[i] > maxneg)) {
                maxneg = digitArray[i];
            }
        }
        if (maxneg == null) {
            System.out.println("Отрицательных чисел в массиве нет");
        } else {
            System.out.println("Максимальное отрицательное значение массива составляет: " + maxneg);
        }
    }

    public void resultmultip() {
        for (int i = 0; i < digitArray.length; i++) {
            multip *= digitArray[i];
        }
        System.out.println("Значение перемножения элементов массива составляет: " + multip);
    }

    public void resultmod() {
        if (digitArray[digitArray.length - 1] != 0) {
            modulus = digitArray[0] % (digitArray[digitArray.length - 1]);
            System.out.println("Остаток от деления первого на последний элемент массива составляет: " + modulus);
        } else {
            System.out.println("Вычисление невозможно. Деление на НОЛЬ запрещено!");
        }
    }

    public void secondLargNum() {
        secondLargNum = digitArray[0];
        largest = digitArray[0];

        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] > largest) {
                secondLargNum = largest;
                largest = digitArray[i];
            } else if (secondLargNum < digitArray[i]) {
                secondLargNum = digitArray[i];
            }
        }
        System.out.println("Второй самый большой элемент массива составляет: " + secondLargNum);
    }

    public void reverse() {

        for (int i = 0; i < digitArray.length / 2; i++) {
            int temp = digitArray[i];
            digitArray[i] = digitArray[digitArray.length - 1 - i];
            digitArray[digitArray.length - 1 - i] = temp;
        }
        System.out.println("Инвертированный массив: "+ java.util.Arrays.toString(digitArray));
    }

    public void findEvenElements() {
        System.out.println("Массив четных чисел:");
        int[] evenArray = new int[digitArray.length];
        for (int i = 0, j = 0; i < digitArray.length; i++, j++) {
            if (digitArray[i] % 2 == 0) {
                evenArray[j] = digitArray[i];
                if (evenArray[j] !=0){
                    System.out.print(evenArray[j]+"; ");
                }
            }
        }
    }
}
