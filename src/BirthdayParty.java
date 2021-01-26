import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallMoney = Integer.parseInt(scanner.nextLine());
        double cake = hallMoney * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = hallMoney*1.0 / 3;
        double price = hallMoney + cake + drinks + animator;
        System.out.printf("%.1f",price);
    }
}
