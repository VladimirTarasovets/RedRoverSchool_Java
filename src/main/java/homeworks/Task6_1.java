package homeworks;

public class Task6_1 {
    public static void main(String[] args) {
        Task6_1 task = new Task6_1();
        task.task1();
        task.task2();
        task.task3();
        task.task4();
        task.task5();
        task.task6();
        task.task7();
    }

    public void task1 (){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Сумма всех значений массива: " + sum);
    }
    public void task2 (){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
    }
    public void task3 (){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);
    }
    public void task4 (){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        double average = (double) sum / array.length;
        System.out.println("Среднее арифметическое всех значений массива: " + average);
    }
    public void task5 (){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
    public void task6 (){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println("Максимальное значение массива: " + max);
    }
    public void task7 (){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;

        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }

        System.out.println("Количество элементов в массиве: " + count);
    }
}
