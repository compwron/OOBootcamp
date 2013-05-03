import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class CollectionsTest {

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(1);
        Collections collection = new Collections(data);
        collection.getMinimum(data);
    }

    @Test(expected=InvalidCollectionsOperation.class)
    public void shouldThrowInvalidCollectionsOperationWhenCollectionIsEmpty() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        Collections collection = new Collections(data);
        collection.getMinimum(data);
    }

    @Test
    public void shouldReturnLowestIntegerInMultiIntegerCollectionWhenAskedMin() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(2, 3);
        Collections collection = new Collections(data);
        assertEquals(2, collection.getMinimum(data));
    }

    @Test
    public void shouldReturnLowestIntegerInCollectionIfAskedMinOfCollectionWithTwoEqualSmallestValues() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = collectionWithIntegers(3, 2, 2);
        Collections collection = new Collections(data);
        assertEquals(2, collection.getMinimum(data));
    }

    private ArrayList<Integer> collectionWithIntegers(Integer... integers) throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (Integer integer : integers){
            data.add(integer);
        }
        return data;
    }
}
