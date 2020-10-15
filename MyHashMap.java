package com.bl.assignment;

public class MyHashMap<K, V> {
	LinkedList<K> myLinkList;

	public MyHashMap() {
		myLinkList = new LinkedList<K>();
	}
	
	@SuppressWarnings({ "unchecked" })
	public V get(K key) {
		MyMapNode<K, V> node = (MyMapNode<K, V>) this.myLinkList.search(key);
		V value;
		if (node == null) {
			value = null;
		} else {
			value = node.getValue();
		}
		return value;
	}
	
	@SuppressWarnings("unchecked")
	public void add(K key, V value) {
		MyMapNode<K, V> node = (MyMapNode<K, V>) this.myLinkList.search(key);
		if (node == null) {
			node = new MyMapNode<>(key, value);
			this.myLinkList.append(node);
		} else {
			node.setValue(value);
		}
	}
	
	
	public String toString() {
		return "MyHashNodes{" + myLinkList + " }";
	}
}
