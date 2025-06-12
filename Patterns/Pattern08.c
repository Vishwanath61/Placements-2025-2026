/******************************************************************************

1   2  6  7 15      0 1 2 3 4
3   5  8 14 16      1 2 3 4 5
4   9 13 17 22      2 3 4 5 6
10 12 18 21 24      3 4 5 6 7
11 19 20 23 25      4 5 6 7 8

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 5, dim = (n - 1) * 2, val = 1;
    
    int matrix[n][n];
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            matrix[i][j] = 0;
        }
    }
    
    for(int i = 0; i <= dim; i++) {
        if(i % 2) {
            for(int j = 0; j <= i; j++) {
                int k = i - j;
                if(j < n && k < n) {
                    matrix[j][k] = val++;    
                }
            }
        } else {
            for(int j = i; j >= 0; j--) {
                int k = i - j;
                if(j < n && k < n) {
                    matrix[j][k] = val++;    
                }
            }
        }
    }
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            int ans = matrix[i][j];
            if(ans < 10)    printf("%d  ", ans);
            else printf("%d ", ans);
        }
        printf("\n");
    }

    return 0;
}
