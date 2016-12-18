package Module_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Generator {

    Random random = new Random();

    ArrayList<Integer> arrayListInt = new ArrayList<>();
    ArrayList<String> arrayListStr = new ArrayList<>();
    LinkedList<Integer> linkedListInt = new LinkedList<>();
    LinkedList<String> linkedListStr = new LinkedList<>();

    ArrayList<Integer> arrayListInt10K = new ArrayList<>();
    ArrayList<String> arrayListStr10K = new ArrayList<>();
    LinkedList<Integer> linkedListInt10K = new LinkedList<>();
    LinkedList<String> linkedListStr10K = new LinkedList<>();

    String randomStr() {
        StringBuilder sb = new StringBuilder();
        String charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 10; i++) {
            sb.append(charList.charAt(random.nextInt(charList.length())));
        }
        return sb.toString();
    }

    void addRand1000() {
        for (int i = 0; i < 1001; i++) {
            arrayListInt.add(random.nextInt(10000));
            linkedListInt.add(random.nextInt(10000));
        }
    }

    void addRandInt10K() {
        for (int i = 0; i < 10001; i++) {
            arrayListInt10K.add(random.nextInt(10000));
            linkedListInt10K.add(random.nextInt(10000));
        }
    }

    void addRandStr() {
        for (int i = 0; i < 1001; i++) {
            arrayListStr.add(i, randomStr());
            linkedListStr10K.add(i, randomStr());
        }
    }

    void addRandStr10K() {
        for (int i = 0; i < 10001; i++) {
            arrayListStr.add(i, randomStr());
            linkedListStr10K.add(i, randomStr());
        }
    }

    void timeCalcInt() {
        System.out.println("Тестирование команд для списков на 1000 элементов /Integer/:");
        System.out.println();

        long t1 = System.nanoTime();
        arrayListInt.add(arrayListInt.size() / 2, 1550);
        long result1 = System.nanoTime() - t1;
        System.out.println("Время выполнения команды ADD для ArrayList1000: " + result1);

        long t2 = System.nanoTime();
        linkedListInt.add(linkedListInt.size() / 2, 1550);
        long result2 = System.nanoTime() - t2;
        System.out.println("Время выполнения команды ADD для LinkedList1000: " + result2);

        long diff1 = result2 - result1;
        long diff2 = result1 - result2;

        if (result1 < result2) {
            System.out.println("ArrayList быстрее на " + diff1 / 1000 + " мкс");
        }
        if (result1 > result2) {
            System.out.println("LinkedList быстрее на " + diff2 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t3 = System.nanoTime();
        arrayListInt.set(arrayListInt.size() / 2, 1550);
        long result3 = System.nanoTime() - t3;
        System.out.println("Время выполнения команды SET для ArrayList1000: " + result3);

        long t4 = System.nanoTime();
        linkedListInt.set(linkedListInt.size() / 2, 1550);
        long result4 = System.nanoTime() - t4;
        System.out.println("Время выполнения команды SET для LinkedList1000: " + result4);

        long diff3 = result4 - result3;
        long diff4 = result3 - result4;

        if (result3 < result4) {
            System.out.println("ArrayList быстрее на " + diff3 / 1000 + " мкс");
        }
        if (result3 > result4) {
            System.out.println("LinkedList быстрее на " + diff4 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t5 = System.nanoTime();
        arrayListInt.get(arrayListInt.size() / 2);
        long result5 = System.nanoTime() - t5;
        System.out.println("Время выполнения команды GET для ArrayList1000: " + result5);

        long t6 = System.nanoTime();
        linkedListInt.get(linkedListInt.size() / 2);
        long result6 = System.nanoTime() - t6;
        System.out.println("Время выполнения команды GET для LinkedList1000: " + result6);

        long diff5 = result6 - result5;
        long diff6 = result5 - result6;

        if (result5 < result6) {
            System.out.println("ArrayList быстрее на " + diff5 / 1000 + " мкс");
        }
        if (result5 > result6) {
            System.out.println("LinkedList быстрее на " + diff6 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t7 = System.nanoTime();
        arrayListInt.remove(arrayListInt.size() / 2);
        long result7 = System.nanoTime() - t7;
        System.out.println("Время выполнения команды REMOVE для ArrayList1000: " + result7);

        long t8 = System.nanoTime();
        linkedListInt.remove(linkedListInt.size() / 2);
        long result8 = System.nanoTime() - t6;
        System.out.println("Время выполнения команды REMOVE для LinkedList1000: " + result8);

        long diff7 = result8 - result7;
        long diff8 = result7 - result8;

        if (result7 < result8) {
            System.out.println("ArrayList быстрее на " + diff7 / 1000 + " мкс");
        }
        if (result7 > result8) {
            System.out.println("LinkedList быстрее на " + diff8 / 1000 + " мкс");
        }
        System.out.println("================================");
    }

    void timeCalcInt10K() {
        System.out.println("Тестирование команд для списков на 10К элементов /Integer/:");
        System.out.println();

        long t1 = System.nanoTime();
        arrayListInt10K.add(arrayListInt10K.size() / 2, 1550);
        long result1 = System.nanoTime() - t1;
        System.out.println("Время выполнения команды ADD для ArrayList10K: " + result1);

        long t2 = System.nanoTime();
        linkedListInt10K.add(linkedListInt10K.size() / 2, 1550);
        long result2 = System.nanoTime() - t2;
        System.out.println("Время выполнения команды ADD для LinkedList10K: " + result2);

        long diff1 = result2 - result1;
        long diff2 = result1 - result2;

        if (result1 < result2) {
            System.out.println("ArrayList быстрее на " + diff1 / 1000 + " мкс");
        }
        if (result1 > result2) {
            System.out.println("LinkedList быстрее на " + diff2 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t3 = System.nanoTime();
        arrayListInt10K.set(arrayListInt10K.size() / 2, 1550);
        long result3 = System.nanoTime() - t3;
        System.out.println("Время выполнения команды SET для ArrayList10K: " + result3);

        long t4 = System.nanoTime();
        linkedListInt10K.set(linkedListInt10K.size() / 2, 1550);
        long result4 = System.nanoTime() - t4;
        System.out.println("Время выполнения команды SET для LinkedList10K: " + result4);

        long diff3 = result4 - result3;
        long diff4 = result3 - result4;

        if (result3 < result4) {
            System.out.println("ArrayList быстрее на " + diff3 / 1000 + " мкс");
        }
        if (result3 > result4) {
            System.out.println("LinkedList быстрее на " + diff4 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t5 = System.nanoTime();
        arrayListInt10K.get(arrayListInt10K.size() / 2);
        long result5 = System.nanoTime() - t5;
        System.out.println("Время выполнения команды GET для ArrayList10K: " + result5);

        long t6 = System.nanoTime();
        linkedListInt10K.get(linkedListInt10K.size() / 2);
        long result6 = System.nanoTime() - t6;
        System.out.println("Время выполнения команды GET для LinkedList10K: " + result6);

        long diff5 = result6 - result5;
        long diff6 = result5 - result6;

        if (result5 < result6) {
            System.out.println("ArrayList быстрее на " + diff5 / 1000 + " мкс");
        }
        if (result5 > result6) {
            System.out.println("LinkedList быстрее на " + diff6 / 1000 + " мкс");
        }
        System.out.println("================================");

        long t7 = System.nanoTime();
        arrayListInt10K.remove(arrayListInt10K.size() / 2);
        long result7 = System.nanoTime() - t7;
        System.out.println("Время выполнения команды REMOVE для ArrayList10K: " + result7);

        long t8 = System.nanoTime();
        linkedListInt10K.remove(linkedListInt10K.size() / 2);
        long result8 = System.nanoTime() - t6;
        System.out.println("Время выполнения команды REMOVE для LinkedList10K: " + result8);

        long diff7 = result8 - result7;
        long diff8 = result7 - result8;

        if (result7 < result8) {
            System.out.println("ArrayList быстрее на " + diff7 / 1000 + " мкс");
        }
        if (result7 > result8) {
            System.out.println("LinkedList быстрее на " + diff8 / 1000 + " мкс");
        }
        System.out.println("================================");
    }

    void timeCalcStr() {
        System.out.println("Тестирование команд для списков на 1000 элементов /String/:");
        System.out.println();
    }
}

