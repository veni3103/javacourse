package collections;

import java.util.LinkedList;

public class LInkedList {
	public static void main(String[] args) {
		LinkedList <String>list=new LinkedList<>();
		list.add("java");
		list.add(null);
		list.add("c");
		System.out.println(list);
		list.addFirst("python");
		System.out.println(list);
		list.offerLast("py");
		System.out.println(list);
	}

}
