public enum MeasurementType {
    Feet(MeasurementClassification.Length) {
        public Double toBaseMultiplier() {
            return (1.0 / 12.0);
        }
    }, Inches(MeasurementClassification.Length) { // is base for Length

        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Yards(MeasurementClassification.Length) {
        public Double toBaseMultiplier() {
            return 1.0 / 36.0;
        }
    }, Teaspoons(MeasurementClassification.Volume) {
        public Double toBaseMultiplier() {
            return 3.0;
        }
    }, Tablespoons(MeasurementClassification.Volume) { // is base for Volume

        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Cups(MeasurementClassification.Volume) {
        public Double toBaseMultiplier() {
            return 1.0 / 16.0;
        }
    }, InvalidConversion(MeasurementClassification.Invalid) {
        public Double toBaseMultiplier() {
            return 1.0; // return the same as what is passed in
        }
    };
    final MeasurementClassification measurementClass;

    MeasurementType(MeasurementClassification measurementClass) {
        this.measurementClass = measurementClass;
    }

    public abstract Double toBaseMultiplier();
}
