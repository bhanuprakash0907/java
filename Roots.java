import java.util.Scanner;
class Roots
{
 public static void main(String args[])
 {
  int r1,r2,a,b;
  Scanner s = new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();
  int d= b*b;
  if(d>0)
  {
   System.out.println("Roots are real and Distinct ");
   r1 = -b/(2*a);
   r2 = b/(2*a);
   System.out.println("Root1:" +r1+ "\n" + "Root2:" +r2);
   }
   else
   { 
   System.out.println("Roots are real and equal ");
   r1 = -b/(2*a);
   r2 = -b/(2*a);
   System.out.println("Root1:" +r1+ "\n" + "Root2:" +r2);
  }
 }
}
