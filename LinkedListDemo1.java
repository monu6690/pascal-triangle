import java.util.*;
class LinkedListDemo1{
	public static void main(String[] args){
	LinkedList<String> ll=new LinkedList<String>();
	System.out.print("initial size of al:"+ll.size());
	ll.add("c");
	ll.add("a");
	ll.add("e");
	ll.add("d");
	ll.add("f");
	ll.add(1,"a2");
	ll.addLast("z");
	ll.addFirst("a");

	System.out.println("initial size addition al"+ll);

	ll.remove("f");
	ll.remove(2);
	System.out.println("after deletion al"+ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println("after deletion of first and last al"+ll);
	String val=ll.get(2);
	ll.set(2,"5");
	System.out.print("changed list"+ll);

	}
}