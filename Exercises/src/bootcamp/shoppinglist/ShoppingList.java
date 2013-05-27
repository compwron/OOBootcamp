package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;
import bootcamp.unittranslation.MeasurementType;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<ShoppingItem> shoppingItems; // should be a set? hashset?

    public ShoppingList() {
        this.shoppingItems = new ArrayList<ShoppingItem>();
//        could just not have items in the constructor, and always use add, and compact on add. might be easier...
//        use existing measurement stuff. one cup of sugar etc. cup of sugar vs cup of vinegar.
//        "I don't know if I'm going to be able to do this without generics!"
    }

    public void add(ShoppingItem shoppingItem) {
        boolean foundItem = false;
        for (ShoppingItem item : shoppingItems) {
            if (item.isType(shoppingItem)) {
                item.add(shoppingItem.getMeasurement());
                foundItem = true;
            }
        }
        if (!foundItem) {
            this.shoppingItems.add(shoppingItem);
        }
    }

    public Measurement amountOf(String type) {
        for (ShoppingItem item : shoppingItems) {
            if (item.isType(type)) {
                return item.getMeasurement();
            }
        }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public String printList() {
        String list = "Shopping list:\n";
        for (ShoppingItem item : shoppingItems){
            list += measurement(item) + item.getType() + "\n";
        }
        return list;
    }

    private String measurement(ShoppingItem item) {
        if (!item.getMeasurement().getMeasurementType().equals(MeasurementType.None)){
            return item.getMeasurement().toString() + " ";
        }
        return item.getMeasurement().measurementUnitCount() + " ";
    }

//    private ArrayList<ShoppingItem> makeArrayListOf(ShoppingItem[] shoppingItems) {
//        ArrayList<ShoppingItem> stuff = new ArrayList<ShoppingItem>();
//        for (ShoppingItem shoppingItem : shoppingItems){
//            stuff.add(shoppingItem);
//        }
//        return stuff;
//    }
//
//    private ArrayList<ShoppingItem> compact(ArrayList<ShoppingItem> shoppingItems) {
////        if list has another item with the same type, modify current item to equal the sum, and delete that item.
//        ArrayList<ShoppingItem> compactedList = new ArrayList<ShoppingItem>();
//        for(ShoppingItem item : shoppingItems){
//            if (hasSameType(item, shoppingItems)){
//                item.add(firstItemWithSameTypeAs(item, shoppingItems));
//
//                compactedList.addAll(allExcept(item, firstItemWithSameTypeAs(item, shoppingItems), shoppingItems));
//                compact(compactedList);
//            }
//        }
//        return shoppingItems;
//    }
//
//    private Collection<ShoppingItem> allExcept(ShoppingItem original, ShoppingItem toBeDeleted, ArrayList<ShoppingItem> shoppingItems) {
//        ArrayList<ShoppingItem> allExcept = new ArrayList<ShoppingItem>();
//        for (ShoppingItem current : shoppingItems){
//            if(!current.equals(toBeDeleted) && !current.equals(original)){
//                allExcept.add(current);
//            }
//        }
//        return allExcept;
//    }
//
//    private boolean hasSameType(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
//        for (ShoppingItem possibleMatch : shoppingItems){
//            if (!possibleMatch.equals(item)){
//                if (possibleMatch.isSameUnitsAs(item)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private ShoppingItem firstItemWithSameTypeAs(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
//        for (ShoppingItem possiblySame : shoppingItems){
//            if ((!item.equals(possiblySame)) && item.getUnits().equals(possiblySame.getUnits())){
//                return possiblySame;
//            }
//        }
//        return null;
//    }
//
//
//
//    public Measurement amountOf(String shoppingItemName) {
//        for (ShoppingItem item : shoppingItems){
//            if (item.isCombinableWith(shoppingItemName)){
//                return item.getCount();
//            }
//        }
//        return 0;
//    }
//

}
