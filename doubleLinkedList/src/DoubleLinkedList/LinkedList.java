package DoubleLinkedList;

import DoubleLinkedList.Node;

//Linked List
class linkedList {
	protected Node head;
	protected Node tail;
	public int size;

	// costruttore
	public linkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	// catena vuota
	public boolean isEmpty() {
		return head == null;
	}

	// lunghezza catena
	public int getSize() {
		return size;
	}

	public Node getFirst() {
		System.out.print("[" + head.getInformation() + " , " + head.getData() + "]");
		return tail.getNext();
	}

	public Node getLast() {
		System.out.print("[" + tail.getInformation() + " , " + tail.getData() + "]");
		return head.getPrev();
	}

	public Node searchPosition(int pos) {
		Node found = head;
		if (isEmpty()) {
			System.out.println("List is empty");
			return null;
		}
		if (pos == 1) {
			return head;
		}
		if (pos == size) {
			return tail;
		}
		for (int i = 2; i <= size; i++) {
			found = found.getNext();
			if (i == pos) {
				System.out.print("[" + found.getInformation() + " , " + found.getData() + "]");

				break;
			}
		}
		return found;
	}

	public Node serachNodeKey(int key) {
		Node found = head;
		if (isEmpty()) {
			System.out.println("List is empty");
			return null;
		}
		for (int i = 0; i <= getSize(); i++) {
			if (i <= size - 1) {
				if (key == found.getData()) {
					System.out.print("[" + found.getInformation() + " , " + found.getData() + "]");

				}
				found = found.getNext();
			}
		}
		return found;
	}

	public Node getDistanceNodeFromHead(int key) {
		Node found = head;
		if (isEmpty()) {
			System.out.println("List is empty");
			return null;
		}
		for (int i = 0; i <= getSize(); i++) {
			if (i <= size - 1) {
				if (key == found.getData()) {
					System.out.print("[" + found.getInformation() + " , " + found.getData() + "]");

				}
				found = found.getNext();
			}

		}
		return found;
	}

	public Node getDistanceNodeToTail(int chiave) {
		Node found = head.getPrev();
		if (isEmpty()) {
			System.out.println("List is empty");
			return null;
		}

		found = found.getNext();

		for (int j = getSize() - 1; j >= 1; j--) {
			if (j >= 1) {
				if (chiave == found.getData()) {
					System.out.print("[" + found.getInformation() + " , " + found.getData() + "]");

				}
				found = found.getPrev();
			}
		}

		return found;

	}

 	public void insertFirst(String information, int key) {
		Node n = new Node(information, key, null, null);
		if (head == null) {
			n.setLinkNext(n);
			n.setLinkPrev(n);
			head = n;
			tail = head;
		} else {
			n.setLinkPrev(tail);
			tail.setLinkNext(n);
			head.setLinkPrev(n);
			n.setLinkNext(head);
			head = n;
		}
		size++;
	}

 	public void insertLast(String information, int key) {
		Node n = new Node(information, key, null, null);
		if (getSize() == 0) {
			n.setLinkNext(n);
			n.setLinkPrev(n);
			head = n;
			tail = head;
		} else {
			n.setLinkPrev(tail);
			tail.setLinkNext(n);
			n.setLinkNext(head);
			head.setLinkPrev(n);
			tail = n;
		}
		size++;
	}

 	public void insertInPosition(String information, int key, int position) {
		Node n = new Node(information, key, null, null);
		if (position == 1) {
			insertFirst(information, key);
			return;
		}
		Node s = head;
		for (int i = 2; i <= size; i++) {
			if (i == position) {
				Node tmp = s.getNext();
				s.setLinkNext(n);
				n.setLinkPrev(s);
				n.setLinkNext(tmp);
				tmp.setLinkPrev(n);
			}
			s = s.getNext();
		}
		size++;
	}

	public void insertAfterHead(String information, int key, int position) {
		position = 2;
		Node n = new Node(information, key, null, null);
		if (head == null) {
			n.setLinkNext(n);
			n.setLinkPrev(n);
			head = n;
			tail = head;
		} else {
			n.setLinkNext(head.getNext());
			n.setLinkPrev(head);
			head.setLinkNext(n);
			head.setLinkPrev(n);
		}
		size++;
	}

 	public void deleteNode(int pos) {
		if (pos == 1) {
			if (size == 1) {
				head = null;
				tail = null;
				size = 0;
				return;
			}
			head = head.getNext();
			head.setLinkPrev(tail);
			tail.setLinkNext(head);
			size--;
			return;
		}
		if (pos == size) {
			tail = tail.getPrev();
			tail.setLinkNext(head);
			head.setLinkPrev(tail);
			size--;
		}
		Node s = head.getNext();
		for (int i = 2; i <= size; i++) {
			if (i == pos) {
				Node p = s.getPrev();
				Node n = s.getNext();
				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			s = s.getNext();
		}
	}

 	public void display() {
		String t = "[";
		String f = "]";
		System.out.print("Double LinkedList\n");
		Node n = head;
		if (size == 0) {
			System.out.print("Its Empty");
			return;
		}
		if (head.getNext() == head) {
			return;
		}
		System.out.print(t + "[" + head.getInformation() + " , " + head.getData() + "]" + " <-> ");
		n = head.getNext();
		while (n.getNext() != head) {
			System.out.print("[" + n.getInformation() + " , " + n.getData() + "]" + " <-> ");
			n = n.getNext();
		}
		System.out.print("[" + n.getInformation() + " , " + n.getData() + "]" + " <-> ");
		n = n.getNext();
		System.out.print("[" + n.getInformation() + " , " + n.getData() + "]" + f);
	}

}