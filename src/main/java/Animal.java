

public class Animal {

    int sleepTime;
    String name;
    String weight;
    String gender;
    String favouriteFood;

    public Animal(int sleepTime, String name, String weight,
                  String gender, String favouriteFood) {
        this.sleepTime = sleepTime;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.favouriteFood = favouriteFood;
    }

    public void greeting() {
        System.out.println("Hello my name is " + name);
    }

    public void sleep() {

        System.out.println("I'm sleeping for " + sleepTime);
    }

    public void weightConfession() {

        System.out.println("I weight " + weight + " because I love " +
                            favouriteFood);
    }

    public void comingOut() {
        System.out.println("I am a " + gender);
    }


}
