package bootcamp.bootcamp.shoppinglist;

import java.util.ArrayList;
import java.util.Collection;

public class ShoppingList {

    private ArrayList<ShoppingItem> shoppingItems;

    public ShoppingList(ShoppingItem... shoppingItems) {
        this.shoppingItems = compact(makeArrayListOf(shoppingItems));
    }

    private ArrayList<ShoppingItem> makeArrayListOf(ShoppingItem[] shoppingItems) {
        ArrayList<ShoppingItem> stuff = new ArrayList<ShoppingItem>();
        for (ShoppingItem shoppingItem : shoppingItems){
            stuff.add(shoppingItem);
        }
        return stuff;
    }

    private ArrayList<ShoppingItem> compact(ArrayList<ShoppingItem> shoppingItems) {
//        if list has another item with the same type, modify current item to equal the sum, and delete that item.
        ArrayList<ShoppingItem> compactedList = new ArrayList<ShoppingItem>();
        for(ShoppingItem item : shoppingItems){
            if (hasSameType(item, shoppingItems)){
                item.add(firstItemWithSameTypeAs(item, shoppingItems));

                compactedList.addAll(allExcept(item, firstItemWithSameTypeAs(item, shoppingItems), shoppingItems));
                compact(compactedList);
            }
        }
        return shoppingItems;
    }

    private Collection<ShoppingItem> allExcept(ShoppingItem original, ShoppingItem toBeDeleted, ArrayList<ShoppingItem> shoppingItems) {
        ArrayList<ShoppingItem> allExcept = new ArrayList<ShoppingItem>();
        for (ShoppingItem current : shoppingItems){
            if(!current.equals(toBeDeleted) && !current.equals(original)){
                allExcept.add(current);
            }
        }
        return allExcept;
    }

    private boolean hasSameType(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
        for (ShoppingItem possibleMatch : shoppingItems){
            if (!possibleMatch.equals(item)){
                if (possibleMatch.isSameUnitsAs(item)){
                    return true;
                }
            }
        }
        return false;
    }

    private ShoppingItem firstItemWithSameTypeAs(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
        for (ShoppingItem possiblySame : shoppingItems){
            if ((!item.equals(possiblySame)) && item.getUnits().equals(possiblySame.getUnits())){
                return possiblySame;
            }
        }
        return null;
    }



    public int countOf(String shoppingItemName) {
        for (ShoppingItem item : shoppingItems){
            if (item.getUnits().equals(shoppingItemName)){
                return item.getCount();
            }
        }
        return 0;
    }
}
