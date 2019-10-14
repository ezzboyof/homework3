package homework3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] arrayNumber = {2, 1, 3, 5, 4, 7, 8, 13, 14};
        int[] arrayInt = new int[arrayNumber.length];
        int count = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0) {
                arrayInt[count] = arrayNumber[i];
                count++;
            }
        }

        int[] arrayResult = Arrays.copyOf(arrayInt, count );
        System.out.println(Arrays.toString(arrayResult));
    }
}
