

public class Zoo {

    public static void main(String args[]) {

        Animal lion = new Animal(10,"Lion",
                                "300 kg","male",
                                "humans");
        Animal zebra = new Animal(8,"Zebra",
                "400 kg","male",
                "grass");
        Animal frog = new Animal(16,"Frog",
                "200 grams","male",
                "flies");
        Animal crocodile = new Animal(6,"Croc",
                "500","female",
                "humans");

        frog.greeting();
        frog.sleep();
        frog.weightConfession();
        frog.comingOut();

    }
}
