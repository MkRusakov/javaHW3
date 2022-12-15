package javadz3;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;


public class Task2 {
    ArrayList<Integer> numbers = new ArrayList<>();

    // метод, объединяющий
    public void taskTwo() {
        System.out.println("Исходный список");
        numbers = randomNumberList();
        System.out.println(numbers);
        System.out.print("\n");

        System.out.println("Выходной список");
        numbers = delEven();
        System.out.println(numbers);

    }

    // метод генерации случайного числа
    public int checkRandom() {
        Random random = new Random();
        int min = 1;
        int max = 1000;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    // метод запонения ArrayList
    public ArrayList<Integer> randomNumberList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(checkRandom());
        }
        return numbers;
    }

    // Метод удаления четных чисел
    public ArrayList<Integer> delEven() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp % 2 == 0) {
                iterator.remove();
            }
        }
        return numbers;
    }

}