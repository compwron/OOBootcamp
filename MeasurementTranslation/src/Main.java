public class Main {
    public static void main(String[] args) {

        System.out.println("How many inches in 1 foot?");
        Double inchesInFoot = new Feet(1.0).translateTo(new Inches()).getCount();
        System.out.println(inchesInFoot);
    }
}
