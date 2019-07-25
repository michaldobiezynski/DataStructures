package PopularSortingAlgorithms.InsertionSort;

public class App {

    public static void main(String[] args) {

        int [] myArray= new int[] {8,38,53,113,412,97,50,30,3,9};

        insertionSort(myArray);

        for(int i =0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }

    public static int[] insertionSort(int [] a) {


        for(int i =1; i < a.length; i++) {

            int element =a[i]; //contains the data we intend on bringing ovder to the sorted area
            int j = i-1; // last index position of the sorted area

            while(j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }
}
