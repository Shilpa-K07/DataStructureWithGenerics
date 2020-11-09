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
	
	@Test
	public void givenThreeNumbersWhenAppendedToLinkedListShouldBeAddedToLast() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenThreeNumbersWhenAppendedToLinkedListShouldNotBeAddedToLast() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(thirdNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(firstNode);
		Assert.assertFalse(result);
	}
	
	//UC-4
	@Test
	public void givenThreeNumbersWhenInsertingBetweenShouldPassLinkedListResult() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(thirdNode);
		linkedList.insert(firstNode, secondNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenThreeNumbersWhenInsertingBetweenShouldNotPassLinkedListResult() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(thirdNode);
		linkedList.insert(firstNode, secondNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(thirdNode) &&
				linkedList.head.getNext().equals(secondNode) &&
				linkedList.tail.equals(firstNode);
		Assert.assertFalse(result);
	}
	
	//UC-5
	@Test
	public void givenThreeNumbersWhenPopingShouldReturnFirstElement() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.pop();
		linkedList.printNodes();
		Assert.assertEquals(firstNode, resultNode);
	}
	
	@Test
	public void givenThreeNumbersWhenPopingShouldNotReturnFirstElement() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.pop();
		linkedList.printNodes();
		Assert.assertNotEquals(secondNode, resultNode);
	}
	
	//UC-6
	@Test
	public void givenThreeNumbersWhenPopingLastShouldReturnSame() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.popLast();
		linkedList.printNodes();
		Assert.assertEquals(thirdNode, resultNode);
	}
	
	@Test
	public void givenThreeNumbersWhenPopingLastShouldNotReturnSame() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.popLast();
		linkedList.printNodes();
		Assert.assertNotEquals(firstNode, resultNode);
	}
	
	//UC-7
	@Test
	public void givenThreeNumbersWhenSeachingSecondShouldReturnSame() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.search(secondNode);
		Assert.assertEquals(secondNode, resultNode);
	}
	
	@Test
	public void givenThreeNumbersWhenSeachingSecondShouldNotReturnSame() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		NodeInf resultNode = linkedList.search(secondNode);
		Assert.assertNotEquals(thirdNode, resultNode);
	}
	
	//UC-8
	@Test
	public void givenThreeNumbersWhenInsertingInBetweenShouldPassTest() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(40);
		LinkedListNode<Integer> fourthNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(fourthNode);
		NodeInf resultNode = linkedList.search(secondNode);
		linkedList.insert(resultNode, thirdNode);
		linkedList.printNodes();
		Assert.assertTrue(secondNode.getNext().equals(thirdNode));
	}
	
	@Test
	public void givenThreeNumbersWhenInsertingInBetweenShouldNotPassTest() {
		LinkedListNode<Integer> firstNode = new LinkedListNode<>(56);
		LinkedListNode<Integer> secondNode = new LinkedListNode<>(30);
		LinkedListNode<Integer> thirdNode = new LinkedListNode<>(40);
		LinkedListNode<Integer> fourthNode = new LinkedListNode<>(70);

		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(fourthNode);
		NodeInf resultNode = linkedList.search(secondNode);
		linkedList.insert(resultNode, thirdNode);
		linkedList.printNodes();
		Assert.assertFalse(secondNode.getNext().equals(fourthNode));
	}
}
