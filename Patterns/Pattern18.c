/******************************************************************************

1   2   3   4    5
16  17  18  19   6
15  24  25  20   7
14  23  22  21   8
13  12  11  10   9

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

int** matrixCreation(int n) {
    int** matrix = malloc(n * sizeof(int*));
    for(int i = 0; i < n; i++) {
        matrix[i] = malloc(n * sizeof(int));
    }
    return matrix;
}

void printMatrix(int** matrix, int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            printf("%4d", matrix[i][j]);
        }
        printf("\n\n");
    }
}

void memoryFree(int** matrix, int n) {
    for(int i = 0; i < n; i++) {
        free(matrix[i]);
    }
    free(matrix);
}

int main()
{
    int n = 5;
    int** matrix = matrixCreation(n);
    int left = 0, right = n - 1;
    int top = 0, bottom = n - 1;
    int num = 1;
    
    while(left <= right && top <= bottom) {
        for(int i = left; i <=  right; i++) {
            matrix[top][i] = num++;
        }
        top++;
        for(int i = top; i <= bottom; i++) {
            matrix[i][right] = num++;
        }
        right--;
        for(int i = right; i >= left; i--) {
            matrix[bottom][i] = num++;
        }
        bottom--;
        for(int i = bottom; i >= top; i--) {
            matrix[i][left] = num++;
        }
        left++;
    }
    
    printMatrix(matrix, n);

    memoryFree(matrix, n);
    
    return 0;
}
