import java.util.Scanner;

 class A16
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 2 Integer Numbers: ");
   int i=sc.nextInt();
   int j=sc.nextInt();
   int k=i+j;
   int m=i-j;
   int o=i*j;
   int n=i/j;
   int p=i%j;
   System.out.println("Addition: "+k);
   System.out.println("Substraction: "+m);
   System.out.println("Multiplication: "+o);
   System.out.println("Division: "+n);
   System.out.println("Remainder : "+p);
   }
  }