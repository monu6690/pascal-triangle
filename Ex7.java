class BaseException extends Exception{}

class Base {
	Base() throws BaseException{
	 throw new BaseException();
	}
}
class Derived extends Base{
	Derived() throws BaseException{
	super();
	// not this way,'catch' without 'try ' not allowed:
	//catch(BaseException e){}
	//try{
	//super();
	}
	//catch(BaseException e){}

	} 
public class Ex7{
	public static void main(String args[]){
	try{
	  Derived d=new Derived();
	}
	catch(BaseException e){
	  System.out.println("BaseException caught in main()");}
	
	}
}