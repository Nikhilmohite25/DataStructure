package com.DataStructure;

class Node
{
	int data;
	Node next;
}

public class SinglyLinkList {
	
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
	}
	
	public void insertAt(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0)
		{
			insertAtStart(data);
		}
		else
		{
			Node n = head;
			for(int i =0; i<index-1; i++)
			{
				n = n.next;
				
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void show() {
        Node node = head;
        System.out.print("Elements from the Linked List are: \n");
        while (node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println("NULL");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkList obj = new SinglyLinkList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		
		obj.show();
		obj.insertAtStart(9);
		obj.deleteAt(1);
		obj.show();
		

	}

}
