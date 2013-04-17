import java.util.HashMap;

public class Inches extends Measurement{

    public Inches(){
        equivalentIn.put(new Feet(), 0.83333333333);
    }

    private HashMap<Object, Double> equivalentIn(){
        HashMap<Object, Double> equivalentIn = new HashMap<Object, Double>();
        equivalentIn.put(Feet.class, 0.833); // 1/12
        return equivalentIn;
    }

    public boolean canBeTranslatedTo(Measurement measurement) {
        return measurement.getClass().equals(new Feet().getClass());
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
