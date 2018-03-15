package principal;

import org.junit.*;
import static org.junit.Assert.*;

public class SinglyLinkedListImplTest {
	@Test
	public void testConstrutor() {
		new SinglyLinkedListImpl<>();
	}
	
	@Test
	public void testAdd() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.add("Oi");
	}
	
	@Test
	public void testAddAfter() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.add("Luana");
		list.addAfter("Luan", "Luana");
	}
	
	@Test
	public void testAddAfterHeadNull() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.addAfter("Luan", "Luana");
	}

	@Test
	public void testDeleteFront() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.add("Luana");
		list.deleteFront();
	}
	
	@Test
	public void testDeleteFrontHeadNull() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.deleteFront();
	}
	
	@Test
	public void testDeleteAfter() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.add("Luana");
		list.add("Luan");
		list.deleteAfter("Luana");
	}
	
	@Test
	public void testDeleteAfterHeadNull() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.deleteAfter("Luana");
	}
	
	@Test
	public void testTraverse() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		list.add("Luana");
		list.traverse();
	}
	
	@Test
	public void testMain() {
		SinglyLinkedListImpl<String> list = new SinglyLinkedListImpl<>();
		String[] a = {};
		SinglyLinkedListImpl.main(a);
	}
}
