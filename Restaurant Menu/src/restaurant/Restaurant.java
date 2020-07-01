package restaurant;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Restaurant {

    public static void main(String args[]) throws ParseException {
        MenuItem item1 = new MenuItem(true,25.51,"fried chicken1","entry1");
        MenuItem item2 = new MenuItem(true,25.52,"fried chicken2","entry2");
        MenuItem item3 = new MenuItem(true,25.53,"fried chicken3","entry3");
        MenuItem item4 = new MenuItem(false,25.54,"fried chicken4","entry4");
        MenuItem item5 = new MenuItem(true,25.55,"fried chicken5","entry5");
        MenuItem item6 = new MenuItem(true,25.56,"fried chicken6","entry6");
        MenuItem item7 = new MenuItem(true,25.57,"fried chicken7","entry7");
        MenuItem item8 = new MenuItem(true,25.58,"fried chicken8","entry8");
        MenuItem item9 = new MenuItem(true,25.58,"fried chicken8","entry8");

        Menu myMenu = new Menu();

        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);
        myMenu.addItem(item4);
        myMenu.addItem(item5);
        myMenu.addItem(item6);
        myMenu.addItem(item7);
        myMenu.addItem(item8);
        myMenu.addItem(item9);

        myMenu.removeItem(true,25.58,"fried chicken8","entry8");

        myMenu.printItems();
        System.out.println(myMenu.getItems().size());

        myMenu.removeItem(item2);

        System.out.println(myMenu.getItems().size());

        myMenu.printItem(item2);

        myMenu.printItems();
        String sDate1="30/06/2020";
        Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        myMenu.setLastUpdate((date1));
        System.out.println(myMenu.getLastUpdate());
        System.out.println(myMenu.getItems().get(2).getDescription());
        System.out.println(myMenu.getItems().get(2).getisNew());


    }
}
