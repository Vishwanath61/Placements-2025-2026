/******************************************************************************

1   5   9  13
2   6  10  14
3   7  11  15
4   8  12  16

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 4;
    
    for(int i = 1; i <= n; i++) {
        int ans = i;
        for(int j = 1; j <= n; j++, ans += n) {
            printf("%2d ", ans);
        }
        printf("\n");
    }

    return 0;
}
