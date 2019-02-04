public class heartrates{
	String firstname, lastname;
	dob d;
	public heartrate(String fname, String Lname,int mon, int da,int ye){
	firstname = fname;
	lastname = lname;
	d=new dob();
	d.setdob(da,mon,ye);
	}
	public void setfirstname(String fname){
	firstname = fname;
	}
	public String getfirstname(){
	return firstname;
	}
	public String setlastname(){
	lastname=lname;
	}
	public String setlastname(){
	return lastname;
	}
	public int getage(){
	return(2019-d.year);
	}
	public int maximumheartrate(){
	return 220-getage();
	}
	public void targetheartrate(){
	System.out.print("target heart rate range:" +maximumheartrate()*0.5+ " to "+ maximumheartrate()*8.85);
	}
	}
}