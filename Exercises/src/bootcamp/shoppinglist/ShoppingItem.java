package bootcamp.shoppinglist;

import lombok.Getter;

public class ShoppingItem {
    @Getter
    private final String units;

//    should have cups of vinegar, cups of sugar


    @Getter
    private int count;

    public ShoppingItem(String itemName, int count) {
        this.units = itemName;
        this.count = count;
    }

    public String toString(){
        return units + " " + count;
    }

    public void add(ShoppingItem shoppingItem) {
        if (units.equals(shoppingItem.units)){
            count += shoppingItem.getCount();
        }
    }

    public boolean isSameUnitsAs(ShoppingItem item) {
        return this.getUnits().equals(item.getUnits());
    }
}
