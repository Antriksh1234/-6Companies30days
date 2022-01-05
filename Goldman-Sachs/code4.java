//Question 4- https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

public class code4 {
    String encode(String str)
	{
	    if (str.contentEquals("")) {
	        return str;
	    }
	    
        String result = "";
        result += str.charAt(0);
        int repeat = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                repeat++;
            } else {
                result += repeat + "" + str.charAt(i);
                repeat = 1;
            }
        }
        
        result += repeat;
        
        return result;
	}
	
}