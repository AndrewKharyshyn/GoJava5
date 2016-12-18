package Module_7;

import java.util.ArrayList;

public class ArrayToList {

    int[] digitArray = new int[10];
    int sum;
    int min;
    int maxpos;
    Integer maxneg;
    double multip = 1;
    double modulus;
    int secondLargNum;
    int largest;

    public void result(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        System.out.println("Сумма всех элементов списка составляет: " + sum);
    }

    public void resultmin(ArrayList<Integer> arrayList) {
        min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        System.out.println("Минимальное значение списка составляет: " + min);
    }

    public void resultmax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println("Максимальное значение списка составляет: " + max);
    }

    public void resultmaxpos(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maxpos) {
                maxpos = arrayList.get(i);
            }
        }
        if (maxpos > 0) {
            System.out.println("Максимальное положительное значение списка составляет: " + maxpos);
        }
        if (maxpos <= 0) {
            System.out.println("В списке положительные значения отсутствуют.");
        }
    }

    public void resultmaxneg(ArrayList<Integer> arrayList) {
        maxneg = null;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < 0 && (maxneg == null || arrayList.get(i) > maxneg)) {
                maxneg = arrayList.get(i);
            }
        }
        if (maxneg == null) {
            System.out.println("Отрицательных чисел в списке нет");
        } else {
            System.out.println("Максимальное отрицательное значение списка составляет: " + maxneg);
        }
    }

    public void resultmultip(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            multip *= arrayList.get(i);
        }
        System.out.println("Значение перемножения элементов списка составляет: " + multip);
    }

    public void resultmod(ArrayList<Integer> arrayList) {
        if (arrayList.get(arrayList.size() - 1) != 0) {
            modulus = arrayList.get(0) % (arrayList.get(arrayList.size() - 1));
            System.out.println("Остаток от деления первого на последний элемент списка составляет: " + modulus);
        } else {
            System.out.println("Вычисление невозможно. Деление на НОЛЬ запрещено!");
        }
    }

    public void secondLargNum(ArrayList<Integer> arrayList) {
        secondLargNum = arrayList.get(0);
        largest = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > largest) {
                secondLargNum = largest;
                largest = arrayList.get(i);
            } else if (secondLargNum < arrayList.get(i)) {
                secondLargNum = arrayList.get(i);
            }
        }
        System.out.println("Второй самый большой элемент списка составляет: " + secondLargNum);
    }

    public void reverse(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() / 2; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - 1 - i));
            arrayList.set(arrayList.size() - 1 - i, temp);
        }
        System.out.println("Инвертированный список: " + arrayList);
    }

    public void findEvenElements(ArrayList<Integer> arrayList) {
        System.out.print("Список с четными числами: ");
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0 && arrayList.get(i) != 0) {
                evenList.add(arrayList.get(i));
            }
        }
        System.out.print(evenList);
    }
}
