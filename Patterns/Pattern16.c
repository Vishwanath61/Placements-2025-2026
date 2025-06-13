/******************************************************************************

5   5   5   5   5
5   4   4   4   5
5   4   3   4   5
5   4   4   4   5
5   5   5   5   5                   Similar to Pattern 06, 17

*******************************************************************************/
#include <stdio.h>
#define MIN(a, b) ((a) < (b) ? (a) : (b))

int main()
{
    int n = 5, size = 5, ans = n;
    
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            int ans = n - MIN(MIN(i, j), MIN(size - j - 1, size - i - 1));
            printf("%4d", ans);
        }
        printf("\n\n");
    }

    return 0;
}
