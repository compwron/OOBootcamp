public class Main {
    public static void main(String[] args) {

        printAllLengthConversions();

        printAllVolumeConversions();

        Volume oneTeaspoon = new Volume(MeasurementType.Teaspoons, 1.0);
        Volume oneTeaspoonInInches = oneTeaspoon.expressedIn(MeasurementType.Inches);
        System.out.println("\n1 Teaspoon in inches is: " + oneTeaspoonInInches.getCount() + " " + oneTeaspoonInInches.getVolumeType());
    }

    private static void printAllVolumeConversions() {
        for (MeasurementType startingVolumeType : MeasurementType.values()) {
            for (MeasurementType endingVolumeType : MeasurementType.values()) {
                Volume resultingVolume = new Volume(startingVolumeType, 1).expressedIn(endingVolumeType);
                System.out.println("1 " + startingVolumeType.name() + " in " + endingVolumeType.name() + " is " + resultingVolume.getCount() + " " + resultingVolume.getVolumeType());
            }
        }
    }

    private static void printAllLengthConversions() {
        for (MeasurementType startingLengthType : MeasurementType.values()) {
            for (MeasurementType endingLengthType : MeasurementType.values()) {
                Length resultingLength = new Length(startingLengthType, 1).expressedIn(endingLengthType);
                System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + resultingLength.getCount() + " " + resultingLength.getLengthType());
            }
        }
    }
}
