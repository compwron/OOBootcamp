import java.util.ArrayList;

public class StringCollection {

    private final ArrayList<String> stringData;

    public StringCollection(ArrayList<String> data) throws InvalidCollectionsOperation {
        if(data.size() == 0){
            throw new InvalidCollectionsOperation();
        }
        this.stringData = data;
    }

    public String getAlphabeticalOperationResult(CollectionsOperation operation) {
        String mostOperationallyCorrect = stringData.get(0);
        for(String current : stringData){
            if (operation.isTrue(Character.getNumericValue(current.charAt(0)), Character.getNumericValue(mostOperationallyCorrect.charAt(0)))){
                mostOperationallyCorrect = current;
            }
        }
        return mostOperationallyCorrect;
    }

    public String getSizeOperationResult(CollectionsOperation operation) {
        String mostOperationallyCorrectString = stringData.get(0);
        for(String current : stringData){
            if (operation.isTrue(current.length(), mostOperationallyCorrectString.length())){
                mostOperationallyCorrectString = current;
            }
        }
        return mostOperationallyCorrectString;
    }
}
