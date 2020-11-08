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
