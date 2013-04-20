public enum MeasurementType {
    Feet(MeasurementClass.Length) {
        public Double toBaseMultiplier() {
            return (1.0 / 12.0);
        }
    },
    Inches(MeasurementClass.Length) { // is base, for now

        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Yard(MeasurementClass.Length) {
        public Double toBaseMultiplier() {
            return 1.0 / 36.0;
        }
    },
    Teaspoons(MeasurementClass.Volume) {
        public Double toBaseMultiplier() {
            return 3.0;
        }
    }, Tablespoons(MeasurementClass.Volume) {
        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Cups(MeasurementClass.Volume) {
        public Double toBaseMultiplier() {
            return 1.0 / 16.0;
        }
    }, InvalidConversion(MeasurementClass.Invalid) {
        public Double toBaseMultiplier() {
            return 1.0; // return the same as what is passed in
        }
    };
    MeasurementClass measurementClass;

    MeasurementType(MeasurementClass measurementClass) {
        this.measurementClass = measurementClass;
    }

    public abstract Double toBaseMultiplier();
}
