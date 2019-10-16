package homework3.task_5;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        // эту задачу можно решить дойдя только до середины массива, пока не оптимально
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - 1 - i;
        }
        System.out.println(Arrays.toString(array));
// пустая строка не нужа
// пустая строка не нужа
    }
}
