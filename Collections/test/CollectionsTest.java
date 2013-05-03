import org.junit.Test;

import java.util.ArrayList;

public class CollectionsTest {

    @Test
    public void shouldReturnIntInCollectionAsMinWhenCollectionIsOneItemLong(){
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
        Collections collection = new Collections(data);
        collection.getMinimum(data);
    }

    @Test(expected=InvalidCollectionsOperation.class)
    public void shouldThrowInvalidCollectionsOperationWhenCollectionIsEmpty(){
        ArrayList<Integer> data = new ArrayList<Integer>();
        Collections collection = new Collections(data);
        collection.getMinimum(data);
    }
}
