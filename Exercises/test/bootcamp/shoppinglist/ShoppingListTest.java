package bootcamp.shoppinglist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingListTest {

//    mock the item once it has behavior for cups of sugar vs vinegar.

    @Test
    public void shoppingListShouldKnowCountOfItemInList() {
        ShoppingList shoppingList = new ShoppingList(new ShoppingItem("bananas", 1));
        assertThat(shoppingList.countOf("bananas"), is(1));
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInListWhenThereAreMultipleTypesOfItemsInTheList() {
        ShoppingList shoppingList = new ShoppingList(new ShoppingItem("bananas", 1), new ShoppingItem("milk", 2));
        assertThat(shoppingList.countOf("milk"), is(2));
    }

    @Test
    public void shouldCompactItemsWithSameKey(){
        ShoppingList shoppingList = new ShoppingList(new ShoppingItem("bananas", 1), new ShoppingItem("bananas", 2));
        assertThat(shoppingList.countOf("bananas"), is(3));
    }

}
