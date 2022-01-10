package Amazon;
import java.util.*;

public class code5 {
    static ArrayList<ArrayList<String>> displayContacts(int length, 
                                        String contact[], String str)
    {
        // code here
        HashSet<String> set = new HashSet<>();
       for (String ele : contact) {
           set.add(ele);
       }
       contact = new String[set.size()];
       int j = 0;
       for (String ele : set) {
           contact[j++] = ele;
       }
       Arrays.sort(contact);
       ArrayList<ArrayList<String>> result = new ArrayList<>();
       for (int i = 0; i < str.length(); i++) {
           result.add(new ArrayList<>());
       }
       
       for (String cont : contact) {
           for (int i = 0; i < cont.length(); i++) {
               if (i < str.length() && str.charAt(i) == cont.charAt(i)) {
                   result.get(i).add(cont);
               } else {
                   break;
               }
           }
       }
       
       for (int i = 0; i < str.length(); i++) {
           if (result.get(i).size() == 0) {
               result.get(i).add("0");
           }
       }
       
       return result;
    }
}
