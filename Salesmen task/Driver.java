import java.util.ArrayList;

public class Driver 
{
	ArrayList<String> bookshelf = new ArrayList<String>();
	public static void main(String[] args)
	{
	Salesman sales[] = new Salesman[10];
	sales[1]= new Salesman("jane" , 101312);
	sales[2]= new Salesman("gwen" , 53753);
	sales[3]= new Salesman("chris" , 12);
	sales[4]= new Salesman("holly" , 2212);
	sales[6]= new Salesman("Kyle" , 999);
	sales[7]= new Salesman("hunter" , 882);
	sales[8]= new Salesman("elizebeth" , 11112);
	sales[9]= new Salesman("joe" , 101255);
	sales[0]= new Salesman("bob" , 10);
	Salesman result[] = Salesman.getTopFive(sales);
		for(int i = 0; i < 10; i++)
		{
		System.out.println(sales[i]);
		
		}
		System.out.println("The top five salesmen are: ");
		for(int i = 0; i < 5; i++)
		{
		System.out.println(result[i]);
		}
	}
	
	
	
	

}
