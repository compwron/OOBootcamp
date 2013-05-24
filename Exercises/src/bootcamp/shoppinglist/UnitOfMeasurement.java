package bootcamp.shoppinglist;

import bootcamp.unittranslation.MeasurementType;

public class UnitOfMeasurement {
    private final MeasurementType measurementType;
    private String groceryType;

    public UnitOfMeasurement(String groceryType, MeasurementType measurementType) {
        this.groceryType = groceryType;
        this.measurementType = measurementType;
    }

    public String getGroceryType() {
        return groceryType;
    }
}
