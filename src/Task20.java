import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число");
        int n = scanner.nextInt();
        if (n % 2 == 0) {

        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }
}
