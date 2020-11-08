import org.junit.Assert;
import org.junit.Test;

public class LinkedListNodeTest {
	@Test
	public void givenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
		LinkedListNode firstNode = new LinkedListNode<Integer>(56);
		LinkedListNode secondNode = new LinkedListNode<Integer>(30);
		LinkedListNode thirdNode = new LinkedListNode<Integer>(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && 
				secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}
}
