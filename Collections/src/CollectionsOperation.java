public enum CollectionsOperation {
    Minimum {
        public boolean isTrue(Integer integer, Integer currentMostOperativelyCorrect) {
            return integer < currentMostOperativelyCorrect;
        }
    }, Maximum {
        public boolean isTrue(Integer integer, Integer currentMostOperativelyCorrect) {
            return integer > currentMostOperativelyCorrect;
        }
    };
    public abstract boolean isTrue(Integer integer, Integer currentMostOperativelyCorrect);
}
