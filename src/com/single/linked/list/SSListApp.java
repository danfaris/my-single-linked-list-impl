package com.single.linked.list;

public class SSListApp {

	public static void main(String[] args) {

		
		SLList list = new SLList();
		list.add(1, "Node1");
		list.add(2, "Node2");
		list.add(3, "Node3");
		list.add(4, "Node4");
		
		//print size
		System.out.println("The size of list is " + list.size());
		
		//print isEmpty:
		System.out.println("Is the list EMPTY? " + list.isEmpty());

		//print all elements:
		System.out.println("Printing...");
		list.printList();
		
		//adding another node...
		list.add(5, "another node!");
		System.out.println("Printing again...");
		list.printList();
	}

}
