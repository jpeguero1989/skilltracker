package restaurant;

public class MenuItem {
    private boolean isNew;
    private double price;
    private String description;
    private String category;

    public MenuItem(boolean isNew, double price, String description, String category) {
        this.isNew = isNew;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
