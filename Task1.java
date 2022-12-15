package javadz3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Task1 {
    public void taskOne() {
        int array[] = fillArray();
        System.out.println("Исходный массив:");
        printArray(array);
        System.out.println("\n");

        System.out.println("Отсортированный массив:");
        mergeSort(array, array.length);
        printArray(array);


    }

    // метод генерации случайного числа
    public int checkRandom() {
        Random random = new Random();
        int min = -1000;
        int max = 1000;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;

    }

    // метод заполнения массива
    public int[] fillArray() {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int outArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            outArray[i] = checkRandom();
        }
        return outArray;
    }

    // метод печати массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // метод сортировки
    public static void mergeSort(int[] array, int size)

    {
        if (size < 2)
            return; 

        int middle = size / 2;
        int[] left = new int[middle]; 
        int[] right = new int[size - middle]; 

        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, size - middle);

        mergeSort(left, middle);
        mergeSort(right, size - middle);

        merge (array, left, right, middle, size-middle);
    }

    public static void merge(int[] array, int[] left, int[] right, int sizeLeft, int sizeRigth) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < sizeLeft && j < sizeRigth) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < sizeLeft) {
            array[k++] = left[i++];
        }

        while (j < sizeRigth) {
            array[k++] = right[j++];
        }

    }

}