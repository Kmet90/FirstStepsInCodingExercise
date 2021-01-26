import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());
        double priceRaspberries = priceStrawberry / 2;
        double priceOranges = priceRaspberries - (priceRaspberries * 0.4);
        double priceBananas = priceRaspberries - (priceRaspberries * 0.8);
        double finalPrice = bananas * priceBananas + oranges * priceOranges
                + raspberries * priceRaspberries + strawberries * priceStrawberry;
        System.out.printf("%.2f",finalPrice);
    }
}
