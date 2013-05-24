package bootcamp.shoppinglist;

import bootcamp.unittranslation.MeasurementType;

public class ShoppingItem {
    private final UnitOfMeasurement unitOfMeasurement;

    public ShoppingItem(int count, UnitOfMeasurement unitOfMeasurement) {
        this.count = count;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public ShoppingItem(String itemName, int count) {
        this.unitOfMeasurement = new UnitOfMeasurement(itemName, MeasurementType.InvalidConversion);
        this.count = count;
    }

    public String getUnits(){
        return unitOfMeasurement.getGroceryType();
    }

//    should have cups of vinegar, cups of sugar


    private int count;

    public int getCount(){
        return count;
    }

    public String toString(){
        return unitOfMeasurement.getGroceryType() + " " + count;
    }

    public void add(ShoppingItem shoppingItem) {
        if (unitOfMeasurement.getGroceryType().equals(shoppingItem.unitOfMeasurement.getGroceryType())){
            count += shoppingItem.getCount();
        }
    }

    public boolean isSameUnitsAs(ShoppingItem item) {
        return this.getUnits().equals(item.getUnits());
    }
}
