package _12_java_collection_framework.exercise;

import java.util.Scanner;

public class ProductsMain {
    public static void main(String[] args) {
        ProductsManager manager = new ProductsManager();
        Scanner scanner = new Scanner(System.in);
        int choose;
        boolean flag = true;
        while (flag) {
            System.out.println("Menu: " + "\n" +
                    "1. showProduct " + "\n" +
                    "2. addProduct " + "\n" +
                    "3. deleteProduct " + "\n" +
                    "4. editProduct " + "\n" +
                    "5. searchProduct " + "\n" +
                    "6. sortUp " + "\n" +
                    "7. sortDown " + "\n" +
                    "8. Exit");
            System.out.println("Enter choose: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manager.showProducts();
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    manager.deleteProducts();
                    break;
                case 4:
                    manager.editProducts();
                    break;
                case 5:
                    manager.searchProducts();
                    break;
               case 6:
                   manager.sortUp();
                   break;
                case 7:
                    manager.sortDown();
                    break;
                case 8:
                    flag =false;
                    break;
            }
        }
    }
}
