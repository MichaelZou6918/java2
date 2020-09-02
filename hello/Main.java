package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] a=new int[101];//存放第一个多项式
        int[] b=new int[101];//存放第二个多项式
        int[] c=new int[101];//存放合并后的多项式
        int count=0;//用来统计输出的项数
        int n=0;//n表示幂次
        int x=0;//x表示系数
        do//第一个多项式
        {
            n=in.nextInt();
            x=in.nextInt();
            a[n]=x;
        }while(n!=0);//得到第二个多项式
        do
        {
            n=in.nextInt();
            x=in.nextInt();
            b[n]=x;
        }while(n!=0);//合并多项式
        int max=0;
        boolean isFirst=true;
        for(int i=0;i<101;i++)
        {
            c[i]=a[i]+b[i];
            if(c[i]!=0)
            {
            	max=i;//找到最高次幂为max;
            }
        }
        for(int i=max;i>=0;i--)
        {
        	if(max==0)
        	{
        	System.out.print(c[0]);
        	break;
        	}
        	if(c[i]==0)
        	{
        		continue;
        	}
        	if(isFirst)
        	{
        		isFirst=false;
        	}
        	else if(c[i]>0)
        	{
        		System.out.print("+");
        	}
        	if(c[i]!=1)
        	{
        		System.out.print(c[i]);
        	}
        	if(i!=0)
        	{
        		System.out.print("x");
        	}
        	if(i>=2)
        	{
        		System.out.print(i);
        	}
        	
        }
        
        
      
        
        
       }
	}










	
	