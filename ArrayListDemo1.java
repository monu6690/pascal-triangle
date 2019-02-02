import java.util.*;
class ArrayListDemo1{
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("initial size of al:"+al.size());
	al.add("c");
	al.add("a");
	al.add("e");
	al.add("d");
	al.add("f");
	System.out.println(al);
	al.add(1,"a2");
	System.out.println("initial size addition al:"+al.size());
	System.out.println("initial size addition al:"+al);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		String element=itr.next();
		System.out.print(element+"");
	}	
	System.out.println("modified content");
	ListIterator<String> litr=al.listIterator();
	while(litr.hasNext()){
		String element=litr.next();
		System.out.print(element+"");
	}
	System.out.println("previous element");
	while(litr.hasPrevious())
	{
		String element=litr.previous();
		System.out.print(element+"");
	}
	}
}