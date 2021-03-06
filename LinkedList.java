package com.java.linkedlist;

public class LinkedList{
	Node root;
	int size;
	
	public LinkedList(){
		root = new Node();
		size = 0;
	}

	public void setSize(int s){
		this.size = s;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public Node add(int data){
		Node newNode = new Node(data,root);
		this.root = newNode;
		this.size++;
		return newNode;
	}
	
	public Node find(int data){
		Node thisNode = this.root;
		
		while(thisNode != null){
			if(thisNode.getData() == data){
				return thisNode;
			}
			thisNode = thisNode.getNextNode();
		}		
		return null;
	}
	
	public boolean remove(int data){
		Node thisNode = this.root;
		Node prevNode = null;
		
		while(thisNode != null){
			if(thisNode.getData() == data){
				prevNode.setNextData(thisNode.getNextNode());
				this.setSize(this.getSize() -1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode();
		}
		return false;
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		System.out.println(ll.getSize());
		ll.add(5);
		System.out.println(ll.getSize());
		ll.add(17);
		ll.add(13);
		ll.add(10);
		System.out.println(ll.find(17).getData());
		ll.remove(5);
		System.out.println(ll.getSize());
		System.out.println(ll.find(5));
	}
	
	private class Node{
		private Node nextNode;
		private int data;
		
		private Node(){}
		
		private Node(int val){
			data = val;
		}
		
		private Node(int val,Node next){
			data = val;
			nextNode = next;
		}
		
		private void setData(int val){
			this.data = val;
		}
		
		private int getData(){
			return this.data;
		}
		
		private void setNextData(Node n){
			this.nextNode = n;
		}
		
		private Node getNextNode(){
			return this.nextNode;
		}
	}
}