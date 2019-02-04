import java.util.*;
class heartratesdriver {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	heartrates myheartrate[] = new heartrates[2];
	for(int count=0;count< (myheartrate.lenght);count++)
	{
	System.out.print("enter first name");	
	String firstname = input.nextline();
    System.out.print("enter the last name");
    String lastname = input.nextline();
    System.out.print("enter the birthdate" "\nmm"+"\dd"+"\nyear");
    int month =input.nextInt();
    int day =input.nextInt();
    int year =input.nextInt();
    input.nextline();
    myheartrate[count] = new heartrates(firstname, lastname, month, year);
    System.out.println("firstname"+"\t+"last name"+"\t"+"age in years"+"\t"+"maximum heartrate"+"targetheartrate\n");
     System.out.println("firstname"+"\t+"last name"+"\t"+myheartrate[count].getage()+"\t"+myheartrate[count].maximumheartrate());
     myheartrate[count].targetheartrate();


	}
	}
}