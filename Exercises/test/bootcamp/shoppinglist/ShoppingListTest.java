package bootcamp.shoppinglist;

import bootcamp.bootcamp.shoppinglist.ShoppingItem;
import bootcamp.bootcamp.shoppinglist.ShoppingList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingListTest {
    @Test
    public void shoppingListShouldContainItemWithCount() {
        ShoppingList shoppingList = new ShoppingList(new ShoppingItem("bananas", 1));
        assertThat(shoppingList.countOf("bananas"), is(1));
    }

    @Test
    public void shouldAddItemToShoppingList() {
    }
}
