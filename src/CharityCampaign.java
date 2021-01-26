import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int gorfeti = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double price = (cakes * 45.0 + gorfeti * 5.80 + pancakes * 3.20) * chefs * days;
        double finalPrice = price - (price / 8);
        System.out.printf("%.2f",finalPrice);
    }
}
