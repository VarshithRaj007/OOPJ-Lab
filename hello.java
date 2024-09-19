import java.util.*;
class sui
{
	int x;
	int a;
	void getx()
	{
		x = 100;
		System.out.println("x value is :"+x);
	}
}
class edic extends sui
{
	int y,total;
	void gety()
	{
		y = 200;
		System.out.println ("y value is :"+y);
	}
	void sum()
	{
		total = x + y;
		System.out.print("Total is "+total+"\n");
	}
}
public class hello
{
	public static void main(String[]args)
	{
		edic obj = new edic();
		obj.getx();
		obj.gety();
		obj.sum();
	}
}
