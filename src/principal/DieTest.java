package principal;

import org.junit.*;
import static org.junit.Assert.*;

public class DieTest {
	@Test
	public void testConstrutorSemParametro() {
		new Die();
		new Die(2);
		new Die(2, 1);
	}
	
	@Test
	public void testRoll() {
		Die die = new Die();
		die.roll();
	}
	
	@Test
	public void testGetNumSides() {
		Die die = new Die();
		die.getNumSides();
	}

	@Test
	public void testGetResult() {
		Die die = new Die();
		die.getResult();
	}
	
	@Test
	public void testEquals() {
		Die die = new Die();
		die.equals(new Die());
	}
	
	@Test
	public void testToString() {
		Die die = new Die();
		die.toString();
	}
}
