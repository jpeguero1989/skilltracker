package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdate = new Date();
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String lastDateUpdate()
    {
        return  lastUpdate.toString();
    }

    public void printItems()
    {
        for (MenuItem item: items) {
            System.out.println(item);
        }
    }

    public void printItem(MenuItem itemToPrint)
    {
            int index = items.indexOf(itemToPrint);
            if (index != -1)
            {
                System.out.println(items.get(index));

                    }
            else
            {
                System.out.println("Item does not exist");
            }

            }

    public Boolean addItem(boolean isNew, double price, String description, String category) {
        MenuItem newItem = new MenuItem(isNew, price, description, category);

       return addItem(newItem);
    }

    public Boolean addItem(MenuItem newItem)
    {
        if (this.items.indexOf(newItem) != -1)
        {
            System.out.println("This Item already exist");
            return false;
        }
        items.add(newItem);

        return true;
    }

    public Boolean removeItem(boolean isNew, double price, String description, String category) {
        MenuItem itemToRemove = new MenuItem(isNew,price,description,category);

        return removeItem(itemToRemove);
    }

    public Boolean removeItem(MenuItem item)
    {
        if (items.indexOf(item) == -1)
        {
            System.out.println("Item does not exist");
            return false;
        }

        items.remove(item);

        return true;
    }
}
