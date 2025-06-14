/******************************************************************************

Given a list of events with time in hours, 
write a function that returns the number of events in the last T hours for each event in the list. 

Time [1, 2, 3, 10, 11]  
T = 5  

Output: [1, 2, 3, 1, 2]

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

void printMatrix(int* arr, int n) {
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
}

int main()
{
    int time[] = {1, 2, 3, 10, 11};
    int t = 5;
    int n = sizeof(time) / sizeof(int);
    int* result = malloc(n * sizeof(int));
    int start = 0;
    
    for(int end = 0; end < n; end++) {
        while(time[end] - time[start] > t) {
            start++;
        }
        result[end] = end - start + 1;
    }
    
    printMatrix(result, n);
    
    return 0;
}
