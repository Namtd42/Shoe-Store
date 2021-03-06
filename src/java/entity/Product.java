
package entity;

public class Product {
    private int id;
    private String name;
    private String title;
    private String description;
    private String image;
    private int brandId;
    private int price;

    public Product() {
    }

    public Product(int id, String name, String title, String description, String image, int brandId, int price) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.image = image;
        this.brandId = brandId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
