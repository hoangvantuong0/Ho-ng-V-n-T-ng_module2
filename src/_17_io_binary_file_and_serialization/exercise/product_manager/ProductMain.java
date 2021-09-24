package _17_io_binary_file_and_serialization.exercise.product_manager;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductManagement manager = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        int choose;
        boolean flag = true;
        System.out.println("Menu: " + "\n" +
                "1. Add Product " + "\n" +
                "2. Show Product " + "\n" +
                "3. Search Product " + "\n" +
                "4. Exit");
        while (flag) {
            System.out.println("Enter choose: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.showProduct();
                    break;
                case 3:
                    manager.searchProducts();
                    break;
                case 4:
                    flag =false;
                    break;
            }
        }
    }
}

