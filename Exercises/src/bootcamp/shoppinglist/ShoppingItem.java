package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;

public class ShoppingItem {
    private final Measurement measurement;
    private final String type;

    public ShoppingItem(Measurement measurement, String type) {
        this.measurement = measurement;
        this.type = type;
    }

    public boolean isType(String type) {
        return this.type.equals(type);
    }

    public Measurement getMeasurement() {
        return measurement;
    }
//    shopping list
//    - shopping item
//    - - type: bananas, milk
//    - - Measurement:
//    - - - count 1.0, cups/gallons



}
