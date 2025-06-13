/******************************************************************************

           5 
         9 4 
      12 8 3 
   14 11 7 2 
15 13 10 6 1 

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n = 5, sum = n, gap = n - 1;
    for(int i = n; i > 0; i--, gap--) {
        for(int j = 1; j < i; j++) {
            printf("   ");
        }
        int temp = sum, tgap = i + 1;
        for(int j = i; j <= n; j++) {
            printf("%3d", temp);
            temp -= tgap;
            tgap++;
        }
        sum += gap;
        printf("\n");
    }

    return 0;
}


/*      Approach 2
int main()
{
    int n = 5, sum = n;
    for(int i = n; i > 0; i--) {
        for(int j = 1; j < i; j++) {
            printf("   ");
        }
        int ans = sum;
        int gap = i + 1;
        for(int j = i; j <= n; j++) {
            printf("%d ", ans);
            ans -= gap;
            gap++;
        }
        sum += (i - 1);
        printf("\n");
    }

    return 0;
}
*/
