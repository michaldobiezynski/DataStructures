package PopularSearchingAlgorithms.BinarySearch;

public class App {

    public static void main(String[] args) {

        // test this now
        int testSearch[]  = {1,2,3,4,7,9,12,18};

        System.out.println(binarySearch(testSearch, 91));
    }

    public static int binarySearch(int [] a, int x) {
        int p =0;
        int r =a.length - 1;

        while(p <= r) {
            int q = (p+r)/2;
            if (x < a[q]) r = q - 1;
            else if (x > a[q]) p = q + 1;
            else{
                System.out.print(x + " is at following index: ");
                return q;
            }

        }
        return -1;
    }
}
