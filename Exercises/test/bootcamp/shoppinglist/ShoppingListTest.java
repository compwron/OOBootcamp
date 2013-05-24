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
    String appleJuice = "apple juice";

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
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 1.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 2.0), appleJuice));
        assertThat(list.amountOf(appleJuice), is(new Measurement(MeasurementType.Gallon, 2.0)));
    }

    @Test
    public void shouldAddUnitCountsForLikeItems(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 2.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Gallon, 3.0)));
    }

    @Test
    public void shouldAddUnitCountsForLikeItemsWhenTheyAreInDifferentUnits(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallon, 1.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Quart, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Quart, 5.0)));
    }

//    must print shopping list

}
