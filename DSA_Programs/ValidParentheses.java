import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            //Just store the opening paranthesis into the stack
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                //Check for the closing parathesis and last paranthesis of satck not same then return flase
                char top = stack.pop();
                if(c == ')' && top != '(' ||
                c == '}' && top != '{' ||
                c == ']' && top != '['){
                    return false;
                }
            }
        }
        //After checking all the paranthesis stack will be empty. If not empty then all paranthesis not closed
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()";
        //String s = "()[]{}";
        //String s = "([])";
        //String s = "(]";
        //String s = "([)]";
        
        ValidParentheses VP = new ValidParentheses();
        System.out.println(VP.isValid(s));
    }
}
