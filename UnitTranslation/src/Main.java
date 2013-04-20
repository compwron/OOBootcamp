public class Main {
    public static void main(String[] args) {

        printAllLengthConversions();

        printAllVolumeConversions();

        Volume oneTeaspoon = new Volume(MeasurementType.Teaspoons, 1.0);
        System.out.println("1 Teaspoon in inches is: " + oneTeaspoon.expressedIn(MeasurementType.Inches).getCount());
    }

    private static void printAllVolumeConversions() {
        for(MeasurementType startingVolumeType : MeasurementType.values()){
            for(MeasurementType endingVolumeType : MeasurementType.values()){
                Double countOfStartingInEnding = new Volume(startingVolumeType, 1).expressedIn(endingVolumeType).getCount();
                System.out.println("1 " + startingVolumeType.name() + " in " + endingVolumeType.name() + " is " + countOfStartingInEnding);
            }
        }
    }

    private static void printAllLengthConversions() {
        for(MeasurementType startingLengthType : MeasurementType.values()){
           for(MeasurementType endingLengthType : MeasurementType.values()){
               Double countOfStartingInEnding = new Length(startingLengthType, 1).expressedIn(endingLengthType).getCount();
               System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + countOfStartingInEnding);
           }
       }
    }
}
