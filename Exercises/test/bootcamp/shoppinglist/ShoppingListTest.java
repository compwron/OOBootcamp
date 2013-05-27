package bootcamp.shoppinglist;

import bootcamp.unittranslation.Measurement;
import bootcamp.unittranslation.MeasurementType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShoppingListTest {
    private ShoppingList list;
    private String milk = "milk";
    private String appleJuice = "apple juice";
    private String shoppingListHeader = "Shopping list:\n";

    @Before
    public void setUp(){
        list = new ShoppingList();
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInList() {
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Gallons, 1.0)));
    }

    @Test
    public void shoppingListShouldKnowCountOfItemInListWhenThereAreMultipleTypesOfItemsInTheList() {
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 2.0), appleJuice));
        assertThat(list.amountOf(appleJuice), is(new Measurement(MeasurementType.Gallons, 2.0)));
    }

    @Test
    public void shouldAddUnitCountsForLikeItems(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 2.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Gallons, 3.0)));
    }

    @Test
    public void shouldAddUnitCountsForLikeItemsWhenTheyAreInDifferentUnits(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Quarts, 1.0), milk));
        assertThat(list.amountOf(milk), is(new Measurement(MeasurementType.Quarts, 5.0)));
    }

    @Test
    public void shouldPrintShoppingListHeader(){
        assertThat(list.printList(), is(shoppingListHeader));
    }

    @Test
    public void shouldPrintShoppingListWithOneItem(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        assertThat(list.printList(), is(shoppingListHeader + "1.0 Gallons milk\n"));
    }

    @Test
    public void shouldPrintShoppingListWithMultipleItems(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.Gallons, 1.0), milk));
        list.add(new ShoppingItem(new Measurement(MeasurementType.Quarts, 1.0), appleJuice));
        assertThat(list.printList(), is(shoppingListHeader + "1.0 Gallons milk\n1.0 Quarts apple juice\n"));
    }

    @Test
    public void shouldPrintShoppingListWithItemWhichHasNoUnitsOfMeasurement(){
        list.add(new ShoppingItem(new Measurement(MeasurementType.None, 3.0), "bananas"));
        assertThat(list.printList(), is(shoppingListHeader + "3.0 bananas\n"));
    }
}
