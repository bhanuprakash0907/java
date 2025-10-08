class Demo2
{
public static void main(String args[])
{
 int a= 5, b= 5;
 try
 {
   if(b==0)
    throw new ArithmeticException();
   else 
    System.out.println(a/b);
 }
  catch(ArithmeticException e)
  {
    System.out.println(e);
  }
  finally
  { 
   System.out.println(" execute the finally block");
  } 
  }
 }
