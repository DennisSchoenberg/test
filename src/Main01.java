import java.util.Scanner;

public class Main01 {

// забыл написать коментарий

    public static String newDayName(int number) {
        String dayName;
        switch (number) {
            case 1:
                dayName = "Понедельник день тяжёлый";
                break;
            case 2:
                dayName = "Вторник вообще атаз";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Недопустимый день недели";
                break;
        }
        return dayName;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите номер дня недели (от 1 до 7):");
            number = scanner.nextInt();

            if (number >= 1 && number <= 7) {
                String dayName = newDayName(number);
                System.out.println(dayName);
            } else {
                System.out.print("Некорректный ввод.");
                System.out.println("попробуёте ещё раз");
            }
        } while (number < 1 || number > 7);
    }
}
