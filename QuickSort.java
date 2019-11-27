/**
 * Example of QuickSort algorithm.
 */
public class QuickSort {

    /* Partition the array using the last element as the pivot. Numbers smaller
    than the pivot are placed to the left, larger numbers are placed to the right. */
    private int partition(int[] myArray, int lowIndex, int highIndex) {

        int pivot = myArray[highIndex];       // create pivot point
        int i = (lowIndex-1);                 // set low index

        for (int j = lowIndex; j < highIndex; j++) {
            if (myArray[j] < pivot) {
                i++;
                // If the current element is smaller than the pivot then swap the values
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
        }
        int temp = myArray[i + 1];
        myArray[i + 1] = myArray[highIndex];
        myArray[highIndex] = temp;

        return i + 1;
    }

    /* Implement QuickSort by using a recursive approach */
    private void sort(int[] numArray, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pIndex = partition(numArray, lowIndex, highIndex);
            sort(numArray, lowIndex, pIndex-1);
            sort(numArray, pIndex + 1, highIndex);
        }
    }

    /* Main: Initialise array, create a new QuickSort
    object and initialise the sorting process. Print
    out the contents of the sorted array */
    public static void main(String[] args) {
        int[] numArray = {10, 7, 8, 9, 1, 5};        

        QuickSort obj = new QuickSort();      
        obj.sort(numArray, 0, numArray.length-1);   

        // Output the contents of the array
        System.out.println("Sorted array...");
        for (int value : numArray) {
            System.out.print(value + " ");
        }
    }
}
