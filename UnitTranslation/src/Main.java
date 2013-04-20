public class Main {
    public static void main(String[] args) {

        printAllLengthConversions();
        printAllVolumeConversions();

        printInvalidConversion();

        printMultiUnitVolumeAddition();
        printMultiUnitLengthAddition();

    }

    private static void printMultiUnitLengthAddition() {
        Length oneInchAndTwoFeet = new Length(MeasurementType.Feet, 2.0).plus(new Length(MeasurementType.Inches, 1.0));
        System.out.print("\nTwo feet and one inch is: " + oneInchAndTwoFeet.toString());
    }

    private static void printMultiUnitVolumeAddition() {
        Volume oneCupAndTwoTableSpoons = new Volume(MeasurementType.Cups, 1.0).plus(new Volume(MeasurementType.Tablespoons, 2.0));
        System.out.println("\nOne cup and two tablespoons is: " + oneCupAndTwoTableSpoons.toString());
    }

    private static void printInvalidConversion() {
        Volume oneTeaspoon = new Volume(MeasurementType.Teaspoons, 1.0);
        Volume oneTeaspoonInInches = oneTeaspoon.expressedIn(MeasurementType.Inches);
        System.out.println("\nTesting invalid conversion: 1 Teaspoon in inches is: " + oneTeaspoonInInches.getCount() + " " + oneTeaspoonInInches.getVolumeType());
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
