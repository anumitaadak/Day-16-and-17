package com.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {45, 90, 31, 23, 56, 95};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(array);

        for (int i = 0; i < array.length; i++)
          System.out.println(array[i] + " ");
    }

    void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 2; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}

