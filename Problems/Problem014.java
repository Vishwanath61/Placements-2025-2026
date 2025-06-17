/******************************************************************************

Form a number system with only 3 and 4. Find the nth number of the number system. 
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, .... 

*******************************************************************************/

import java.util.*;

public class Main
{
    public static int getNthNumber(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        int count = 0;
        
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            if(count == n) {
                return curr;
            }
            queue.add((curr * 10) + 3);
            queue.add((curr * 10) + 4);
        }
        return 0;
    }
	public static void main(String[] args) {
		int n = 10;
		System.out.println(getNthNumber(10));
	}
}
