package com.single.linked.list;

public interface LinearList {

	public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void remove(int index);
	public void add(int index, Object theElement);
	public void add(Object theEmement);
	public void printList();
}
