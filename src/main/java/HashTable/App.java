package HashTable;

public class App {

    public static void main(String[] args) {

        HashTable table = new HashTable(19);
        table.insert("Apple");
        table.insert("Hello");
        table.insert("Feeling");
        table.insert("Water");
        table.insert("Africa");
        table.insert("Speed");
        table.insert("Phone");
        table.insert("September");
        table.insert("Michael");
        table.insert("Milk");
        table.insert("Hugs");
        table.insert("Dogs");

//        System.out.println("-------FIND ELEMENTS------");
//        System.out.println(table.find("Apple"));
//        System.out.println(table.find("Zebra"));
//        System.out.println(table.find("Feeling"));
//        System.out.println(table.find("Water"));
//        System.out.println(table.find("Africa"));
//        System.out.println(table.find("Feeling"));

        table.displayTable();

    }

}
