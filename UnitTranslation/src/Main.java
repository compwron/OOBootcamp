public class Main {
    public static void main(String[] args) {
        System.out.println("How many inches in 1 foot?");
        Length oneFoot = new Length(LengthType.Feet, 1);
        System.out.println(oneFoot.expressedIn(LengthType.Inches));

        for(LengthType startingLengthType : LengthType.values()){
            for(LengthType endingLengthType : LengthType.values()){
                Double countOfStartingInEnding = new Length(startingLengthType, 1).expressedIn(endingLengthType).getCount();
                System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + countOfStartingInEnding);
            }
        }
    }
}
