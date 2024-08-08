import java.util.*;
class truce
{
	public static void main(String[]args)
	{
		int p,i,n;
		System.out.println("Enter the number to check if it's a Palindrome");
		Scanner go=new Scanner(System.in);
 		int a = go.nextInt();
 		n = a;
 		p=0;
 		while(a>0)
 		{
 			i=a%10;
 			p=p*10+i;
 			a=a/10;
 		}
 		
 	   	if(p==n)
 	   	{	
 	   		System.out.println("The given number is a Palindrome");
 		}
		else
		{
			System.out.println("The given number is NOT a Palindrome");
		}
	}
}
		
