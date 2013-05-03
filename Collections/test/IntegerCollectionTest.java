import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class IntegerCollectionTest {



    @Test
    public void shouldFindMaximumOfCollection() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(1, 2, 3);
        IntegerCollection collection = new IntegerCollection(data);
        assertEquals(3, collection.getOperationResult(CollectionsOperation.Maximum));
    }

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(1);
        IntegerCollection collection = new IntegerCollection(data);
        collection.getOperationResult(CollectionsOperation.Minimum);
    }

    @Test(expected=InvalidCollectionsOperation.class)
    public void shouldThrowInvalidCollectionsOperationWhenCollectionIsEmpty() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        new IntegerCollection(data);
    }

    @Test
    public void shouldReturnLowestIntegerInMultiIntegerCollectionWhenAskedMin() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(2, 3);
        IntegerCollection collection = new IntegerCollection(data);
        assertEquals(2, collection.getOperationResult(CollectionsOperation.Minimum));
    }

    @Test
    public void shouldReturnLowestIntegerInCollectionIfAskedMinOfCollectionWithTwoEqualSmallestValues() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(3, 2, 2);
        IntegerCollection collection = new IntegerCollection(data);
        assertEquals(2, collection.getOperationResult(CollectionsOperation.Minimum));
    }

    private ArrayList<Integer> collectionWithIntegers(Integer... integers) throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (Integer integer : integers){
            data.add(integer);
        }
        return data;
    }
}
