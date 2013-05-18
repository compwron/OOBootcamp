package bootcamp.collections;


import bootcamp.shapes.Rectangle;

import java.util.TreeSet;

public class Collection {

    private Rectangle[] rectangles = new Rectangle[]{};
    private TreeSet<Integer> data = new TreeSet<Integer>();
    private TreeSet<String> stringData = new TreeSet<String>();

    public Collection(Integer... data) {
        this.data = order(data);
    }

    public Collection(String... strings) {
        this.stringData = order(strings);
    }

    public Collection(Rectangle... rectangles) {
        this.rectangles = rectangles;
    }

    private TreeSet<String> order(String[] strings) {
        TreeSet<String> sortedData = new TreeSet<String>();
        for (String datum : strings) {
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

    public String stringMax() {
        return stringData.last();
    }


    public int getLargestUnder(int champion) {
        int largestUnderThreshhold = 0;
        for (int challenger : data) {
            if (challenger < champion) {
                if (challenger > largestUnderThreshhold) {
                    largestUnderThreshhold = challenger;
                }
            }
        }
//        what happens when none is found? Throw?
        return largestUnderThreshhold;
    }

    public String getLargestUnder(String threshold) {
        String champion = "";
        for (String challenger : stringData){
            if ((challenger.compareTo(champion) > 0) && (challenger.compareTo(threshold) < 0)) {
                champion = challenger;
            }
        }
        return champion == "" ? null : champion;
    }

    public Rectangle rectangleMax() {
        Rectangle champion = new Rectangle();
        for (Rectangle challenger : rectangles){
            if (challenger.getArea() > champion.getArea()){
                champion = challenger;
            }
        }
        return champion;
    }
}
