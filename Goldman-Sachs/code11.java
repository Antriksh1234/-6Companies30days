//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/.

public class code11 {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int rep = 0;
        int missing = 0;
        for (int i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val-1] < 0) {
                rep = abs_val;
            } else {
                arr[abs_val-1] = -arr[abs_val-1];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i+1;
            }
        }
        
        int [] res = {rep, missing};
        return res;
    }
}
