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

	public NodeInf search(NodeInf node) {
		NodeInf tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
			if(tempNode.getKey().equals(node.getKey()))
				return tempNode;
		}
		if(this.tail.getKey().equals(node.getKey()))
			return this.tail;
		return null;
	}
	
	public void delete(NodeInf node) {
		node.setKey(node.getNext().getKey());    
        node.setNext(node.getNext().getNext());
	}
	
	public int size() {
		int sizeCount = 0;
		NodeInf currentNode = head;
		while(currentNode != null) {
			currentNode = currentNode.getNext();
			sizeCount++;
		}
		return sizeCount;
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
