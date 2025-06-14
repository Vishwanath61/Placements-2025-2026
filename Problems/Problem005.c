/******************************************************************************

You are given a list of time intervals representing booked meetings in a room. 
Write a function to insert a new meeting and return if it can be scheduled without conflict. 
If it can be inserted, return the new list of intervals after merging overlapping ones. 
Otherwise, return "Conflict".

Input1:
existing = [[1, 3], [5, 7], [8, 12]]
New =[4, 6]
Output1:
"Conflict

Input2:
existing = [[1, 3], [5, 7], [8, 12]]
New =[3, 5]
Output2:
[[1, 7], [8, 12]]

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

int compare(const void* p1, const void* p2) {
    int* a = (int*)p1;
    int* b = (int*)p2;
    return a[0] - b[0];
}

int isCollision(int a[2], int b[2]) {
    return a[0] < b[1] && b[0] < a[1];
}

void print2matrix(int existing[100][2], int n) {
    for(int i = 0; i < n; i++) {
        printf("[%d, %d]\n", existing[i][0], existing[i][1]);
    }
}

void meetingBooking(int existing[100][2], int new[2], int n) {
    for(int i = 0; i < n; i++) {
        if(isCollision(existing[i], new)) {
            printf("Conflict");
            return;
        }
    }
    
    existing[n][0] = new[0];
    existing[n][1] = new[1];
    n++;
    
    qsort(existing, n, sizeof(existing[0]), compare);
    
    print2matrix(existing, n);
    printf("\n");
    
    int result[100][2];
    result[0][0] = existing[0][0];
    result[0][1] = existing[0][1];
    int r = 1;
    for(int i = 1; i < n; i++) {
        if(existing[i][0] == existing[i - 1][1]) {
            result[r - 1][1] = existing[i][1];
        } else {
            result[r][0] = existing[i][0];
            result[r][1] = existing[i][1];
            r++;
        }
    }
    
    print2matrix(result, r);
}

int main()
{
    int n = 3;
    int existing[100][2] = {{1, 3}, {5, 7}, {8, 12}};
    int new[2] = {3, 5};
    
    meetingBooking(existing, new, n);
    
    return 0;
}
