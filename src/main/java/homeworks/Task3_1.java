package homeworks;

public class Task3_1 {
    public static void main(String[] args) {
        Task3_1 task = new Task3_1();
        task.task1();
        task.task2();
        task.task3();
    }
        /*
        Задача №1
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор
и вывести следующие строки:
a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a
         */
    public void task1 () {
        int a = 10;
        int b = 5;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
        /*
        Задача №2
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор
и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
         */
    public void task2 () {
        int a = 7;
        int b = 5;

        int sum = a + b;

        if (sum % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
        /*
        Задача №3
Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор
и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
         */
    public void task3 () {
        int num = 37;

        if (num > 10) {
            System.out.println("больше 10");
        }
        if (num < 100) {
            System.out.println("меньше 100");
        }
        if (num / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (num >= 5 && num <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
