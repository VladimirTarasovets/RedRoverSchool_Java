package homeworks;

public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        task.task1();
        System.out.println();
        task.task2();
        task.task3();
    }

    /*
    Необходимо вывести числа от 0 до 15.
     */
    public void task1 () {
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }
    }
    /*
    Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
     */
    public void task2 () {
        int power = 0;
        int result = 0;
        while (result < 10000) {
            result = (int) Math.pow(5, power);
            if (result < 10000) {
                System.out.println(result);
            }
            power++;
        }
    }

    /*
    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
    Реализовать 2 варианта:
    - использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
    - без использования конструкции if (шаг цикла на ваше усмотрение).
     */
    public void task3 () {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
    }
}
