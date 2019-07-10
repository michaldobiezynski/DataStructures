

public class Earth {

    public static void main(String args[]) {

        Human tom;
        tom = new Human();
        tom.age =5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";

        tom.speak();

        Human Joe;
        Joe = new Human();
        Joe.name = "Joe Goldenberg";
        Joe.eyeColor = "green";
        Joe.heightInInches = 80;
        Joe.age = 6;

        Joe.speak();

    }

}
