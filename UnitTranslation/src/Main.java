public class Main {
    public static void main(String[] args) {

        printAllLengthConversions();

        printAllVolumeConversions();
    }

    private static void printAllVolumeConversions() {
        for(VolumeType startingVolumeType : VolumeType.values()){
            for(VolumeType endingVolumeType : VolumeType.values()){
                Double countOfStartingInEnding = new Volume(startingVolumeType, 1).expressedIn(endingVolumeType).getCount();
                System.out.println("1 " + startingVolumeType.name() + " in " + endingVolumeType.name() + " is " + countOfStartingInEnding);
            }
        }
    }

    private static void printAllLengthConversions() {
        for(LengthType startingLengthType : LengthType.values()){
           for(LengthType endingLengthType : LengthType.values()){
               Double countOfStartingInEnding = new Length(startingLengthType, 1).expressedIn(endingLengthType).getCount();
               System.out.println("1 " + startingLengthType.name() + " in " + endingLengthType.name() + " is " + countOfStartingInEnding);
           }
       }
    }
}
