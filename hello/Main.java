package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
System.out.println("input a muber:");
int a=in.nextInt();
int [] b=new int [10];
int count=0;
int n=0;
int m=0;
int n1;
if(a<0)
{
	a=-a;
	System.out.print("fu ");
}
while(a!=0)
{
	n1=a%10;
	a=a/10;
	b[count]=n1;
	count++;
	n++;
}
for(count=n-1;count>=0; count--)
{
	m=b[count];
	switch(m)
    {
    case 0:System.out.print("ling");
    break;
    case 1:System.out.print("yi");
    break;
    case 2:System.out.print("er");
    break;
    case 3:System.out.print("san");
    break;
    case 4:System.out.print("si");
    break;
    case 5:System.out.print("wu");
    break;
    case 6:System.out.print("liu");
    break;
    case 7:System.out.print("qi");
    break;
    case 8:System.out.print("ba");
    break;
    case 9:System.out.print("jiu");
    break;
    }
    System.out.print(" ");
}
}
}






	
	