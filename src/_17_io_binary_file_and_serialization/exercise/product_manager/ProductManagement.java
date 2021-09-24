package _17_io_binary_file_and_serialization.exercise.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input price: ");
        double price = Double.parseDouble((scanner.nextLine()));
        System.out.println("input brand: ");
        String brand = scanner.nextLine();
        System.out.println("input describe: ");
        String describe = scanner.nextLine();
        List<Product> list = new ArrayList<>();
        Product product = new Product(id, name, price, brand, describe);
        list.add(product);
        writeToFile("src/_17_io_binary_file_and_serialization/exercise/product_manager/product.dat",
                list);
    }

    public void showProduct() {
        List<Product> listProduct = readDataFromFile("src/_17_io_binary_file_and_serialization/exercise/product_manager/product.dat");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public static void searchProducts() {
        List<Product> list = readDataFromFile("src/_17_io_binary_file_and_serialization/exercise/product_manager/product.dat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name you wanna search: ");
        String searchName = scanner.nextLine();
        for (Product product : list) {
            if (product.getName().contains(searchName)) {
                System.out.println(product.toString());
            }
        }
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
