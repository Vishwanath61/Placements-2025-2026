/******************************************************************************

1. Given a String with numbers and operators. Perform the operations on the numbers in their respective order. 
Input : "12345*+-+"
Output: 6
Explanation: [1*2+3-4+5 = 6]

*******************************************************************************/

public class Main
{
	public static int strOperation(String str) {
        int n = str.length(), size = 0;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            if(Character.isDigit(str.charAt(i))) {
                nums[size++] = str.charAt(i) - '0';
            } else {
                break;
            }
        }
        int result = nums[0];
        int charlen = 0;
        for(int i = 1; i < size; i++) {
            char c = str.charAt(size + charlen);
            if(c == '+') result += nums[i];
            else if(c == '-')   result -= nums[i];
            else if(c == '*')   result *= nums[i];
            else                result /= nums[i];
            charlen++;
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "12345*+-+";
        System.out.println(strOperation(input));
    }
}
