import java.io.IOException;
class Demo4
{
 void show() throws IOException
 {
  int arr[] ={1,2,3};
  System.out.println(arr[4]);
 }
 public static void main(String args[]) throws IOException
 {
  Demo4 d = new Demo4();
  d.show();
  }
  }
  
