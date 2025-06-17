/******************************************************************************

Remove unbalanced parentheses in a given expression.

Input  : ((abc)((de))
Output : ((abc)(de)) but (abc)((de))  

Input  : (((ab)
Output : (ab) 

*******************************************************************************/

import java.util.*;

public class Main
{
    public static String removeUnbalancedParanthesis(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> missingSet = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(')   stack.push(i);
            else if(ch == ')') {
                if(!stack.isEmpty())    stack.pop();
                else    missingSet.add(i);
            }
        }
        while(!stack.isEmpty()) {
            missingSet.add(stack.pop());
        }
        for(int i = 0; i < str.length(); i++) {
            if(!missingSet.contains(i)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(removeUnbalancedParanthesis("((abc)((de))"));
		System.out.println(removeUnbalancedParanthesis("(((ab)"));
	}
}
