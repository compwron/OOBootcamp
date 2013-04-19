public enum VolumeType {
    Teaspoons {
        public double toBaseMultiplier() {
            return 0;
        }
    }, Tablespoons {
        public double toBaseMultiplier() {
            return 0;
        }
    };

    public abstract double toBaseMultiplier();
}
