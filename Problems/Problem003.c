/******************************************************************************

You are given a positive integer n. Your task is to perform run-length encoding on its digits.
For each group of consecutive identical digits, output the digit followed by the number of times it repeats consecutively.
Return the final encoded string.

Input: 1112221
Output: 112313
Output(Reversed): 313211

*******************************************************************************/
#include <stdio.h>

int reverse(int num) {
    int rev = 0;
    while(num > 0) {
        int temp = num % 10;
        rev = (rev * 10) + temp;
        num /= 10;
    }
    return rev;
}

int main()
{
    int input = 1112221;
    int rev = 0, in = input;
    int prev = in % 10, count = 1;
    in /= 10;
    
    while(in > 0) {
        int temp = in % 10;
        if(temp == prev) {
            count++;
        } else {
            int ans = (prev * 10) + count;
            rev = (rev * 100) + ans;
            prev = temp;
            count = 1;
        }
        in /= 10;
    }
    int ans = (prev * 10) + count;
    rev = (rev * 100) + ans;
    
    printf("\nInput: %d", input);
    printf("\nOutput: %d", rev);
    printf("\nOutput(Reversed): %d", reverse(rev));
    
    return 0;
}
