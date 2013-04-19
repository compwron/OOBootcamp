public enum LengthType {
    Feet(){
        public Double toBaseMultiplier() {
            return (1.0/12.0);
        }
},
    Inches(){ // is base, for now
        public Double toBaseMultiplier() {
            return 1.0;
        }
    };

    public abstract Double toBaseMultiplier();
}
