/******************************************************************************

Input : "AAABBRNN"
Output : "3A2B1R2N"
Output : "3A2BR2N"

*******************************************************************************/

public class Main
{
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        char temp = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if(temp == current) {
                count++;
            } else {
                if(count == 1)  sb.append((temp + ""));
                else    sb.append(count + (temp + ""));
                temp = current;
                count = 1;
            }
        }
        if(count == 1)  sb.append((temp + ""));
        else    sb.append(count + (temp + ""));
        return  sb.toString();
    }
	public static void main(String[] args) {
		String input = "AAABBRNN";
		System.out.println(compressString(input));
	}
}
