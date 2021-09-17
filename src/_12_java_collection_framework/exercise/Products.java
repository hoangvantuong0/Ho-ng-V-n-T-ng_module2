package _12_java_collection_framework.exercise;

public class Products {
    private int id;
    private String name;
    private String information;
    private int price;
    public Products(){

    }

    public Products(int id, String name, String information, int price) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.price = price;
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

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", price=" + price +
                '}';
    }
}