import org.junit.Assert;
import org.junit.Test;

public class LinkedListNodeTest {
	@Test
	public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(thirdNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenThreeNumbersWhenAddedToLinkedListShouldNotBeAddedToTop() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(70);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(56);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(thirdNode);
		Assert.assertFalse(result);
	}
}
