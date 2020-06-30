package restaurant;

import java.util.Objects;

public class MenuItem {
    private int Id;
    private boolean isNew;
    private double price;
    private String description;
    private String category;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

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

    public boolean getisNew() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

//    public boolean isItemNew()
//    {
//        return isNew;
//    }


}
