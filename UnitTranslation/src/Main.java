public class Main {
    public static void main(String[] args) {
        System.out.println("How many inches in 1 foot?");
        Length oneFoot = new Length(LengthType.Feet, 1);
        System.out.println(oneFoot.expressedIn(LengthType.Inches));
    }
}
