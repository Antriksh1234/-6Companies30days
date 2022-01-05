//Question 8- https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/.

public class code8 {
    public int CountWays(String str)
    {
        // code here
        if (str.charAt(0) == '0') {
            return 0;
        }
        
        int n = str.length();
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == '0' && str.charAt(i-1) > '2') {
                return 0;
            }
        }
        
        int [] res = new int[n+1];
        res[n] = 1;
        if (str.charAt(n-1) == '0') {
            res[n-1] = 0;
        } else
            res[n-1] = 1;
        
        for (int i = n-2; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                continue;
            }
            int sum = res[i+1];
            if (pairable(str.substring(i, i+2))) {
                sum = (sum + res[i+2]) % 1000000007;
            }
            res[i] = sum;
        }
        
        return res[0];
    }
    
    public boolean pairable(String s) {
        int x = Integer.parseInt(s);
        return !(x > 26);
    }
}
