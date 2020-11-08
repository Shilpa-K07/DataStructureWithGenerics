public class LinkedListNode<K> {
	private K key;
	private LinkedListNode next;

	LinkedListNode(K key){
		this.key = null;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}
