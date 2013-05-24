package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;
import bootcamp.unittranslation.MeasurementType;

public class ShoppingListPrinter {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 1.0), "milk"));
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.Quart, 1.0), "milk"));
        shoppingList.add(new ShoppingItem(new Measurement(MeasurementType.None, 1.0), "bananas"));

        System.out.println(shoppingList.printList());
    }
}
