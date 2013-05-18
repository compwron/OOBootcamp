package bootcamp.bootcamp.shoppinglist;

public class ShoppingList {
    private final ShoppingItem shoppingItem;

    public ShoppingList(ShoppingItem shoppingItem) {
        this.shoppingItem = shoppingItem;
    }

    public int countOf(String shoppingItemName) {
        return shoppingItem.count;
    }
}
