package bootcamp.unittranslation;

public enum MeasurementType {
    Feet(MeasurementClassification.Length, 1.0 / 12.0),
    Inches(MeasurementClassification.Length, 1.0),  // is base for Length
    Yards(MeasurementClassification.Length, 1.0 / 36.0),
    Teaspoons(MeasurementClassification.Volume, 3.0),
    Tablespoons(MeasurementClassification.Volume, 1.0),  // is base for Volume
    Cups(MeasurementClassification.Volume, 1.0 / 16.0),
    InvalidConversion(MeasurementClassification.Invalid, 1.0),
    Fahrenheit(MeasurementClassification.Temperature, 1.0),
    Celsius(MeasurementClassification.Temperature, 5.0 / 9.0, 32);

    final MeasurementClassification measurementClass;
    public final int additive;
    public final Double toBaseMultiplier;

    MeasurementType(MeasurementClassification measurementClass, Double toBaseMultiplier, int additive) {
        this.measurementClass = measurementClass;
        this.toBaseMultiplier = toBaseMultiplier;
        this.additive = additive;
    }

    MeasurementType(MeasurementClassification measurementClass, Double toBaseMultiplier) {
        this.toBaseMultiplier = toBaseMultiplier;
        this.measurementClass = measurementClass;
        this.additive = 0;
    }

    enum MeasurementClassification {
        Length, Volume, Temperature, Invalid
    }

}
