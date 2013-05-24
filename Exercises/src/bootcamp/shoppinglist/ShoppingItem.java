package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;

public class ShoppingItem {
    private Measurement measurement;
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

    public boolean isType(ShoppingItem shoppingItem) {
        return isType(shoppingItem.getType());
    }

    public String getType() {
        return type;
    }

    public void add(Measurement other) {
        measurement = measurement.add(other); // strange because it doesn't keep object identity.
    }
//    shopping list
//    - shopping item
//    - - type: bananas, milk
//    - - Measurement:
//    - - - count 1.0, cups/gallons


}
