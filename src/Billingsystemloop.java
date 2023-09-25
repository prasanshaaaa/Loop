import java.util.Scanner;

public class Billingsystemloop {
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int item_count = input_scanner.nextInt();
        input_scanner.nextLine();

        double total_cost = 0;

        for (int i = 1; i <= item_count; i++) {
            System.out.print("Enter item name for item : ");
            String item_name = input_scanner.nextLine();
            System.out.print("Enter quantity for: ");
            int item_quantity = input_scanner.nextInt();
            System.out.print("Enter price per item for : ");
            double item_price = input_scanner.nextDouble();

            double total = item_quantity * item_price;
            total_cost += total;

            input_scanner.nextLine();
        }

        double vat = total_cost * 0.13;
        double discount = total_cost * 0.10;
        double final_total_cost = total_cost + vat - discount;


        System.out.println("Final Total Cost: $ " + final_total_cost);

        input_scanner.close();
    }
}
