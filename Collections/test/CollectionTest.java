import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CollectionTest {

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
