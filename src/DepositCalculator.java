import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumDeposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());
        double sum = sumDeposit + period * ((sumDeposit * procent / 100) / 12);
        System.out.printf("%.2f",sum);
    }
}
