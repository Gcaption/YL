/* ��Ŀ:������ת����*/

package digui;
public class xuanzhuan {
	static int a[][]=new int[20][20];//Ĭ��ֵΪ0
	
	static void t(int a[][],int b,int s,int d){
		//a�Ǵ洢����Ԫ�ص�����,bΪÿ���������ʼλ��,s�Ƿ���Ľ���,d��Ϊa���鸳ֵ������
		int i,h=b,v=b;
		if(s==0) return;// �ݹ����  
		if(s==1) 
		{ a[b][b]=d;return;}
		for(i=1;i<s;i++)     //��һȦ�����д������µ���      
		{ a[h][v]=d;h++;d++;}
		for(i=1;i<s;i++)     //��һȦ�������д������ҵ���
		{ a[h][v]=d;v++;d++;}
		for(i=1;i<s;i++)     //��һȦ�����д������ϵ���
		{ a[h][v]=d;h--;d++;}
		for(i=1;i<s;i++)     //�� һȦ�����д����������
		{ a[h][v]=d;v--;d++;}
		t(a,b+1,s-2,d);      //������һȦ�ݹ麯��  
	}
	public static void main(String[] args) {
		System.out.println("����n=5����ת����:");
		int h,v,b,s,d,n=5;
		b=1;s=n;d=1;
		t(a,b,s,d);
		for(h=1;h<=n;h++) 
		  { for(v=1;v<=n;v++) 
			System.out.print(a[h][v]+" ");
		  System.out.println();
		  }
			     
	}

}
