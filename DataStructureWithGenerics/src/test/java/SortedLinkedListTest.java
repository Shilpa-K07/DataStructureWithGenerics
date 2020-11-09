import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest {
	@Test
	public void givenThreeNumbersWhenAddedShouldBeSorted() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(40);
		LinkedListNode<Integer> fourthNode = new LinkedListNode<>(70);

		SortedLinkedList linkedList = new SortedLinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.add(fourthNode);
		linkedList.printNodes();
		
		boolean result = linkedList.head.equals(secondNode) && 
				linkedList.head.getNext().equals(thirdNode) &&
				linkedList.head.getNext().getNext().equals(firstNode) &&
				linkedList.head.getNext().getNext().getNext().equals(fourthNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenThreeNumbersWhenAddedShouldNotBeSorted() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(40);
		LinkedListNode<Integer> fourthNode = new LinkedListNode<>(70);

		SortedLinkedList linkedList = new SortedLinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.add(fourthNode);
		linkedList.printNodes();
		
		boolean result = linkedList.head.equals(firstNode) && 
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.head.getNext().getNext().equals(thirdNode) &&
				linkedList.head.getNext().getNext().getNext().equals(fourthNode);
		Assert.assertFalse(result);
	}
}
