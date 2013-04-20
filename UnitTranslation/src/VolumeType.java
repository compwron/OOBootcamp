public enum VolumeType {
    Teaspoons {
        public double toBaseMultiplier() {
            return 3;
        }
    }, Tablespoons {
        public double toBaseMultiplier() {
            return 1;
        }
    }, Cups {
        public double toBaseMultiplier() {
            return 1.0/16.0;
        }
    };

    public abstract double toBaseMultiplier();
}
