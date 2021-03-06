package PopularSearchingAlgorithms.Recursion;

public class App {

    public static void main(String[] args) {

        //reduceByOne(10);

        //array to be used in testing recursive linear search
        int a[] = {1,3,5,7,9,1,2,8,99};

        //recursiveLinearSearch(a,0,2);

        //test recursive binary search
        int testSearch[]  = {1,2,3,4,7,9,12,18};

        System.out.println
                (recursiveBinarySearch(testSearch,0,testSearch.length,4));
    }

    public static int recursiveBinarySearch(int [] a, int p, int r, int x) {
    System.out.println("[ " +p + " ...." + r + " ]");
        if(p>r){

            return -1;

        } else {

            int q = (p+r)/2;

            if(a[q] == x){
                return q;
            } else if(a[q] > x) {
                return recursiveBinarySearch(a, p, q-1,  x);
            } else {
                return recursiveBinarySearch(a, q+1, r,  x);
            }
        }

    }

    public static void reduceByOne(int n) {
        if(n >= 0) {
            reduceByOne(n-1);
        }

        System.out.println("Completed Call: " + n);

    }

    public static int recursiveLinearSearch(int [] a, int i, int x) {

        if(i > a.length -1) {
            System.out.println(-1);
            return -1;
        }
        else if(a[i] == x) {
            System.out.println(i);
            return i;
        }
        else {
            System.out.println("index at: " + i);
            recursiveLinearSearch(a,i+1,x);
        }

        return -1;
    }


}


