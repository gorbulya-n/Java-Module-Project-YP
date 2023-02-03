import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int count = calc.countOfGuest();
        while (true) {
            System.out.println("Введите название товара.");
            String name = scan.nextLine();
            System.out.println("Введите стоимость товара в формате: \"рубли,копейки\" [10,45]");
            if (scan.hasNextDouble()) {
                double cost = scan.nextDouble();
                calc.add(name, cost);
                System.out.println("Хотите ли добавить еще один товар? \n(Если да, напишите любой символ, если нет, напишите \"Завершить\". )");
            } else {
                System.out.println("Введено не корректное значение цены. Повторите ввод.");
            }
            String ans = scan.next();
            if (ans.equalsIgnoreCase("завершить")) {
                calc.costFromOne(count);
                break;
            }
            scan.nextLine();
        }
    }
}