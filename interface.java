import java.util.*;
interface A
{
	public void show();
	void display()
	{
		System.out.println("Default Method");
	}
	static void sm()
	{
		System.out.println("Static Method");
	}
}
class B implements A
{
	public void show()
	{
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a,b values: ");
		a=in.nextInt();
		b=in.nextInt();
		int add=a+b;
		System.out.println("Sum of Two Numbers: "+add);
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
		obj.display();
		obj.sm();
	}
}
