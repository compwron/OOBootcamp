package bootcamp.collections;

import bootcamp.shapes.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CollectionTest {

    @Test
    public void shouldReturnRectangleWithAreaOfThreeAsMinFromCollectionOrRectanglesWithAreasOfThreeAndSix() {
        Collection collection = new Collection(new Rectangle(1, 3), new Rectangle(2, 3));
        assertTrue(collection.rectangleMin().getArea() == 3.0);
    }

    @Test
    public void shouldReturnRectangleWithAreaOfSixAsMaxInListOfRectanglesWithAreasOfSixAndThree() {
        Collection collection = new Collection(new Rectangle(1, 3), new Rectangle(2, 3));
        assertThat(collection.rectangleMax(), is(new Rectangle(2, 3)));
    }

    @Test
    public void shouldReturnNullWhenNoItemUnderThresholdIsInCollection() throws InvalidCollectionsOperation {
        Collection collection = new Collection("Cat", "Apple", "Baz");
        assertNull(collection.getLargestUnder("Apple"));
    }

    @Test
    public void shouldSeeLatestStringInAlphabetWhichIsNotAfterCatAsApple() throws InvalidCollectionsOperation {
        Collection collection = new Collection("Cat", "Apple", "Baz");
        assertThat(collection.getLargestUnder("Cat"), is("Baz"));
    }

    @Test
    public void shouldSee5AsLargestNumberInListWhichIsNotLargerThan6() throws InvalidCollectionsOperation {
        Collection collection = new Collection(3, 3, 5, 6, 8);
        assertThat(collection.getLargestUnder(6), is(5));
    }

    @Test
    public void shouldFindMaximumOfCollectionWhenCollectionHasMoreThanOneItem() throws InvalidCollectionsOperation {
        Collection collection = new Collection(1, 2, 3);
        assertThat(collection.max(), is(3));
    }

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong() throws InvalidCollectionsOperation {
        Collection collection = new Collection(1);
        assertThat(collection.min(), is(1));
    }

    @Test
    public void shouldReturnLowestIntegerInMultiIntegerCollectionWhenAskedMin() throws InvalidCollectionsOperation {
        Collection collection = new Collection(2, 3);
        assertThat(collection.min(), is(2));
    }

    @Test
    public void shouldReturnLowestIntegerInCollectionIfAskedMinOfCollectionWithTwoEqualSmallestValues() throws InvalidCollectionsOperation {
        Collection collection = new Collection(3, 2, 2);
        assertThat(collection.min(), is(2));
    }

    @Test
    public void shouldFindLargestStringByFirstLetterAlphabetization() throws InvalidCollectionsOperation {
        Collection collection = new Collection("a", "b", "c");
        assertThat(collection.stringMax(), is("c"));
    }

    @Test
    public void shouldFindLargestStringByCharacterCount() throws InvalidCollectionsOperation {
        Collection collection = new Collection("a", "aa", "aaa");
        assertThat(collection.stringMax(), is("aaa"));
    }
}
