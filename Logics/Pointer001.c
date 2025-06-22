/******************************************************************************

Pointer dereferencing and incrementation

*******************************************************************************/
#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int *ptr = arr;             //Pointing at arr[0]
    printf("%d\n", *ptr);       //Prints value at arr[0]
    
    //Pointer is at arr[0]
    printf("%d ", *ptr++);      //Prints value at arr[0] and then moves to next postion arr[1]
    printf("%d ", *ptr);        //Prints value at arr[1] which is next postion
    printf("%d\n", arr[0]);     //Prints value at arr[0] it is unchanged
    
    //Pointer is at arr[1]
    printf("%d ", (*ptr)++);    //Prints value at arr[1] and it is post-incremented and it doesn't moves to next postion arr[2]
    printf("%d ", *ptr);        //Prints value at arr[1] which is same postion and value is changed
    printf("%d\n", arr[1]);     //Prints value at arr[1] it is changed it is pre-incremented
    
    //Pointer is at arr[1]
    printf("%d ", *++ptr);      //Moves to next postion arr[2] and then prints value at arr[2]
    printf("%d ", *ptr);        //Prints value at arr[2] which is next postion
    printf("%d\n", arr[1]);     //Prints value at arr[1] it is unchanged
    
    //Pointer is at arr[2]
    printf("%d ", ++*ptr);      //Value at arr[2] is pre-incremented
    printf("%d ", *ptr);        //Prints value at arr[2] which is at same postion
    printf("%d\n", arr[2]);     //Prints value at arr[2] it is changed
    
    printf("%d\n", *ptr + 2);   //Dereferences the pointer and adds 2 to it
    printf("%d\n", *(ptr + 2)); //Moves the pointer to 2 locations and dereferences it
    
    printf("%d\n", 2[arr]);     //2[arr] = arr[2]
    
    return 0;
}

/* Output
1
1 2 1
2 3 3
3 3 3
4 4 4
6
5
4*/
