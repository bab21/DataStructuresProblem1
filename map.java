package com.capgemini.datastructuresproblem;

public class MyMapNode<K,V>{
	K key;
	V value;
	MyMapNode<K,V> next;
	
	MyMapNode(K key,V value){
		this.key=key;
		this.value=value;
		
	}
	public V getValue() {
		return this.value;
	}
	public K getKey() {
		return this.key;
	}
}
