import java.util.*;
class ArrayListDemo{
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("initial size of al:"+al.size());
	al.add("c");
	al.add("a");
	al.add("e");
	al.add("d");
	al.add("f");
	System.out.println("initial size addition al:"+al.size());
	System.out.println("initial size addition al:"+al);
	al.remove("f");
	al.remove(2);
	System.out.println("initial size deletion al:"+al.size());
	System.out.println("initial size deletion al:"+al);
	}
}