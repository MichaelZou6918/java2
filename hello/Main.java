package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a=in.nextLine();
		int A=0,B=0;
		for(;A<a.length();A++)
		{
			if(a.charAt(A)==' '||a.charAt(A)=='.')
			{
				System.out.print(A-B+" ");
				B=A+1;
			}
		}
}
}








	
	