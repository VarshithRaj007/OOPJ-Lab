import java.util.*;
class strong
{
	public static void main(String[]args)
	{
		int as,f,i,n;
		System.out.println("Enter the number to check if it's a Strong Number");
		Scanner go=new Scanner(System.in);
 		int a = go.nextInt();
 		n = a;
 		as=0;
 		while(a>0)
 		{
 			i=a%10;
 			f=1;
 			while(i>0)
 			{
 				f=f*i;
 				i--;
 			}
 			as += f;
 			a /= 10;
 		}
 		
 	   	if(as==n)
 	   	{	
 	   		System.out.println("The given number is a Strong Number");
 		}
		else
		{
			System.out.println("The given number is NOT a Strong Number");
		}
	}
}
