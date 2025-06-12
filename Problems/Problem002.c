/******************************************************************************

You are given an array of integers. 
For each element in the array, determine whether it is greater than or equal to all the elements to its right (including itself). 
If it is, retain it. Otherwise, replace it with -1.

6
5 2 6 1 3 2

-1 -1 6 -1 3 2

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 6;
    int input[] = {5, 2, 6, 1, 3, 2};
    int max = input[n - 1];
    
    for(int i = n - 2; i >= 0; i--) {
        if(max <= input[i]) {
            max = input[i];
        } else {
            input[i] = -1;
        }
    }
    
    for(int i = 0; i < n; i++) {
        printf("%d ", input[i]);
    }

    return 0;
}
