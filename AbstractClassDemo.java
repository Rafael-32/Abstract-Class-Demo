import java.util.*; abstract class Shapes
{
double a,b;
abstract void printArea();
}
class Rectangle extends Shapes
{
void printArea()
{
System.out.println("\t\tCalculating Area of Rectangle"); Scanner input=new Scanner(System.in); System.out.print("Enter length: "); a=input.nextDouble();
System.out.print("\nEnter breadth: "); b=input.nextDouble();
double area=a*b;
System.out.println("Area of Rectangle: "+area);
}
}
class Triangle extends Shapes
{
void printArea()
{
System.out.println("\t\tCalculating Area of Triangle"); Scanner input=new Scanner(System.in); System.out.print("Enter height: "); a=input.nextDouble();
System.out.print("\nEnter breadth: "); b=input.nextDouble();
double area=0.5*a*b; System.out.println("Area of Triangle: "+area);
}
}
class Circle extends Shapes
{
void printArea()
{
System.out.println("\t\tCalculating Area of Circle"); Scanner input=new Scanner(System.in); System.out.print("Enter radius: "); a=input.nextDouble();
double area=3.14*a*a; System.out.println("Area of Circle: "+area);
}
}
class AbstractClassDemo
{
public static void main(String[] args)
{
Shapes obj;
obj=new Rectangle(); obj.printArea(); obj=new Triangle(); obj.printArea(); obj=new Circle(); obj.printArea();
}
}
