public class heartrates{
	String firstname,lastname;
	dob d;

	public heartrates(String fname,String lname,int mon,int da,int ye){
	firstname=fname;
	lastname=lname;
	d=new dob();
	d.setdob(da,mon,ye);
	}
	public void setfirstname(String name){
	firstname=fname;
	}
	public String getfirstname(){
	return firstname;
	} 
	public void setlastname(String lname){
	lastname=lname;
	}
	public String getlastname(){
	return lastname;
	}
	public int getage(){
	return (2019 - d.year);
	}
	public int maximumheartrate(){
	return 220 - getage();

	}
	public void targetheartrate(){
	System.out.print("target heartrate range:"+maximumheartrate()*0.5+"to"+maximumheartrate()*0.85);
	}
}
