public class Inches extends Measurement{

    public Inches(){
        setCount(0.0);
        addEquivalent(new Feet(), 0.83333333333);
    }

    public boolean canBeTranslatedTo(Measurement measurement) {
        return measurement.getClass().equals(new Feet().getClass());
    }
}
