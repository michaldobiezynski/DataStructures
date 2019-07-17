package ObjectOrientedProgramming;

public class Zoo {

    public static void main(String args[]) {

        ObjectOrientedProgramming.Animal lion = new ObjectOrientedProgramming.Animal(10,"Lion",
                                "300 kg","male",
                                "humans");
        ObjectOrientedProgramming.Animal zebra = new ObjectOrientedProgramming.Animal(8,"Zebra",
                "400 kg","male",
                "grass");
        ObjectOrientedProgramming.Animal frog = new ObjectOrientedProgramming.Animal(16,"Frog",
                "200 grams","male",
                "flies");
        ObjectOrientedProgramming.Animal crocodile = new ObjectOrientedProgramming.Animal(6,"Croc",
                "500","female",
                "humans");

        frog.greeting();
        frog.sleep();
        frog.weightConfession();
        frog.comingOut();

    }
}
