/******************************************************************************

Palindrome Checker

Input = "I read a story a read I"
Output : True

*******************************************************************************/

public class Main
{
    public static boolean stringPlaindrome(String input) {
        String[] inp = input.split(" ");
        int len = inp.length;
        for(int i = 0; i <= len / 2; i ++) {
            if(!inp[i].equals(inp[len - i - 1])) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String input = "I read a story a read I";
		System.out.println(stringPlaindrome(input));
	}
}
