import java.util.TreeSet;

public class Collection {


    private TreeSet<Integer> data = new TreeSet<Integer>();
    private TreeSet<String> stringData = new TreeSet<String>();

    public Collection(Integer... data) {
        this.data = order(data);
    }

    public Collection(String... stringData) {
        this.stringData = order(stringData);
    }

    private TreeSet<String> order(String[] data) {
        TreeSet<String> sortedData = new TreeSet<String>();
        for (String datum : data) {
            sortedData.add(datum);
        }
        return sortedData;
    }

    private TreeSet<Integer> order(Integer[] data) {
        TreeSet<Integer> sortedData = new TreeSet<Integer>();
        for (Integer datum : data) {
            sortedData.add(datum);
        }
        return sortedData;
    }

    public int min() {
        return data.first();
    }

    public int max() {
        return data.last();
    }

    public String stringMin() {
        return stringData.first();
    }

    public String stringMax() {
        return stringData.last();
    }


    public int getLargestUnder(int threshold) {
//        if (data.contains(threshold)){
//            data.
//        }

        int largestUnderThreshhold = 0;
        for (int number : data) {
            if (number < threshold) {
                if (number > largestUnderThreshhold) {
                    largestUnderThreshhold = number;
                }
            }
        }
//        what happens when none is found? Throw?
        return largestUnderThreshhold;
    }
}