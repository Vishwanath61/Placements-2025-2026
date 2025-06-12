/******************************************************************************

1 2 3
6 5 4 
7 8 9

*******************************************************************************/

#include <stdio.h>


int main()
{
    int n = 4, num = 1;
    
    for(int i = 0; i < n; i++) {
        if(i % 2) {
            int prev = num + n -1;
            for(int j = 0; j < n; j++) {
                printf("%d ", prev--);
                num++;
            }
        } else {
            for(int j = 0; j < n; j++) {
                printf("%d ", num++);
            }
        }
        printf("\n");
    }
}


/* Approach 2
int main()
{
    int n = 4, num = 1, sum = 1;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            printf("%d ", num);
            num += sum;
        }
        num -= sum;
        sum = (sum == 1) ? -1 : 1;
        num += n;
        printf("\n");
    }

    return 0;
}*/
