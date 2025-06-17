/******************************************************************************

Multiplication Without Using *:

Multiply two numbers represented as strings without using the * operator.
Input: "0031", "2"
Output: 62

*******************************************************************************/

import java.util.*;

public class Main
{   public static String removeLeadingZeroes(String str) {
        int i = 0;
        while(str.charAt(i) == '0') i++;
        return str.substring(i);
    }
    public static int multiply(int a, int b) {
        int n = (a < b) ? a : b;
        int sum = (a == n) ? b : a;
        while(n > 1) {
            sum += sum;
            n--;
        }
        return sum;
    }
    public static int stringMultiply(String str1, String str2) {
        String s1 = removeLeadingZeroes(str1);
        String s2 = removeLeadingZeroes(str2);
        int n1 = s1.length();
        int n2 = s2.length();
        int[] nums = new int[n1 + n2];
        for(int i = n1 - 1; i >= 0; i--) {
            for(int j = n2 - 1; j >= 0; j--) {
                int num1 = s1.charAt(i) - '0';
                int num2 = s2.charAt(j) - '0';
                nums[i + j + 1] += multiply(num1, num2);
            }
        }
        for(int i = nums.length - 1; i > 0; i--) {
            nums[i - 1] += nums[i] / 10;
            nums[i] %= 10;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int num : nums) {
            if(sb.length() == 0 && num == 0)  continue;
            sb.append(num);
        }
        return (sb.length() == 0) ? 0 : Integer.parseInt(sb.toString());
    }
	public static void main(String[] args) {
		System.out.println(stringMultiply("0031", "2"));
	}
}
