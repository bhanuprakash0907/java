public class Exceptionhandling{
	public static void main(String[] args){
	try{
		int a=10,b=0;
		int result=a/b;
		System.out.println(result);
		} catch(ArithmeticException e){
		System.out.println("error:division by zero not allowed!");
		}
		System.out.println("Program continues normally...");
		}
	}
