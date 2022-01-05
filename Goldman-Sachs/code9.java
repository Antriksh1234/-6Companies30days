import java.util.Stack;

//Question-9- https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1#
public class code9 {
    static String printMinNumberForPattern(String s){
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int num = 1;
        st.push(num);
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if ( c == 'D') {
                st.push( ++num );
            } else{
                while( st.size() > 0 ){
                    ans += st.pop();
                }
                st.push( ++num );
            }
        }
        while( st.size() > 0 ) {
            ans += st.pop();
        }
        return ans;
    }
}
