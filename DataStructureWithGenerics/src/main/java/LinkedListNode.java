public class LinkedListNode<K> implements NodeInf<K> {
	private K key;
	private NodeInf next;

	LinkedListNode(K key){
		this.key = key;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public NodeInf getNext() {
		return next;
	}

	@Override
	public void setNext(NodeInf next) {
		this.next = next;
	}
}
