

public class Earth {

    public static void main(String args[]) {

        Human human1 = new Human("Michal",25,75,"Green");
        Human human2 = new Human("Gerard",26,79,"Blue");
        Human human3 = new Human("Wika",24,70,"Blue");
        Human human4 = new Human("Sylwia",26,70,"Green");


        human2.speak();
        human3.speak();
        human4.speak();
        human1.speak();
    }

}
