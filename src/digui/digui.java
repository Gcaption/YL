/* 题目:一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，当值大于5000时，把值按照指定顺序输出来。 */

package digui;

public class digui {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printx(1237);
	}
	private static void printy(int i) {  
		// TODO Auto-generated method stub
		if (i >= 1237) {
			System.out.println(+i);
			printy(i / 2);	
		}
	}
	public static void printx(int j) {    
		System.out.println(+j);
		if (j < 5000)
		printx(2 * j);
		else {
		printy(j / 2);
		}
	}
}
