import java.util.*;
class arms
{
	public static void main(String[]args)
	{
		int p,i,n;
		System.out.println("Enter the number to check if it's an Armstrong Number");
		Scanner go=new Scanner(System.in);
 		int a = go.nextInt();
 		n = a;
 		p=0;
 		while(a>0)
 		{
 			i=a%10;
 			p=p+(i*i*i);
 			a=a/10;
 		}
 		
 	   	if(p==n)
 	   	{	
 	   		System.out.println("The given number is an Armstrong Number");
 		}
		else
		{
			System.out.println("The given number is NOT an Armstrong Number");
		}
	}
}
