package vn.edu.hcmuaf.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String catetory;
    private String image;

    public Product() {

    }
    public Product(int id, String name, double price, String catetory, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.catetory = catetory;
        this.image = image;
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
    public double getPrice() {
        return price;
    }
    public String getCatetory() {
        return catetory;
    }
    public String getImage() {
        return image;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCatetory(String catetory) {
        this.catetory = catetory;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", catetory=" + catetory + '\'' +
                ", image=" + image +
                '}';
    }


}
