public class code15 {

    //Question 15- https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1
    public boolean canPair(int[] nums, int k) {
        // Code here
        int[] rem = new int[k];
        for(int ele : nums)
            rem[ele%k]++;
        
        if(rem[0] % 2 != 0)
            return false;
        int i=1,j = k-1;
        while(i<j) {
            if(rem[i] != rem[j])
                return false;
            i++;
            j--;
        }
        if(i==j && rem[i]%2 == 1)
            return false;
        return true;
    }
}
