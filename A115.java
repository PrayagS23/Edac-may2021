import java.util.*;
class A115
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the two numbers: ");
  int i=sc.nextInt();
  int j=sc.nextInt();
  int x;
  
  System.out.println("i:"+i);
  System.out.println("j:"+j);
  
  x=i;
  i=j;
  j=x;
  
  System.out.println("After Swapping: ");
  System.out.println("i:"+i);
  System.out.println("j:"+j);
  }
  }