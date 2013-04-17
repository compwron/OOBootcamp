public class Feet extends Measurement{

    public Feet(Double count) {
        setCount(count);
        addEquivalent(new Inches(), 12.0);
    }

    public Feet() {
       setCount(0.0);
    }


    @Override
    public boolean canBeTranslatedTo(Measurement measurement) {
        return measurement.getClass().equals(new Inches().getClass());
    }
}
