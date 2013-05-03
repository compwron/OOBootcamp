import java.util.ArrayList;

public class StringCollection {

    private final ArrayList<String> stringData;

    public StringCollection(ArrayList<String> data) throws InvalidCollectionsOperation {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation();
        }
        this.stringData = data;
    }

    public String getOperationResult(CollectionsOperation operation) {
        String mostOperationallyCorrectString = stringData.get(0);
        for(String current : stringData){
            if (operation.isTrue(current.length(), mostOperationallyCorrectString.length())){
                mostOperationallyCorrectString = current;
            }
        }
        return mostOperationallyCorrectString;
    }
}
