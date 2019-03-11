import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GenericItem shirt = new GenericItem(1, "shirt", 100.0f, Category.DRESS);
        GenericItem book = new GenericItem(2, "book", 50.5f, Category.PRINT);
        GenericItem apple = new GenericItem(3, "apple", 10.0f, Category.FOOD);
        GenericItem thing = new GenericItem(4, "thing", 0.99f);

        shirt.printAll();
        book.printAll();
        apple.printAll();
        thing.printAll();

//        Date dateOfIncome = new Date(1549756800000L);
        Calendar incCal = new GregorianCalendar(2019, 1, 10);
        Date incDate = incCal.getTime();

        FoodItem milk = new FoodItem(5, "milk", 25.99f, incDate, (short) 30);
        TechnicalItem laptop = new TechnicalItem(6, "laptop", 5000.85f, (short) 180);
        TechnicalItem phone = new TechnicalItem(7, "phone", 2500.15f, (short) 180);


        GenericItem[] items = new GenericItem[3];
        items[0] = milk;
        items[1] = laptop;
        items[2] = phone;

        for (int i = 0; i < items.length; i++) {
            items[i].printAll();
        }

        FoodItem milk2 = new FoodItem(5, "milk2", 25.99f, incDate, (short) 30);
        System.out.println(milk.equals(milk2));

        GenericItem shirt2 = new GenericItem(1, "shirt", 100.0f, Category.DRESS);
        System.out.println(shirt.equals(shirt2));

        GenericItem shirt3 = shirt.clone();
        System.out.println(shirt3.toString());
        System.out.println(shirt.equals(shirt3));

        System.out.println(milk2.toString());

        if (shirt.equals(shirt3)) {
            shirt.analog = shirt3;
        }

        System.out.println(shirt.analog);
    }
}
