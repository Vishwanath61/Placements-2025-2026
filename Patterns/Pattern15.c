/******************************************************************************

1   3   5   7
2   4   6   8
9  11  13  15
10  12  14  16

*******************************************************************************/

#include <stdio.h>

int main() 
{
    int n = 4, odd = 1, even = 2;
    
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if(i % 2) {
                printf("%4d", odd);
                odd += 2;
            } else {
                printf("%4d", even);
                even += 2;
            }
        }
        printf("\n");
    }
    
}


/*  Approach 2

int main()
{
    int n = 4, ans = 1, gap = (((n - 1) * 2) - 1 );
    for(int i = 1; i <= n; i++) {
        printf("%4d", ans);
        for(int j = 2; j <= n; j++) {
            ans += 2;
            printf("%4d", ans);
        }
        if(i % 2) {
            ans -= gap;
        } else {
            ans++;
        }
        printf("\n");
    }

    return 0;
}
*/
