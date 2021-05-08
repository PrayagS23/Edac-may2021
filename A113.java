import java.util.Scanner;
 public class A113
 {
    public static void main(String arg[])
	{
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Height: ");
	  System.out.println("Enter Width: ");
	  double h=sc.nextInt();
	  double w=sc.nextInt();
	  
	  double Area= w*h;
	  double Perimeter= 2*(w+h);
	  System.out.println("Area of rectangle: "+Area);
	  System.out.println("Perimeter of rectangle: "+Perimeter);
    }
}