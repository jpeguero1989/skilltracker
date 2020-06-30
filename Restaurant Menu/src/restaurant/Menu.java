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
        MenuItem itemToPrint = new MenuItem(false,0.00,"","");
        itemToPrint.setId(-1);
        printItem(itemToPrint);
    }

    public void printItem(MenuItem itemToPrint)
    {
        if (itemToPrint.getId() == -1)
        {
            for (MenuItem item: items) {
                System.out.println("Id: " + item.getId() + " Description: " + item.getDescription() +
                " Category: " + item.getCategory() + " Price: " + item.getPrice() +
                " isNew: " + item.getisNew());
            }
        }
        else
        {
            int index = items.indexOf(itemToPrint);
            if (index != -1)
            {
                System.out.println("Id: " + items.get(index).getId() + " Description: " + items.get(index).getDescription() +
                " Category: " + items.get(index).getCategory() + " Price: " + items.get(index).getPrice() +
                " isNew: " + items.get(index).getisNew());
                             }
            else
            {
                System.out.println("Item does not exist");
            }

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

    public Boolean removeItem(int id,boolean isNew, double price, String description, String category) {
        MenuItem itemToRemove = new MenuItem(isNew,price,description,category);
        itemToRemove.setId(id);

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
