public class SortedLinkedList {
	public NodeInf head;
	public NodeInf tail;
	
	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public  <T extends Comparable<T>> void add(NodeInf newNode) {
		NodeInf currentNode = head;
		NodeInf previousNode = null;
		while(currentNode != null && (( (Comparable<T>) newNode.getKey()).compareTo((T) currentNode.getKey())) > 0){
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		    }
		if(previousNode == null){
		      head = newNode;
		    }else{
		    	previousNode.setNext(newNode);
		    }
		newNode.setNext(currentNode);
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
