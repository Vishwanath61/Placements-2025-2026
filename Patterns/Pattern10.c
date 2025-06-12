/******************************************************************************

z o h o c o r 
          p 
        o 
      r
    a 
  t
i o n t e a m

*******************************************************************************/

#include <stdio.h>
#include <string.h>

int main()
{
    char* string = "zohocorporationteam";
    int length = strlen(string);
    int row = (length / 3) + 1, counter = 0;
    
    printf("%s - %d - %d\n\n", string, length, row);
    
    for(int i = 1; i <= row; i++) {
        for(int j = 1; j <= row; j++) {
            if(i == 1 || i == row || (i + j) == row + 1) {
            printf("%c ", string[counter++]);
            } else {
                printf(" ");
            }   
        }
        printf("\n");
    }

    return 0;
}
