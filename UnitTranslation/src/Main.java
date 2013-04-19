public class Main {
    public static void main(String[] args) {
        printAllLengthConversions();
    }

    private static void printAllLengthConversions() {
        for(LengthType startingLengthType : LengthType.values()){
           for(LengthType endingLengthType : LengthType.values()){
               Double countOfStartingInEnding = new Length(startingLengthType, 1).expressedIn(endingLengthType).getCount();
               System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + countOfStartingInEnding);
           }
       }
    }
}
