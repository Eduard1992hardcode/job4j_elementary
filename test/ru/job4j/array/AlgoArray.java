package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp;  /*записываем в ячейку с индексом 3 значение временной переменной. */

        for (int index = 0; index < array.length; index++) {
            if (array[index] > array[index + 1]) {
                temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
            }
            System.out.println(array[index]);
        }
    }
}
