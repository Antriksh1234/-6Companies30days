package Amazon;
import java.util.*;

public class code7 {
    public String FirstNonRepeating(String A)
    {
        // code here
        String res = "";
        LinkedHashSet<Character> inDLL = new LinkedHashSet<Character>();
        boolean[] repeated = new boolean[256];
          for (int i = 0; i < A.length(); i++) {
            char x = A.charAt(i);
            
            if (!repeated[x]) {
                // If the character is not in DLL, then add
                // this at the end of DLL.
                if (!(inDLL.contains(x))) {
                    inDLL.add(x);
                }
                else {
                    inDLL.remove((Character)x);
                    repeated[x] = true; // Also mark it as repeated
                }
            }
            
            // Print the current first non-repeating
            // character from stream
            if (inDLL.size() != 0) {
                res += inDLL.iterator().next();
            } else {
                res += "#";
            }
          }
        return res;
    }
}
