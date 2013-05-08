import java.util.ArrayList;

public class Collection {

    private final ArrayList<Integer> data;
//    Collections.addAll(

    public Collection(ArrayList<Integer> data) throws InvalidCollectionsOperation { // public class MinAndMaxFinder<T extends Comparable<T>> {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation(); // guava ok empty, element not found min
        }
        this.data = data;
    }

    public Object getOperationResult(CollectionsOperation operation) {
        Integer currentMostOperativelyCorrect = data.get(0);
        for(Integer integer : data){
            if (operation.isTrue(integer, currentMostOperativelyCorrect)){
                currentMostOperativelyCorrect = integer;
            }
        }
        return currentMostOperativelyCorrect;
    }
}
