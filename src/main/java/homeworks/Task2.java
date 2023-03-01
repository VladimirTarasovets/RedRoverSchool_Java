package homeworks;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.task1();
    }
        /*
        Задача №1
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление.

Экстра задача
Также вывести остаток от деления и сделать проверку на четность этих переменных.

Экстра задача
Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
         */
    public void task1 () {
        int a = 12;
        int b = 5;

        int sum = a + b;
        int product = a * b;
        int difference = a - b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Сумма a и b: " + sum);
        System.out.println("Умножение a и b: " + product);
        System.out.println("Вычитание a и b: " + difference);
        System.out.println("Деление a и b: " + quotient);
        System.out.println("Остаток от деления a на b: " + remainder);

        if (a % 2 == 0) {
            System.out.println("Первая переменная четная");
        } else {
            System.out.println("Первая переменная нечетная");
        }

        if (b % 2 == 0) {
            System.out.println("Вторая переменная четная");
        } else {
            System.out.println("Вторая переменная нечетная");
        }

        System.out.println("\u263A");
    }
}
