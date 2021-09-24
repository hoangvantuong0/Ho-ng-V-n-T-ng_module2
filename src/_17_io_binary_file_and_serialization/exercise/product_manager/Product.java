package _17_io_binary_file_and_serialization.exercise.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name;
    double price;
    String brand;
    String describe;
    public Product(){

    }
    public Product(int id, String name, double price, String brand, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
