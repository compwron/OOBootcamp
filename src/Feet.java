public class Feet extends Measurement{
    public Feet(Double count) {
        this.count = count;
        equivalentIn.put(Inches.class, 12.0);
    }

    public Feet() {
       new Feet(0.0);
    }

    public boolean canBeTranslatedTo(Measurement measurement) {
        return measurement.getClass().equals(new Inches().getClass());
    }

    public Measurement translateTo(Measurement measurement) {
        if(canBeTranslatedTo(measurement)){
            Double equivalentCount = equivalentCountIn(measurement);
            measurement.setCount(equivalentCount);
            return measurement;
        }
        return null;
    }
}
