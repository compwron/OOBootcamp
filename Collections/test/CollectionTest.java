import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CollectionTest {

    @Test
    public void shouldSee5AsLargestNumberInListWhichIsNotLargerThan6() throws InvalidCollectionsOperation {
        Collection collection = new Collection(new Integer[]{3, 3, 5, 6, 8});
        assertThat(collection.getLargestUnder(6), is(5));
    }

    @Test
    public void shouldFindMaximumOfCollectionWhenCollectionhasMoreThanOneItem() throws InvalidCollectionsOperation {
        Collection collection = new Collection(new Integer[]{1, 2, 3});
        assertEquals(3, collection.getOperationResult(CollectionsOperation.Maximum));
    }

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong() throws InvalidCollectionsOperation {
        Collection collection = new Collection(new Integer[]{1});
        collection.getOperationResult(CollectionsOperation.Minimum);
    }

    @Test
    public void shouldReturnLowestIntegerInMultiIntegerCollectionWhenAskedMin() throws InvalidCollectionsOperation {
        Collection collection = new Collection(new Integer[]{2, 3});
        assertEquals(2, collection.getOperationResult(CollectionsOperation.Minimum));
    }

    @Test
    public void shouldReturnLowestIntegerInCollectionIfAskedMinOfCollectionWithTwoEqualSmallestValues() throws InvalidCollectionsOperation {
        Collection collection = new Collection(new Integer[]{3, 2, 2});
        assertEquals(2, collection.getOperationResult(CollectionsOperation.Minimum));
    }
}
