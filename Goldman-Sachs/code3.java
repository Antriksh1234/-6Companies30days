//Question 3- https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/

public class code3 {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long prod=1;
       int j=0,ans=0;
       for(int i=0;i<n;i++){
           prod*=a[i];
           while(j<n&&prod>=k){
               prod/=a[j];
               j++;
           }
           ans+=(i-j+1);
       }
       return ans;
    }
}
