package bootcamp.bootcamp.shoppinglist;

public class ShoppingItem {
    private final String name;
    final int count;

    public ShoppingItem(String itemName, int count) {
        this.name = itemName;
        this.count = count;
    }

    public String name() {
        return name;
    }
}
