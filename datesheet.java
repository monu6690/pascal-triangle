import java.util.Scanner;
public class datetest{
	public static void main(String args[]){
	date display=new date(0,0,0);
	Scanner input=new Scanner(System.in);
	int  month;
	int day;
	int year;
	System.out.print("enter month");
	month=input.nextint();
	display.setmonth(month);

	System.out.println();

	System.out.print("enter day");
	day=input.nextint();
	display.setday(day);

	System.out.println();

	System.out.print("enter year");
	year=input.nextint();
	display.setyear(year);

	System.out.println();
	display.displaydate();
	}
}