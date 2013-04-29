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
                Measurement oneStartingTypeInEndingType = new Measurement(startingType, 1.0).expressedIn(endingType);
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
                Measurement oneStartingTypeInEndingType = new Measurement(startingType, 1.0).expressedIn(endingType);
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
        Measurement oneInchAndTwoFeet = new Measurement(MeasurementType.Feet, 2.0).plus(new Measurement(MeasurementType.Inches, 1.0));
        System.out.print("\nTwo feet and one inch is: " + oneInchAndTwoFeet.toString());
    }

    private static void printMultiUnitVolumeAddition() {
        Measurement oneCupAndTwoTableSpoons = new Measurement(MeasurementType.Cups, 1.0).plus(new Measurement(MeasurementType.Tablespoons, 2.0));
        System.out.println("\nOne cup and two tablespoons is: " + oneCupAndTwoTableSpoons.toString());
    }

    private static void printInvalidConversion() {
        Measurement oneTeaspoon = new Measurement(MeasurementType.Teaspoons, 1.0);
        Measurement oneTeaspoonInInches = oneTeaspoon.expressedIn(MeasurementType.Inches);
        System.out.println("\nTesting invalid conversion: 1 Teaspoon in inches is: " + oneTeaspoonInInches.getBaseUnitCount() + " " + oneTeaspoonInInches.getMeasurementType());
    }
}
