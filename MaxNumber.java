
import java.util.*;
class MaxNumber
{
 public static void main(String args[])
 {
  int a[];
  int i,n,max;
  Scanner s=new Scanner(System.in);
  System.out.println("enter no of elements");
  n=s.nextInt();
   a=new int[n];
  System.out.println("enter array elements");
  for(i=0;i<n;i++)
  {
   a[i]=s.nextInt();
   }
   System.out.println("array elements are:");
   for(i=0;i<n;i++)
   {
   System.out.println(a[i]+" ");
   }
   System.out.println();
   max=a[0];
   for(i=0;i<n;i++)
   {
    if(max<a[i])
    { 
      max=a[i];
     }
    }
    System.out.println("maximum number:"+max);
  }
 }
  
  