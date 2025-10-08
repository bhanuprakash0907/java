import java.util.Scanner;
class Demo1
{
 public static void main(String args[])
 {
   int a,b;
   int arr[]={1,20,3,0,5};
   Scanner s= new Scanner(System.in);
   a = s.nextInt();
   b=a+1;
   try
   { 
     System.out.println(arr[a]/arr[b]);
    }
   catch(ArithmeticException e)
   {
    System.out.println("execute the program");
   }
   catch(ArrayIndexOutOfBoundsException d)
   { 
    System.out.println(" end ");
    }
   }
  } 
   
