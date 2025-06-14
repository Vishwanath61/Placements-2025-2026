/******************************************************************************

Given a string, reorder the characters so that no two adjacent characters are the same. If impossible, return an empty string

Input1:
S = aab
Output1:
aba

Input2:
aaab
Output2:
""

*******************************************************************************/

import java.util.*;

public class Main
{
	public static String reorder(String str) {
        int[] count = new int[26];
        int max = 0;
        for(char c : str.toCharArray()) {
            count[c - 'a']++;
            max = (max < count[c - 'a']) ? count[c - 'a'] : max;
        }
        
        if(max > ((str.length() + 1) / 2))  return "";
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(char c = 'a'; c <= 'z'; c++) {
            if(count[c - 'a'] > 0) {
                pq.add(new int[]{c, count[c - 'a']});
            }
        }
        
        StringBuilder result = new StringBuilder();
        int[] prev = null;
        
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            result.append((char) curr[0]);
            curr[1]--;
            
            if(prev != null && prev[1] > 0) {
                pq.add(prev);
            }
            
            prev = curr;
        }
        
        return (result.length() == str.length()) ? result.toString() : "";
    }

    public static void main(String[] args) {
        String str = "aab";
        System.out.println(reorder(str));
    }
}
