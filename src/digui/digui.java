/* ��Ŀ:һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳���������ֵ����5000ʱ����ֵ����ָ��˳��������� */

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
