import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double pr = Double.parseDouble(scanner.nextLine());
        double l = d * w * h * 0.001 * (1 - pr / 100);
        System.out.printf("%.2f",l);
    }
}
