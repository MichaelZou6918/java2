package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
System.out.println("input two number:");
int []prime=new int[201]; 
int n,m;
System.out.println("input 2 mumbers:");
n=in.nextInt();
m=in.nextInt();
prime[0]=2;
int len=200;
int count=0;
int x=3;
while(count<len)
{
	int isprime=1;
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			isprime=0;
			break;
		}
	}
	if(isprime==1)
	{
		prime[count+1]=x;
		count++;
	}
	else
	{
 System.out.println(x+"its not a prime");
	}
	x++;
}
int sum=0;
for(;(m-n)>=0;)
{
	sum+=prime[n-1];
	n++;
}
System.out.println("zonghe:"+sum);

}
	
	
	
}









	
	