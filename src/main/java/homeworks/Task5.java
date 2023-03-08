package homeworks;

public class Task5 {
    public static void main(String[] args) {
        Task5 task = new Task5();
        task.task1();
        task.task2();
        task.task3();
    }

    public void task1 () {
        int n = 10; // количество элементов в первой строке
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void task2 () {
        int n = 10; // количество элементов в первой строке
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // выводим пробелы для форматирования
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(j + " "); // выводим элементы строки
            }
            System.out.println();
        }
    }
    public void task3 () {
        int n = 9; // количество элементов в первой строке
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // выводим пробелы для форматирования
            }
            for (int j = n-i; j >= 0; j--) {
                System.out.print(j + " "); // выводим элементы строки
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j + " "); // выводим элементы строки
            }
            System.out.println();
        }
    }
}
