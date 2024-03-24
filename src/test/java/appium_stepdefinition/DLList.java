package appium_stepdefinition;

public class DLList {

	//perform doubly linked list operations in java
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Original list: " + list);
		list.remove(3);
		System.out.println("After removing 3: " + list);
		list.add(5);
		System.out.println("After adding 5: " + list);
		list.remove(1);
		System.out.println("After removing 1: " + list);
	}
}

//create a class DoublyLinkedList
class DoublyLinkedList {
	Node head;

	// add a node to the list
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	// remove a node from the list
	public void remove(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				if (temp.prev == null) {
					head = temp.next;
				} else {
					temp.prev.next = temp.next;
				}
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}
				break;
			}
			temp = temp.next;
		}
	}

	// override toString method to print the list
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = head;
		while (temp != null) {
			sb.append(temp.data).append(" ");
			temp = temp.next;
		}
		return sb.toString();
	}
}

//create a class Node
class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}
