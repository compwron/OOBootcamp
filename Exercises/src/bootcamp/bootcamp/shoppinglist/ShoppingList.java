package bootcamp.bootcamp.shoppinglist;

import java.util.ArrayList;
import java.util.Collection;

public class ShoppingList {

    private ArrayList<ShoppingItem> shoppingItems;

    public ShoppingList(ShoppingItem... shoppingItems) {
        this.shoppingItems = compact(makeArrayListOf(shoppingItems));
    }

    private Collection<ShoppingItem> makeArrayListOf(ShoppingItem[] shoppingItems) {
        ArrayList<ShoppingItem> stuff = new ArrayList<ShoppingItem>();
        for (ShoppingItem shoppingItem : shoppingItems){
            stuff.add(shoppingItem);
        }
        return stuff;
    }

    private ArrayList<ShoppingItem> compact(Collection<ShoppingItem> shoppingItems) {
//        find next item of same type as current item. if found, add and recurse.
        ArrayList<ShoppingItem> compactedShoppingItems = new ArrayList<ShoppingItem>();
        for (ShoppingItem item : shoppingItems){
            if (hasSameType(item, shoppingItems)){
                compactedShoppingItems.add(firstItemWithSameTypeAs(item, shoppingItems));
                compact(compactedShoppingItems);
            } else {
                compactedShoppingItems.add(item);
            }
        }
        return compactedShoppingItems;
    }

    private boolean hasSameType(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
        for (ShoppingItem possiblySame : shoppingItems){
            if (! item.equals(possiblySame) && item.units().equals(possiblySame.units())){
                return true;
            }
        }
        return false;
    }

    private ShoppingItem firstItemWithSameTypeAs(ShoppingItem item, Collection<ShoppingItem> shoppingItems) {
        for (ShoppingItem possiblySame : shoppingItems){
            if (! item.equals(possiblySame) && item.units().equals(possiblySame.units())){
                return possiblySame;
            }
        }
        return null;
    }



    public int countOf(String shoppingItemName) {
        for (ShoppingItem item : shoppingItems){
            if (item.name().equals(shoppingItemName)){
                return item.count;
            }
        }
        return 0;
    }
}
