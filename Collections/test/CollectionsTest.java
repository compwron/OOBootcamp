import org.junit.Test;

import java.util.ArrayList;

public class CollectionsTest {

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong() throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
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
    public void shouldReturnLowestIntegerInCollectionWhenAskedMin(){

    }

    @Test
    public void shouldReturnLowestIntegerInCollectionIfAskedMinOfCollectionWithTwoEqualSmallestValues(){

    }

    private Collections collectionWithIntegers(Integer... integers) throws InvalidCollectionsOperation {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (Integer integer : integers){
            data.add(integer);
        }
        return new Collections(data);
    }
}
