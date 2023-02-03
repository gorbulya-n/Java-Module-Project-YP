import java.util.Scanner;

public class Calculator {
    double sum = 0;
    String names = "";
    int count;
    Scanner scan = new Scanner(System.in);

    public int countOfGuest() {
        System.out.println("Введите количество человек, которые будут делить счёт:");
        while (true) {
            if (scan.hasNextInt()) {
                count = scan.nextInt();
                if (count <= 1) {
                    System.out.println("Введено отрицательное значение или 1. Повторите ввод.");
                } else {
                    return count;
                }
            } else {
                System.out.println("Введено не корректное значение. Повторите ввод.");
            }
            scan.nextLine();
        }
    }

    public void add(String name, double cost) {
        sum += cost;
        this.names = this.names + name + "\n";
        System.out.println("Товар успешно добавлен.");
    }

    public void costFromOne(int count){
        System.out.println("Добавленные товары: \n" + names );
        sum /= count;
        System.out.println("Каждый человек должен заплатить: \n" + String.format("%.2f", sum) + formOfRuble());
    }

    public String formOfRuble(){
        if ((int)(sum % 100 / 10) == 1){
            return " рублей.";
        }
        switch ((int) (sum % 10)){
            case 1:
                return " рубль.";
            case 2:
            case 3:
            case 4:
                return " рубля.";
            default:
                return " рублей.";
        }
    }
}