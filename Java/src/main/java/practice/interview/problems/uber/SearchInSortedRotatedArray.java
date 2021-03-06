package practice.interview.problems.uber;

/**
 * @author kartik sharma
 * @date 04/10/18
 */
public class SearchInSortedRotatedArray {

    // Search an Element in a Sorted and Rotated Array


    public static void main(String[] args) {

        int[] a = {10, 20, 1, 3, 6, 8};
        int[] x = {1, 2, 3, 4, 6, 7, 9, 20, 10, 8};


        for (int i = 0; i < x.length; i++) {
            binSearch(a, x[i], 0, a.length - 1);
        }

    }

    static void binSearch(int a[], int x, int l, int r) {

        if (l > r){
            System.out.println(x + " not found");
            return;
        }

        int mid = (l + r) / 2;

        if (a[mid] == x)
            System.out.println(x + " found at index " + mid);

        else if (a[l] <= a[mid]) {
            if (a[l] <= x && a[mid] >= x)
                binSearch(a, x, l, mid - 1);
            else
                binSearch(a, x, mid + 1, r);
        } else if (a[mid] <= x && a[r] >= x)
            binSearch(a, x, mid + 1, r);
        else
            binSearch(a, x, l, mid - 1);

    }

}
