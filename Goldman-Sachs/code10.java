import java.util.PriorityQueue;

public class code10 {
    public static int [] giveTenMax(int [] arr) {
        //Lets just assume it has some 10M entries

        int [] res = new int[10];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int x : arr) {
            minHeap.add(x);
            if (minHeap.size() > 10) {
                minHeap.poll();
            }
        }

        int i = 0;
        while (i < 10) {
            res[i] = minHeap.poll();
            i++;
        }

        return res;
    }
}
