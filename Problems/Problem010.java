/******************************************************************************

Integer Rotate
num = 12345 left = 2 
output : 34512

*******************************************************************************/

public class Main
{
    public static int rotateLeft1(int num, int left) {
        String str = Integer.toString(num);
        int len = str.length();
        left = left % len;
        String rotated = str.substring(left) + str.substring(0, left);
        return Integer.parseInt(rotated);
    }
    public static int power10(int k) {
        int  i = 1;
        while(k-- > 0)  i *= 10;
        return i;
    }
    public static int numLength(int num) {
        if(num == 0)    return 1;
        int len = 0;
        while(num != 0) {
            num /= 10;
            len++;
        }
        return len;
    }
    public static int rotateLeft2(int num, int k) {
        int len = numLength(num);
        int left = num / power10(len - k);
        int right = num % power10(len - k);
        return right * power10(k) + left;
    }
	public static void main(String[] args) {
		int num = 12345;
		int left = 2;
		System.out.println(rotateLeft2(num, left));
	}
}
