import java.util.Scanner;
class Circle{
 
double c,a;
 public void area(int z)
{
a=3.14*z*z;
System.out.print("Area: "+a);
}
public void circumference(int z)
{
 c= 2*3.14*z;
 System.out.println("\n");
System.out.print("Circumference: "+c);
}

public static void main(String args[])
{
int r;
 Scanner reader = new Scanner(System.in);
 System.out.print("Enter radius: ");
 r=reader.nextInt();

Circle aCircle=new Circle();
 
 
aCircle.area(r);
aCircle.circumference(r);
}
}
