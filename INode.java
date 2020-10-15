package com.bl.assignment;

public interface INode<T> {			//extends Comparable<T>
	public void setKey(T key);
	public T getKey();
	public void setNext(INode<T> node);
	public INode<T> getNext();

}

