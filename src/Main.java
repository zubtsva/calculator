import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            double num1;
            double result = 0;
            char operator;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            num1 = scan.nextDouble();
            System.out.println("Введите операцию: + - * /");
            operator = scan.next().charAt(0);

                System.out.println("Введите второе число");
                double num2 = scan.nextDouble();
                switch (operator) {
                    case '-':
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case '+':
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Ошибка! На ноль делить нельзя");
                            break;
                        }
                        result = (double) num1 / num2;
                        System.out.println(result);
                        break;
                    default:
                        System.out.println("Неверный оператор. Введите: - либо + либо * либо /");
                }
                    System.out.println("Желаете продолжить? yes/no ");
                    String answer = scanner.nextLine();
                    if (answer.equals("yes")) {
                        System.out.println("Продолжаем!");
                    } else if (answer.equals("no")) {
                        break;
                    }
        }
    }
}





