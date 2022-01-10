package Amazon;

public class code8 {
    Long countWays(int m)
    {
        // your code here
        long[] ways = new long[m+1];
        ways[0] = 1;
        for (int i = 1; i <= m; i++) {
            ways[i] = 1;
        }
        
        for (int i = 2; i <= m; i++) {
            ways[i] += ways[i-2];
        }
        
        return ways[m];
    }
}
