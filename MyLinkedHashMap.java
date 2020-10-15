package com.bl.assignment;

import java.util.ArrayList;

public class MyLinkedHashMap<k, v> {
	private final int numBuckets;
	ArrayList<LinkedList<k>> myBucketArray;

	public MyLinkedHashMap() {
		numBuckets = 10;
		myBucketArray = new ArrayList<>(numBuckets);
		// creating empty array list
		for (int i = 0; i < numBuckets; i++)
			myBucketArray.add(null);
	}

	/**
	 * Returns the value for given key
	 * 
	 */
	@SuppressWarnings("unchecked")
	public v get(k key) {
		int index = getBucketIndex(key);
		LinkedList<k> myLinkedList = myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<k, v> myHashNode = (MyMapNode<k, v>) myLinkedList.search(key);
		return (myHashNode == null) ? null : myHashNode.getValue();
	}

	
	@SuppressWarnings("unchecked")
	public void add(k key, v value) {
		int index = this.getBucketIndex(key);
		LinkedList<k> myLinkedList = myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<k, v> node = (MyMapNode<k, v>) myLinkedList.search(key);
		if (node == null) {
			node = new MyMapNode<>(key, value);
			myLinkedList.append(node);
		} else {
			node.setValue(value);
		}
	}


	private int getBucketIndex(k key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}

	public String toString() {
		return "MyLinkedHashMap List{" + myBucketArray + "}";
	}

} 