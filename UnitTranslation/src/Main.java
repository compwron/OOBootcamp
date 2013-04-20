public class Main {
    public static void main(String[] args) {

        Volume oneTeaspoon = new Volume(MeasurementType.Teaspoons, 1.0);
        Volume oneTeaspoonInInches = oneTeaspoon.expressedIn(MeasurementType.Inches);
        System.out.println("\n1 Teaspoon in inches is: " + oneTeaspoonInInches.getCount() + " " + oneTeaspoonInInches.getVolumeType());

        Volume oneCupAndTwoTableSpoons = new Volume(MeasurementType.Cups, 1.0).plus(new Volume(MeasurementType.Tablespoons, 2.0));
        System.out.println("One cup and two tablespoons is: " + oneCupAndTwoTableSpoons.toString());

        Volume oneInchAndTwoFeet = new Volume(MeasurementType.Inches, 1.0).plus(new Volume(MeasurementType.Feet, 2.0));
        System.out.print("One inch and two feet is: " + oneInchAndTwoFeet.toString());

        printAllLengthConversions();
        printAllVolumeConversions();
    }

//    rewrite this to only do the Volume ones, since it is not now?
    private static void printAllVolumeConversions() {
        for (MeasurementType startingVolumeType : MeasurementType.values()) {
            for (MeasurementType endingVolumeType : MeasurementType.values()) {
                Volume resultingVolume = new Volume(startingVolumeType, 1).expressedIn(endingVolumeType);
                System.out.println("1 " + startingVolumeType.name() + " in " + endingVolumeType.name() + " is " + resultingVolume.toString());
            }
        }
    }

    private static void printAllLengthConversions() {
        for (MeasurementType startingLengthType : MeasurementType.values()) {
            for (MeasurementType endingLengthType : MeasurementType.values()) {
                Length resultingLength = new Length(startingLengthType, 1).expressedIn(endingLengthType);
                System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + resultingLength.toString());
            }
        }
    }
}
