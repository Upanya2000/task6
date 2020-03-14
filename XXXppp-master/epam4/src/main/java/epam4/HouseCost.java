package epam4;
import java.util.Scanner;
public class HouseCost {
	public static void main(String[] args)
{
	Scanner p=new Scanner(System.in);
	System.out.format("1.standard\n 2.above standard\n3.high standard\n4.high standard and fully automated\nenter standard :");
	String input=p.nextLine();
	System.out.format("enter Area of house:");
	double Area=p.nextDouble(),Cost;
	if(input.equals("standard"))
		Cost=Area*1200;
	else if(input.equals("above standard"))
		Cost=Area*1500;
	else if(input.equals("high standard"))
		Cost=Area*1800;
	else if(input.equals("high standard and fully automated")) 
		Cost=Area*2500;
	else
		Cost=0;
	System.out.format("total estimated cost = %.4f",Cost);
}
}
