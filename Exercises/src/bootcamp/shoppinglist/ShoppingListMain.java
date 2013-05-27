package bootcamp.shoppinglist;

import bootcamp.unittranslation.MeasurementType;
import bootcamp.unittranslation.Measurement;

public class ShoppingListMain {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), "milk"));
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.Quarts, 1.0), "milk"));
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.None, 1.0), "bananas"));
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.None, 2.0), "bananas"));

        System.out.println(shoppingList.printList());
    }
}
