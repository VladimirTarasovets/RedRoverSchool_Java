package homeworks;

public class Task6_2 {
    public static void main(String[] args) {
        Task6_2 task = new Task6_2();
        task.task1();
        task.task2();
        task.task3();
        task.task4();
    }

    public void task1(){
        String s = "Перестановочный алгоритм быстрого действия";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                result.append("о");
            }
        }
        System.out.println(result);
    }

    public void task2(){
        String s = "Перевыборы выбранного президента";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
    public void task3(){
        String s = "Посмотрите как Рите нравится ритм";
        String subStr = "рит";
        int index = -1;

        while ((index = s.toLowerCase().indexOf(subStr, index + 1)) != -1) System.out.println(index);
    }
    public void task4(){
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (String[] strings : array) {
            boolean containsE = false;
            for (String string : strings) {
                if (string.contains("е")) {
                    containsE = true;
                    break;
                }
            }
            if (!containsE) {
                count++;
            }
        }
        System.out.println(count);
    }
}
