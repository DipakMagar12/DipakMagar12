import java.util.Scanner;
class HexagoanArea {

public static void main(String[]args)
{

Scanner a= new Scanner(System.in);
 System.out.print("enter the length of side of hexagon:"); 
double side= a.nextDouble(); 
double area =(3)*(1.41421/2)*(side*side);

System.out.print ("The area of hexagon is:-" +area);
}
}
