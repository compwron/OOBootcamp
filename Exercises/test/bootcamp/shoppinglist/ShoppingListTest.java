package bootcamp.shoppinglist;

import bootcamp.unittranslation.MeasurementType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShoppingListTest {

//    mock the oneBanana once it has behavior for cups of sugar vs vinegar.
    ShoppingItem oneBanana;
    String bananas = "banannas";
    int bananaCount = 1;

    ShoppingItem oneCupOfSugar;

    @Before
    public void setUp(){
        oneBanana = mock(ShoppingItem.class);
        when(oneBanana.getUnits()).thenReturn(bananas);
        when(oneBanana.getCount()).thenReturn(bananaCount);

        oneCupOfSugar = new ShoppingItem(1, new UnitOfMeasurement("sugar", MeasurementType.Cups));
    }

    @Test
    public void shouldAddUnitCountsForLikeItems(){
        ShoppingList shoppingList = new ShoppingList(oneCupOfSugar);
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInList() {
        ShoppingList shoppingList = new ShoppingList(oneBanana);
        assertThat(shoppingList.countOf(bananas), is(bananaCount));
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
