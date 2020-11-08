public class LinkedListImplementation {
	public NodeInf head;
	public NodeInf tail;

	public LinkedListImplementation() {
		this.head = null;
		this.tail = null;
	}

	public void add(NodeInf newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			NodeInf tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(NodeInf newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(NodeInf currentNode, NodeInf newNode) {
		NodeInf tempNode = currentNode.getNext();
		currentNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public NodeInf pop() {
		NodeInf tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public NodeInf popLast() {
		NodeInf tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		NodeInf resultNode = tempNode.getNext();
		tempNode.setNext(null);
		return resultNode;
	}
	
	public void printNodes() {
		StringBuffer nodes = new StringBuffer("Nodes are: ");
		NodeInf tempNode = head;
		while(tempNode.getNext()!= null) {
			nodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				nodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}
}
