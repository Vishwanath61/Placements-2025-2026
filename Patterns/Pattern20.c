/******************************************************************************

  1 
  2   3 
  4   5   6 
  7   8 
  9  

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 5, mid = (n / 2), num = 1, seq = 1;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < seq; j++) {
            printf("%3d", num++);
        }
        seq += (i < mid) ? 1 : -1;
        printf("\n");
    }

    return 0;
}
