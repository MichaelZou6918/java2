package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
int count = 0;//统计输入得第几个多项式
int[] list = new int[12];//创建数组
//把输入的多项式相加
do {
	int index = in.nextInt();//幂数
	int value = in.nextInt();//系数
	list[index] += value;
	if (index == 0)
	 {
		count++;
	 }
   } while(count < 2);//第二个多项式输完跳出循环

boolean flag=true;//为下面循环做准备

for (int i = 11;i >= 0;i--) 
 {
	if (list[i] != 0)//系数不为零进入循环
	 {
		if (!flag && list[i] > 0)//第一次进入循环为true不带加号
			System.out.print("+");
		if (i == 0)//幂为零的情况
			System.out.print(list[i]);
		if(i > 1 && list[i] != 1)
			System.out.print(list[i] + "x" + i);
		if(i > 1 && list[i] == 1)//系数为1的情况
			System.out.print("x" + i);
		if(i == 1 && list[i] != 1)//幂数为1的情况下
			System.out.print(list[i] + "x1");
		if(i == 1 && list[i] == 1)//幂数系数都为1的情况
			System.out.print("x");
		flag = false;//保证第一次循环后上面那个加号可以启用
	}
}
if(flag) //如果没有输入输出0
	System.out.print(0);
}
}










	
	