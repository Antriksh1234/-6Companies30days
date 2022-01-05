import java.util.*;

// Question 1 - https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
public class code1 {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> list = new ArrayList<>();
        String [] sortedLetters = new String[string_list.length];
        for (int i = 0; i < string_list.length; i++) {
            char [] word = string_list[i].toCharArray();
            Arrays.sort(word);
            sortedLetters[i] = new String(word);
        }
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < string_list.length; i++) {
            String sortedWord = sortedLetters[i];
            if (map.containsKey(sortedWord)) {
                ArrayList<String> l = map.get(sortedWord);
                l.add(string_list[i]);
            } else {
                ArrayList<String> l = new ArrayList<>();
                l.add(string_list[i]);
                map.put(sortedWord, l);
            }
        }
        
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        return list;
    }
}

class Solution {
    
}