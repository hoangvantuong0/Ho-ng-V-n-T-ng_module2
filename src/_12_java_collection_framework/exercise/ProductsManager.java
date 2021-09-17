package _12_java_collection_framework.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductsManager {
    private static ArrayList<Products> productList = new ArrayList<>();

    static {
        Products products1 = new Products(1, "Book", "good quality", 3000);
        Products products2 = new Products(2, "Pen", "made in VietNam", 2000);
        Products products3 = new Products(3, "Notebook", "made in Korea", 4000);
        productList.add(products1);
        productList.add(products2);
        productList.add(products3);
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input information: ");
        String information = scanner.nextLine();
        System.out.println("input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Products products = new Products(id, name, information, price);
        productList.add(products);
    }

    public static void showProducts() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public static void deleteProducts() {
        showProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID you wanna delete: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idDelete) {
                productList.remove(i);
            }
        }
    }

    public static void editProducts() {
        showProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID you wanna edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Set the id product: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Set the product's name: ");
        String name = scanner.nextLine();
        System.out.println("Set the product's information: ");
        String information = scanner.nextLine();
        System.out.println("Set the product's price: ");
        int price = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idEdit) {
                productList.get(i).setId(id);
                productList.get(i).setName(name);
                productList.get(i).setInformation(information);
                productList.get(i).setPrice(price);
            }
        }
    }

    public static void searchProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name you wanna search: ");
        String searchName = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(searchName)) {
                System.out.println(productList.get(i));
            }
        }
    }

    public static void sortUp() {
        Collections.sort(productList, new ProductsComparatorUp());
    }

    public static void sortDown() {
        Collections.sort(productList, new ProductsComparatorDown());
    }
}