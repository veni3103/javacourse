package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.set(2,34);
		list.addAll(list);
		System.out.println(list);
		
	}

}
