/******************************************************************************

        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4 

******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 7;
    for(int i = 0; i < n; i++) {
        for(int j = i; j < n - 1; j++) {
            printf("  ");
        }
        for(int k = i; k >= 0; k--) {
            printf("%d ", k);
        }
        for(int l = 1; l <= i; l++) {
            printf("%d ", l);
        }
        printf("\n");
    }

    return 0;
}
