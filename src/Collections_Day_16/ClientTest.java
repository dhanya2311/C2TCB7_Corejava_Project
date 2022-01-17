package Collections_Day_16;

import java.util.LinkedList;

public class ClientTest {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.addFirst(100);
		
		list.addLast(500);
		
		list.add(1,200);
		
		System.out.println(list);
	}

}
