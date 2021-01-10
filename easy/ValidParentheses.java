//Problem URL: https://leetcode.com/problems/valid-parentheses/
class ValidParentheses {
    
    static ArrayList<String> open = new ArrayList<String>(){{
        add("(");
        add("[");
        add("{");
    }};

    static ArrayList<String> close = new ArrayList<String>(){{
        add(")");
        add("]");
        add("}");
    }};
    
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        for(int i =0;i<s.length();i++){
            String element = ""+s.charAt(i);
            if(open.contains(element)){
                stack.push(""+s.charAt(i));
            }
            if(close.contains(element)){
                if(stack.empty()){
                    return false;
                }
                int index = close.indexOf(element);
                String pair = open.get(index);
                if(pair.equals(""+stack.peek())){
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}