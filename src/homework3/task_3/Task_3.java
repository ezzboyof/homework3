package homework3.task_3;

import java.util.Arrays;

// форматируй код
public class Task_3 {
    public static void main(String[] args) {
                int [] array = {1, 4, 7, 3, 6, 2, 8, 5, 9};

                for (int i = 0; i <array.length ; i++) {
                    if (array[i] % 2 == 1) {
                        array[i] = 0;
                    }
                }
                System.out.println(Arrays.toString(array));
            }
        }

