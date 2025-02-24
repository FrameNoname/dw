class SLL {
    private class Node {
        private int element;
        private Node next;

        public Node(int data) {
            element = data;
            next = null;
        }

        public void link(Node newNode) {
            next = newNode;
        }

        public Node getNextNode() {
            return next;
        }

        public int getElement() {
            return element;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

	public void addFirst(int data) {
		
		// create new node 
	Node newNode = new Node(data); 
		if (size == 0) { 
	tail = newNode; 
		} else { 
	newNode.link(head); 
		} 
	head = newNode; 
		 size++; 
	}


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
        } else {
            tail.link(newNode);
        }
        tail = newNode;
        size++;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Empty linked list");
        } else {
            for (Node p = head; p != null; p = p.getNextNode()) {
                System.out.print(p.getElement() + "->");
            }
            System.out.println("null");
        }
    }

    // ** Find element in the list **
    public boolean findElement(int data) {
        Node p = head;
        while (p != null) {
            if (p.getElement() == data) {
                return true;
            }
            p = p.getNextNode();
        }
        return false;
    }

    // ** Count occurrences of an element **
    public int countElement(int data) {
        int count = 0;
        Node p = head;
        while (p != null) {
            if (p.getElement() == data) {
                count++;
            }
            p = p.getNextNode();
        }
        return count;
    }

    // ** Sum all elements in the list **
    public int sumElement() {
        int sum = 0;
        Node p = head;
        while (p != null) {
            sum += p.getElement();
            p = p.getNextNode();
        }
        return sum;
    }
}
