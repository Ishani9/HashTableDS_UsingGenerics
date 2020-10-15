package com.bl.assignment;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public INode<K> search(K key) {
		INode<K> temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void append(INode<K> newNode) {
		if (head == null) {
			this.head = newNode;
		}
		if (tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void delete(K key) {
		INode<K> temp = head;
		INode<K> prev = head;
		if (head.getKey().equals(key)) {
			head = head.getNext();
		} else {
			while (temp.getNext() != null) {
				if (temp.getKey().equals(key))
					break;
				prev = temp;
				temp = temp.getNext();
			}
			if (tail.getKey().equals(key)) {
				tail = prev;
				tail.setNext(null);
			}
			prev.setNext(temp.getNext());
		}
	}


	public String toString() {
		StringBuilder string = new StringBuilder();
		INode<K> temp = head;
		while (temp.getNext() != null) {
			string.append(temp).append(" -> ");
			temp = temp.getNext();
		}
		string.append(temp);
		return string.toString();
	}
} 


