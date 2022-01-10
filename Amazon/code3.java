package Amazon;
import java.util.*;

public class code3 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        Deque<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[q.peekLast()] <= arr[i]) {
                q.removeLast();
            }
            
            q.add(i);
        }
        
        for (int i = k; i < n; i++) {
            list.add(arr[q.peek()]);
            
            while (!q.isEmpty() && q.peek() <= i-k) {
                q.removeFirst();
            }
            
            while (!q.isEmpty() && arr[q.peekLast()] <= arr[i]) {
                q.removeLast();
            }
            
            q.add(i);
        }
        
        list.add(arr[q.peek()]);
        
        return list;
    }
}
