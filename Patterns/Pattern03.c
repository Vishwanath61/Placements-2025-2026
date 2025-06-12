/******************************************************************************

1       5
  2   4 
    3 
  2   4 
1       5

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 7, mid = n / 2, x = 1, y = n;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j < x; j++) {
            printf(" ");
        }
        printf("%d", x);
        if(x != y) {
            for(int j = x; j < y - 1; j++) {
                printf(" ");
            }   
            printf("%d", y);   
        }
        if(mid > 0) {
            x++;
            y--;
        } else {
            x--;
            y++;
        }
        mid--;
        printf("\n");
    }

    return 0;
}
