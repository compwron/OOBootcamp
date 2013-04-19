public enum VolumeType {
    Teaspoons {
        public double toBaseMultiplier() {
            return 3;
        }
    }, Tablespoons {
        public double toBaseMultiplier() {
            return 1;
        }
    };

    public abstract double toBaseMultiplier();
}
