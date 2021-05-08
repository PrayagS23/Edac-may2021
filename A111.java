import java.util.Scanner;
 public class A111
 {
    public static void main(String arg[])
	{
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter radius: ");
	  double r=sc.nextInt();
	  
	  double Area=Math.PI*(r*r);
	  double Circum= Math.PI*(2*r);
	  System.out.println("Area of circle: "+Area);
	  System.out.println("Circumference of circle: "+Circum);
    }
}