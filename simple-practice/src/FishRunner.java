import java.util.*;
public class FishRunner {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Create your fish.");
        System.out.print("Name: ");
        String name = console.next();
        System.out.print("Weight: ");
        double weight = console.nextDouble();
        System.out.print("Length: ");
        double length = console.nextDouble();
        System.out.print("Age: ");
        int age = console.nextInt();
        System.out.print("Mouth type (0 = Wide, 1 = Small): ");
        int mouthType = console.nextInt();
        System.out.print("Scale Type(0 = Round, 1 = Pointed, 2 = Skin): ");
        int scaleType = console.nextInt();
        System.out.print("Alive (true/false): ");
        boolean alive = console.nextBoolean();
        Fish fish = new Fish (name, weight, length, age, alive, mouthType,scaleType);
        //fish.TypeofScale(scaleType);
        //fish.TypeofMouth(mouthType);
        System.out.println("Your Fish details: " + fish);
    }
}
