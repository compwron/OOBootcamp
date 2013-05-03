import java.util.ArrayList;

public class IntegerCollection {

    private final ArrayList<Integer> data;

    public IntegerCollection(ArrayList<Integer> data) throws InvalidCollectionsOperation {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation();
        }
        this.data = data;
    }

    public int getOperationResult(CollectionsOperation operation) {
        Integer currentMostOperativelyCorrect = data.get(0);
        for(Integer integer : data){
            if (operation.isTrue(integer, currentMostOperativelyCorrect)){
                currentMostOperativelyCorrect = integer;
            }
        }
        return currentMostOperativelyCorrect;
    }
}
