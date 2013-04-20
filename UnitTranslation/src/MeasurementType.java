public enum MeasurementType {
    Feet() {
        public Double toBaseMultiplier() {
            return (1.0 / 12.0);
        }
    },
    Inches() { // is base, for now
        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Yard {
        public Double toBaseMultiplier() {
            return 1.0/36.0;
        }
    },
    Teaspoons {
        public Double toBaseMultiplier() {
            return 3.0;
        }
    }, Tablespoons {
        public Double toBaseMultiplier() {
            return 1.0;
        }
    }, Cups {
        public Double toBaseMultiplier() {
            return 1.0/16.0;
        }
    };

    public abstract Double toBaseMultiplier();
}
