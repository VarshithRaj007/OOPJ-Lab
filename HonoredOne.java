class Gojo
{
	public void purple()
	{
		System.out.println("Imaginary Technique :");
  	}
}

class Satoru extends Gojo
{
	public void purple()
	{
		super.purple(); 
		System.out.println("Hollow Purple");
        }
}

public class HonoredOne
{
	public static void main(String args[])
        {
        	Gojo Infinity = new Satoru(); 
       		Infinity.purple(); 
        }
}
