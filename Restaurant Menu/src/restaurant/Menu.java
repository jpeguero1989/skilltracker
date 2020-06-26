package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdate = new Date();
    private ArrayList<MenuItem> items;

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
}
