//Problem URL: https://leetcode.com/problems/generate-parentheses/
class GenerateParentheses {
    
    List<String> result = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        char[] strArr = new char[2 * n]; 
        if(n > 0) 
            getParenthesis(strArr, 0, n, 0, 0); 
        return result;
    } 
    
    public void getParenthesis(char strArr[], int pos, int n, int open_count, int close_count) {
        if(close_count == n)  
        {
            // print the possible combination
            String str = new String(strArr);
            result.add(str);
            return; 
        } 
        else
        { 
            if(open_count > close_count) { 
                strArr[pos] = ')'; 
                getParenthesis(strArr, pos+1, n, open_count, close_count+1); 
            } 
            if(open_count < n) { 
                strArr[pos] = '('; 
                getParenthesis(strArr, pos+1, n, open_count+1, close_count); 
            } 
        } 
    }

} 