import java.util.*;
class Yuji
{
	void Curse()
	{
		System.out.println("Black");
	}
}
class Itadori extends Yuji
{
	void Curse()
	{
		System.out.println("Flash");
	}
}
class BlackFlash
{
	public static void main(String[]args)
	{
		Itadori obj = new Itadori();
		obj.Curse();
	}
}
