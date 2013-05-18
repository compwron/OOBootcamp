package bootcamp.bootcamp.shoppinglist;

public class ShoppingList {

    private ShoppingItem[] shoppingItems;

    public ShoppingList(ShoppingItem... shoppingItems) {
        this.shoppingItems = shoppingItems;
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
