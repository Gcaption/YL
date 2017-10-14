/* 题目:数字旋转方阵。*/

package digui;
public class xuanzhuan {
	static int a[][]=new int[20][20];//默认值为0
	
	static void t(int a[][],int b,int s,int d){
		//a是存储方阵元素的数组,b为每个方阵的起始位置,s是方阵的阶数,d是为a数组赋值的整数
		int i,h=b,v=b;
		if(s==0) return;// 递归出口  
		if(s==1) 
		{ a[b][b]=d;return;}
		for(i=1;i<s;i++)     //第一圈的左列从上至下递增      
		{ a[h][v]=d;h++;d++;}
		for(i=1;i<s;i++)     //第一圈的下行列从左至右递增
		{ a[h][v]=d;v++;d++;}
		for(i=1;i<s;i++)     //第一圈的右列从下至上递增
		{ a[h][v]=d;h--;d++;}
		for(i=1;i<s;i++)     //第 一圈的上行从右至左递增
		{ a[h][v]=d;v--;d++;}
		t(a,b+1,s-2,d);      //调用内一圈递归函数  
	}
	public static void main(String[] args) {
		System.out.println("阶数n=5的旋转方阵:");
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
