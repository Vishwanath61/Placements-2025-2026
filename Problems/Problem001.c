/******************************************************************************

Input: I came by car 
Target: emac
Output: 3 

Input: I play tennis
Target: tennis
Output: -1

*******************************************************************************/

#include <stdio.h>
#include <string.h>

int isMatch(char *input, char *target, int ind) {
    int tarlen = strlen(target), i = 0;
    while(i < tarlen) {
        if(input[ind + i] != target[tarlen - 1 - i]) {
            return 0;
        }
        i++;
    }
    if(input[ind + i] == ' ' || input[ind + i] == '\0')  return 1;
    return 0;
}

int findMatch(char *input, char *target) {
    int inplen = strlen(input), i = 0;
    while(i < inplen) {
        if(input[i] == ' ') {
            i++;
        }
        if(isMatch(input, target, i)) {
            return i + 1;
        }
        i++;
    }
    return -1;
}

int main()
{
    char input[100], target[100];
    
    printf("Enter Input String: ");
    fgets(input, sizeof(input), stdin);
    input[strcspn(input, "\n")] = '\0';
    int inplength = strlen(input);
        
    printf("Enter Target String: ");
    fgets(target, sizeof(input), stdin);
    target[strcspn(target, "\n")] = '\0';
    int tarlength = strlen(target);
    
    printf("\nOutput - %d", findMatch(input, target));
    
    return 0;
}
