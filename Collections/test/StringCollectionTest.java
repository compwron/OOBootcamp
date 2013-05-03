import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCollectionTest {
    @Test
    public void shouldFindLargestStringByCharacterCount() throws InvalidCollectionsOperation {
        ArrayList<String> data = collectionWithString("a", "aa", "aaa");
        StringCollection collection = new StringCollection(data);
        assertThat(collection.getOperationResult(CollectionsOperation.Maximum), is("aaa"));
    }

    private ArrayList<String> collectionWithString(String... strings) {
        ArrayList<String> data = new ArrayList<String>();
        for (String string : strings){
            data.add(string);
        }
        return data;
    }
}
