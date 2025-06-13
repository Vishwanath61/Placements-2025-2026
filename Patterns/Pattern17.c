/******************************************************************************

1   1   1   1   1
1   2   2   2   1
1   2   3   2   1
1   2   2   2   1
1   1   1   1   1                   Similar to Pattern 06, 16

*******************************************************************************/

#include <stdio.h>
#define MAX(a, b) ((a) > (b) ? (a) : (b))

int main()
{
    int n = 5, size = 5;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            int ans = n - MAX(MAX(i, j), MAX(size - i - 1, size - j- 1));
            printf("%4d", ans);
        }
        printf("\n");
    }

    return 0;
}
