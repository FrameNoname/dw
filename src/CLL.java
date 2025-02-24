//================== CLL class =========================
class CLL {
	// ----------------------- Node --------------------
	private class Node {
		private int element;
		private Node next;

		// constructor
		public Node(int data) {
			element = data;
			next = null;
		}

		// link a new node to this node
		public void link(Node newNode) {
			next = newNode;
		}

		// return next node
		public Node getNextNode() {
			return next;
		}

		// return element of this node
		public int getElement() {
			return element;
		}
	}
	// --------------------- End Node --------------------
 // CLL properties and methods 
 private Node tail = null; 
 private int size = 0; // SLL's size 
 
 public void addFirst(int data) { 
  Node newNode = new Node(data); 
        if(size == 0) { 
            tail = newNode; 
            tail.link(tail); 
        } else { 
            newNode.link(tail.getNextNode()); 
            tail.link(newNode); 
        } 
        size++; 
 } 
 
 public void addLast(int data) { 
       addFirst(data); 
       tail = tail.getNextNode(); 
 
 } 
 
 public void removeFirst() { 
       if(size == 1) { 
            tail = null; 
            size--; 
        } else if(size > 1) { 
            tail.link(tail.getNextNode().getNextNode()); 
            size--; 
        } 
 } 
 
       public void removeLast() { 
       if(size == 1) { 
            tail = null; 
            size--; 
        } else if(size > 1) { 
            Node p = tail; 
            while(p.getNextNode() != tail){ 
                p = p.getNextNode(); 
            } 
            p.link(tail.getNextNode()); 
            tail = p; 
            size--; 
        } 
 
 
  
 
       } 
 
 public void rotate() { 
       if(size > 1) { 
            tail = tail.getNextNode(); 
        } 
 
 
 
 } 
 
 public void print() { 
       if(size == 0) { 
            System.out.println("Empty linked list"); 
        } else { 
            for (Node p = tail.getNextNode(); p != tail; p =  
p.getNextNode()) { 
                System.out.print("->" + p.getElement()); 
            } 
            System.out.println("->" + tail.getElement()); 
        } 
 
 
 
 
 } 
} 
 