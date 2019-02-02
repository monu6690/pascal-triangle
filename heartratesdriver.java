import java.util.*;
class heartratesdriver {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	heartrates myheartrate[]=new heartrates[2];
	for(int count=0;count<(my heartrate.length);count++){
	System.out.println("enter first name");
	String firstname=input.nextline();
	System.out.println("enter last name");
	String lastname=input.nextline();
	System.out.println("enter birth date"+"\num"+"\ndd"+"\nyear");
	}
	int month=input.nextint();
	int day=int.nextint();
	int year=input.nextint();
	input.nextline();
	myheartrate[count]=new heartrates(firstname,last name,month,day,year);
	System.out.println("firstname"+"\t"+"last name"+"\t"+"\t"+"Age in years"+"\t"+"maximum heartrate"+"\t"+"targetheartrate\n");
	System.out.println("firstname"+"\t"+"lastname"+"\t"+myheartrate[count].getage()+"\t"+myheartrate[count].maximumheartrate());
	myheartrate[count].targetheartrate();
	}
}