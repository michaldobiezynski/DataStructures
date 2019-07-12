package ObjectOrientedProgramming;

public class Earth {

    public static void main(String args[]) {

        ObjectOrientedProgramming.Human human1 = new ObjectOrientedProgramming.Human("Michal",25,75,"Green");
        ObjectOrientedProgramming.Human human2 = new ObjectOrientedProgramming.Human("Gerard",26,79,"Blue");
        ObjectOrientedProgramming.Human human3 = new ObjectOrientedProgramming.Human("Wika",24,70,"Blue");
        ObjectOrientedProgramming.Human human4 = new ObjectOrientedProgramming.Human("Sylwia",26,70,"Green");


        human2.speak();
        human3.speak();
        human4.speak();
        human1.speak();
    }

}
