package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;
import bootcamp.unittranslation.MeasurementType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShoppingListTest {
    ShoppingList list;
    String milk = "milk";

    @Before
    public void setUp(){
        list = new ShoppingList();
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInList() {
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Gallon, 1.0)));
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInListWhenThereAreMultipleTypesOfItemsInTheList() {
    }

    @Test
    public void shouldAddUnitCountsForLikeItems(){
    }

    @Test
    public void shouldCompactItemsWithSameKey(){
    }

}
