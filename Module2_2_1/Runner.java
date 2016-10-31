package Module2_2_1;

/**
 * Created by Andrew on 23.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayData arrayData = new ArrayData();
        arrayData.digitArray = new int[] {5,7,12,-15,2, 10,7,8,-1,-6 };

        arrayData.result();
        System.out.println("Сумма всех элементов массива составляет: " + arrayData.sum);

        arrayData.resultmin();
        System.out.println("Минимальное значение массива составляет: " + arrayData.min);

        arrayData.resultmax();
        System.out.println("Максимальное значение массива составляет: " + arrayData.max);

        arrayData.resultmaxpos();
        System.out.println("Максимальное положительное значение массива составляет: " + arrayData.maxpos);

        arrayData.resultmaxneg();
        System.out.println("Максимальное отрицательное значение массива составляет: " + arrayData.maxneg);

        arrayData.resultmultip();
        System.out.println("Значение перемножения элементов массива составляет: " + arrayData.multip);

        arrayData.resultmod();
        System.out.println("Остаток от деления первого на последний элемент массива составляет: " + arrayData.modulus);

        arrayData.secondLargNum();
        System.out.println("Второй самый большой элемент массива составляет: " + arrayData.secondLargNum);
    }
}