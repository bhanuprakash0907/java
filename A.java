class A
{

void printarr(int a[],int n)
{
  int i;
  System.out.println("The array is:")
  for(i=0; i<n; i++)
  {
    System.out.println( a[i]);
  }

}


void Bubble(int a[], int n)
{
  int i,temp,j;
  
  for(i=0; i<n; i++)
  {
    for(j=i+1; j<n; j++)
    {
      if(a[j]<a[i])
      {
          temp = a[i];    
          a[i] = a[j];    
          a[j] = temp;   
      
      }
    
    } 
  }

}



public static void main(String args[])
{
  int a[] = {1,4,2,6,5,8};
  
  int n = a.length;
    System.out.println("The array before sorting");
 A b = new A();
 b.printarr(a,n);
 b.Bubble(a,n);
    System.out.println("The array after sorting");
   b.printarr(a,n);  

}

}
