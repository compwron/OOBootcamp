package bootcamp.bootcamp.shoppinglist;

public class ShoppingItem {
    private final String name;
    int count;

    public ShoppingItem(String itemName, int count) {
        this.name = itemName;
        this.count = count;
    }

    public String name() {
        return name;
    }

    public String units() {
        return name();
    }

    public String toString(){
        return name + " " + count;
    }

    public void add(ShoppingItem shoppingItem) {
        if (name.equals(shoppingItem.name)){
            count += shoppingItem.count;
        }
    }
}
