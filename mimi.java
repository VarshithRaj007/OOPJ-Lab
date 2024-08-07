import java.util.*;
class mimi
{
    public static void main(String[]Makima)
    {
        Scanner go = new Scanner(System.in);
        System.out.println("Enter  the value of a :");
        int a = go.nextInt();
        System.out.println("Enter  the value of b :");
        int b = go.nextInt();
        System.out.println("Enter  the value of c :");
        int c = go.nextInt();
        int disc = (b*b)-4*a*c;
      
        if(a == 0)
        {
            System.out.print("Given equation is not a Quadratic equation");
        }
        else if(disc > 0)
        {
            double x1 = (-b+Math.sqrt(disc))/(2*a);
            double x2 = (-b-Math.sqrt(disc))/(2*a);
            System.out.println("The roots are real and distinct");
            System.out.println("The roots are :\nroot_1 = "+x1+"\nroot_2 = "+x2);
        }
        else if(disc == 0)
        {
            double x3 = -b/(2*a);
            System.out.println("The roots are real and same");
            System.out.println("The roots are :\nroot_1 = root_2 = "+x3);
        }
        else
        {   
            double x4 = -b/(2*a);
            double comp = Math.sqrt(-disc)/(2*a);
            System.out.println("The roots are Complex");
            System.out.println("The roots are:\nroot_1 = "+x4+"+i"+comp+"\nroot_2 ="+x4+"-i"+comp);
        }
     }
}
            
            
            
    
