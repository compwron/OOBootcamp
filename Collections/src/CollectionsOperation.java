public enum CollectionsOperation {
    Minimum {
        public boolean isTrue(Integer current, Integer currentMostOperativelyCorrect) {
            return current < currentMostOperativelyCorrect;
        }
    }, Maximum {
        public boolean isTrue(Integer current, Integer currentMostOperativelyCorrect) {
            return current > currentMostOperativelyCorrect;
        }
    }, AlphabeticMaximum {
        public boolean isTrue(Integer current, Integer currentMostOperativelyCorrect) {
            return current > currentMostOperativelyCorrect;
        }
    };
    public abstract boolean isTrue(Integer integer, Integer currentMostOperativelyCorrect);
}
