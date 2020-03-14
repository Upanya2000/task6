package epam;
class Sweets implements Comparable{
int weight=1;
String name="";
String color="yellow"; 
float calories=100;
@Override
public int compareTo(Object o) {
return 0;
}
}
class chocolate extends Sweets{} 
class DairyMilk extends chocolate
{
	DairyMilk()
	{
	this.name="DairyMilk";
	}
}
class kitkat extends chocolate{
	kitkat()
	{
	this.name="kitkat";
	}
}
public class AllChoc {
	public static void main(String[] args) {
		Sweets[]  allsweets = new Sweets[3];
		allsweets [0]= new DairyMilk();
		allsweets [1]= new DairyMilk();
		allsweets [2]= new kitkat();
		float tw =0;
		for (int i = 0; i < allsweets.length; i++) {
			Sweets s = allsweets[i];
			tw += s.weight;
		}
		System.out.println(" w = "+tw);
		System.out.println(" Printing ");
		for (int i = 0; i < allsweets.length; i++) {
			Sweets s = allsweets[i];
			System.out.println(s.name);
		}
		}
}

