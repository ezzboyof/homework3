package homework3.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int num [] = {5, 8, 12, 18, 32, 84, 63, 17, 37};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("Среднее арифметическое чисел равно: " + sum/num.length);
    }
}
