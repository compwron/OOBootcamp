import java.util.TreeSet;

public class Collection {


    private final TreeSet<Integer> data;

    public Collection(Integer[] data) {
        this.data = order(data);
    }

    private TreeSet<Integer> order(Integer[] data) {
        TreeSet<Integer> sortedData = new TreeSet<Integer>();
        for (Integer datum : data){
            sortedData.add(datum);
        }
        return sortedData;
    }

    public int min(){
        return data.first();
    }

    public int max(){
        return data.last();
    }

    public int getLargestUnder(int threshold) {
//        if (data.contains(threshold)){
//            data.
//        }

        int largestUnderThreshhold = 0;
        for (int number : data){
            if (number < threshold){
                if (number > largestUnderThreshhold){
                    largestUnderThreshhold = number;
                }
            }
        }
//        what happens when none is found? Throw?
        return largestUnderThreshhold;
    }
}
