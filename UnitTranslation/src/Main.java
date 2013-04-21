import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        printAllLengthConversions();
        printAllVolumeConversions();

        printInvalidConversion();

        printMultiUnitVolumeAddition();
        printMultiUnitLengthAddition();

    }

    private static void printAllVolumeConversions() {
        ArrayList<MeasurementType> volumeMeasurementTypes = measurementTypesOf(MeasurementClassification.Volume);

        for (MeasurementType startingType : volumeMeasurementTypes) {
            for (MeasurementType endingType : volumeMeasurementTypes) {
                Volume oneStartingTypeInEndingType = new Volume(startingType, 1.0).expressedIn(endingType);
                printTranslation(startingType, endingType, oneStartingTypeInEndingType.toString());
            }
        }
    }

    private static void printTranslation(MeasurementType startingType, MeasurementType endingType, String oneStartingTypeInEndingType) {
        System.out.println("1 " + startingType.name() + " in " + endingType.name() + " is " + oneStartingTypeInEndingType.toString());
    }

    private static void printAllLengthConversions() {
        ArrayList<MeasurementType> lengthMeasurementTypes = measurementTypesOf(MeasurementClassification.Length);

        for (MeasurementType startingType : lengthMeasurementTypes) {
            for (MeasurementType endingType : lengthMeasurementTypes) {
                Length oneStartingTypeInEndingType = new Length(startingType, 1.0).expressedIn(endingType);
                printTranslation(startingType, endingType, oneStartingTypeInEndingType.toString());
            }
        }
    }

    private static ArrayList<MeasurementType> measurementTypesOf(MeasurementClassification measurementClassification) {
        ArrayList<MeasurementType> lengthMeasurementTypes = new ArrayList<MeasurementType>();
        for (MeasurementType measurementType : MeasurementType.values()) {
            if (measurementType.measurementClass.equals(measurementClassification)) {
                lengthMeasurementTypes.add(measurementType);
            }
        }
        return lengthMeasurementTypes;
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
        System.out.println("\nTesting invalid conversion: 1 Teaspoon in inches is: " + oneTeaspoonInInches.getCount() + " " + oneTeaspoonInInches.getMeasurementType());
    }
}
