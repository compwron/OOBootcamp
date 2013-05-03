import java.util.ArrayList;

public class Collections {
    private final ArrayList<Integer> data;

    public Collections(ArrayList<Integer> data) throws InvalidCollectionsOperation {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation();
        }
        this.data = data;
    }

    public int getMinimum(ArrayList<Integer> data) {
        Integer currentSmallest = data.get(0);
        for(Integer integer : data){
            if (integer < currentSmallest){
                currentSmallest = integer;
            }
        }
        return currentSmallest;
    }
}
