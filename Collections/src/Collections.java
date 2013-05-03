import java.util.ArrayList;

public class Collections {
    private final ArrayList<Integer> data;
    private Integer maximum;

    public Collections(ArrayList<Integer> data) throws InvalidCollectionsOperation {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation();
        }
        this.data = data;
    }

    public int getOperationResult(ArrayList<Integer> data, CollectionsOperation operation) {
        Integer currentMostOperativelyCorrect = data.get(0);
        for(Integer integer : data){
            if (operation.isTrue(integer, currentMostOperativelyCorrect)){
                currentMostOperativelyCorrect = integer;
            }
        }
        return currentMostOperativelyCorrect;
    }
}
