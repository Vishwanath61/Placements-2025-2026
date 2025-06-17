/******************************************************************************

Check whether a given mathematical expression is valid.

    Eg.) Input  : (a+b)*(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid 
         
->No two operators can be adjacent
->No two operands can be adjacent
->No two same Paranthesis can be adjacent
->String should not start or end with operator

*******************************************************************************/

public class Main
{
    public static boolean isValidExpression(String str) {
        int n = str.length();
        if(n == 0)  return false;
        int parcount = 0;
        char prev = 0;
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                parcount++;
                if(prev != 0 && (prev == ')' || Character.isLetterOrDigit(prev))) {
                    return false;
                }
            } else if(ch == ')') {
                parcount--;
                if(isOperator(prev) || prev == '(' || parcount < 0) {
                    return false;
                }
            } else if(Character.isLetterOrDigit(ch)) {
                if(prev != 0 && Character.isLetterOrDigit(prev)) {
                    return false;
                }
            } else if(isOperator(ch)) {
                if(prev == 0 || isOperator(prev) || prev == '(') {
                    return false;
                }
            } else {
                return false;
            }
            prev = ch;
        }
        return parcount == 0 && !isOperator(prev);
    }
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
	public static void main(String[] args) {
		System.out.println(isValidExpression("(a+b)*(a*b)") ? "Valid" : "Invalid");
	}
}
