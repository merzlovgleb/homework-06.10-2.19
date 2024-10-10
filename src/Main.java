
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи четырехзначное число");

        int num = scanner.nextInt();

        int a = num % 10;
        int b = (num % 100) / 10;
        int c = (num % 1000) / 100;
        int d = num / 1000;
        int sum = a + b + c + d;
        int umv = a * b * c * d;
        System.out.println("сумма"+sum);
        System.out.println("произведение"+umv);

    }
}